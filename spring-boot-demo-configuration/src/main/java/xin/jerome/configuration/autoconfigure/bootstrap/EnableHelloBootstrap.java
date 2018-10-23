package xin.jerome.configuration.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import xin.jerome.configuration.autoconfigure.annotation.EnableHello;

/**
 * 验证手动自定义 {@link EnableHello} 模块化装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:39
 */
@EnableHello
public class EnableHelloBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloBean = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + helloBean);

        context.close();
    }
}
