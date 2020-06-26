package xin.jerome.autoconfigure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello模块的配置
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:30
 */
@Configuration
public class HelloJeromeConfiguration {

    @Bean
    public String hello() { // method key is bean key
        System.out.println("Bean : hello is loading.");
        return "hello jerome !";
    }

}
