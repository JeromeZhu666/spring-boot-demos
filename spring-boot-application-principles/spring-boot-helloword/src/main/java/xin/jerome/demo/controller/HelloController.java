package xin.jerome.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello{@link RestController}
 *
 * @author Jerome Zhu
 */
@RestController
public class HelloController {

    @GetMapping("")
    public String sayHello() {
        return "Hello Jerome !";
    }

}
