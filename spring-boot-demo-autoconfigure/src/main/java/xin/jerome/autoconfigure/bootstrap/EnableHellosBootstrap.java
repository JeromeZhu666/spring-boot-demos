package xin.jerome.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import xin.jerome.autoconfigure.annotation.EnableHellos;

/**
 * 验证自定义 {@link EnableHellos} 模块化装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:39
 */
@EnableHellos
public class EnableHellosBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHellosBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloBean = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + helloBean);
        context.close();
    }
}
