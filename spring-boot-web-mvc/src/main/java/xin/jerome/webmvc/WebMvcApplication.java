package xin.jerome.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动器
 *
 * @author Jerome Zhu
 * @since 2018.11.13 09:50
 */
@SpringBootApplication
public class WebMvcApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebMvcApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication.class, args);
    }
}
