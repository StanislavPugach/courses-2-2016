package spalah;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ievgen Tararaka
 */
@Controller
public class JsonExampleController {
    @RequestMapping(value = "/response")
    @ResponseBody
    public Response getResponse() {
        return new Response();
    }
}

class Response {
    private long responseId;
    private List<Integer> numbers;
    private Nested nested;

    public Response() {
        Random r = new Random();
        responseId = r.nextInt(10);
        numbers = Arrays.asList(r.nextInt(10), r.nextInt(10), r.nextInt(10));
        nested = new Nested();
        nested.setToken("dasdasdas");
    }

    public long getResponseId() {
        return responseId;
    }

    public void setResponseId(long responseId) {
        this.responseId = responseId;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }
}

class Nested {
    private String token;

    public Nested() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
