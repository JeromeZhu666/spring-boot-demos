package xin.jerome.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 使用spring boot 的自动装配
 *      {@link EnableAutoConfiguration} -> MATA-INF/spring.factories 取到相应的配置
 *
 * @author Jerome Zhu
 * @since 2018.10.24 09:36
 */
@EnableAutoConfiguration
public class EnableHelloAutoConfigurationBootstrap {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloBean = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + helloBean);
        String sayHelloBean = context.getBean("sayHello", String.class);
        System.out.println("sayHello Bean: " + sayHelloBean);
        context.close();
    }
}
