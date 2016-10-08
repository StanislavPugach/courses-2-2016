package spalah.homework;

import com.courses.spalah.homework.DataManage;
import com.courses.spalah.homework.Person;
import com.courses.spalah.homework.PersonManageDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Stanislav Pugach on 07.10.2016.
 */
public class SaveUserServlet extends HttpServlet {
    private Person person;
    private DataManage<Person> personDataManage;

    public SaveUserServlet() {
        init();
        person = new Person();
        personDataManage = new PersonManageDB();
    }

    @Override
    public void init() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> parameters = getParameters(req.getReader());
        person.setFirstName(getValue("firstName",parameters));
        person.setLastName(getValue("lastName", parameters));
        person.setAddress(getValue("address", parameters));
        personDataManage.save(person);
    }


    private List<String> getParameters(BufferedReader reader) throws IOException {
        String line;
        List<String> parameters = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            parameters.add(line);
        }
        return parameters;
    }


    private String getValue(String key, List<String> parameters) throws IOException {
        String result = "";
        Iterator<String> iterator = parameters.iterator();
         while (iterator.hasNext()){
             if (iterator.next().contains(key)){
                 iterator.next();
                 result = iterator.next();
             }
         }

        return result;
    }
}
