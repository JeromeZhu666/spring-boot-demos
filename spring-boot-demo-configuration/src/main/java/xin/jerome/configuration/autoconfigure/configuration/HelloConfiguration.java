package xin.jerome.configuration.autoconfigure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello 的配置
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:30
 */
@Configuration
public class HelloConfiguration {

    @Bean
    public String hello() { // method name is bean name
        return "hello word !";
    }

}
