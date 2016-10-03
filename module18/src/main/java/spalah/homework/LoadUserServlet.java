package spalah.homework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.courses.spalah.homework.Person;

/**
 * Created by Stanislav Pugach on 26.09.2016.
 */
public class LoadUserServlet extends HttpServlet {
    Person person;

    public LoadUserServlet() {
        person = new Person();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("id");
        person.load(Integer.parseInt(userId));
    }
}
