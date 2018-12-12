package xin.jerome.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 *  SpringBoot 配置相关的Demo
 *
 * @author Jerome Zhu
 * @since 2018.09.21 14:44
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring/context.xml"})
public class ConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationApplication.class, args);
    }
}
