package spalah.homework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.courses.spalah.homework.DataManage;
import com.courses.spalah.homework.Person;
import com.courses.spalah.homework.PersonManageDB;

/**
 * Created by Stanislav Pugach on 26.09.2016.
 */
public class LoadUserServlet extends HttpServlet {
    private Person person;
    private DataManage<Person> personDataManage;

    public LoadUserServlet() {
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("id");
        person = personDataManage.load(Integer.parseInt(userId));
        resp.getWriter().write("<html><body>"+ person.getFirstName() +"</body></html>");
    }

}
