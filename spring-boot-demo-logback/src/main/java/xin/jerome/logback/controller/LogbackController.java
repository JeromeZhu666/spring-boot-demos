package xin.jerome.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志控制器
 *
 * @author Jerome Zhu
 * @since 2018.09.13 17:39
 */
@RestController
public class LogbackController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/logback/{msg}")
    public String getMsg(@PathVariable String msg) {
        return "request msg : " + msg;
    }

}
