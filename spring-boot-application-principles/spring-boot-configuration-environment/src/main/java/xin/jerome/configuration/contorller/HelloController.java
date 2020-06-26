package xin.jerome.configuration.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取环境配置{@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.11.19 11:22
 */
@RestController
public class HelloController {

    @Value("${constant.environment}")
    private String environment;

    @GetMapping("/env")
    public String getEnvironment() {
        return "Hello Jerome, This environment is " + environment;
    }

}
