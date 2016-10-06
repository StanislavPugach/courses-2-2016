package spalah.homework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.courses.spalah.homework.Person;

/**
 * Created by Stanislav Pugach on 26.09.2016.
 */
public class LoadUserServlet extends HttpServlet {
    Person person;

    public LoadUserServlet() {
        init();
        person = new Person();
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
        Person person = new Person();
        String userId = req.getParameter("id");
        person.load(Integer.parseInt(userId));
        
    }
}
