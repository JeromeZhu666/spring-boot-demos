package xin.jerome.application.bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * {@link SpringApplicationBuilder} 作为启动项
 *
 * @author Jerome Zhu
 * @since 2018.10.24 11:26
 */
@SpringBootApplication
public class SpringApplicationBuilderBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringApplicationBuilderBootApplication.class)
                .run(args);
    }

}
