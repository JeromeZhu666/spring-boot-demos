package xin.jerome.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import xin.jerome.autoconfigure.condition.ConditionalOnSystemProperty;

/**
 * 验证自定义基于编程{@link Condition}方式的条件装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:40
 */
public class ConditionBootstrap {

    @Bean("hello")
    @ConditionalOnSystemProperty(key = "user.name", value = "user")
    public String userHello() {
        return "hello user !";
    }

    @Bean("hello")
    @ConditionalOnSystemProperty(key = "user.name", value = "jerome")
    public String jeromeHello() {
        return "hello jerome !";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloBean = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + helloBean);

        context.close();
    }

}
