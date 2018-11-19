package xin.jerome.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Hello {@link Controller}
 *
 * @author Jerome Zhu
 * @since 2018.11.19 17:04
 */
@Controller
public class HelloController {

    @ModelAttribute("message")
    public String message() {
        return "Hello Jerome";
    }

    @GetMapping("/hello")
    public String hello() {
        return "template";
    }
}
