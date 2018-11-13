package xin.jerome.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * hello jerome {@link Controller}
 *
 * @author Jerome Zhu
 * @since 2018.11.13 09:55
 */
@Controller
public class HelloJeromeController {

    @GetMapping("")
    public String getIndex(Model model) {
        model.addAttribute("message", "hello jerome");
        return "index";
    }

}
