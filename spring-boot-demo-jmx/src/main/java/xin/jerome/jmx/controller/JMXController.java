package xin.jerome.jmx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.jmx.spring.SimpleBean;

/**
 * TODO Comment
 *
 * @author Jerome Zhu
 * @since 2018.09.20 15:41
 */
@RestController
public class JMXController {

    @Autowired
    private SimpleBean simpleBean;

    @GetMapping("/jmx/simple-bean")
    public SimpleBean setSimpleBean(@RequestBody SimpleBean simpleBean) {
        return simpleBean;
    }
}
