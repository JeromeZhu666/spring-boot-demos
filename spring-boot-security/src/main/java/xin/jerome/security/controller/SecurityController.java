package xin.jerome.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 安全的Controller
 *
 * @author Jerome Zhu
 * @since 2018.08.31 15:41
 */
@Controller
public class SecurityController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
