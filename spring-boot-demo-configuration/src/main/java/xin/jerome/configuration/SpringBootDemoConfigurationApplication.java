package xin.jerome.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 *  spring 配置相关的Demo
 *
 * @author Jerome Zhu
 * @since 2018.09.21 14:44
 */
@SpringBootApplication
@ImportResource({
        "META-INF/spring/context.xml",
        "META-INF/spring/context-test.xml",
        "META-INF/spring/context-prod.xml"
})
public class SpringBootDemoConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootDemoConfigurationApplication.class);
        application.setAdditionalProfiles("prod");
        application.run(args);
    }
}
