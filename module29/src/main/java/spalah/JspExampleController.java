package spalah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ievgen Tararaka
 */
@Controller
public class JspExampleController {
    @RequestMapping(value = "/hello")
    public String helloJsp() {
        return "hello";
    }
}
