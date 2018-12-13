package xin.jerome.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * 基于{@link Profile} 实现条件配置
 *
 * @author Jerome Zhu
 * @since 2018.12.12 17:17
 */
public class ProfilesBootstrap {

    @Bean(name = "hello")
    @Profile("prod")
    public String prodHello() {
        System.out.println("profiles: prod");
        return "hello jerome, this is prod.";
    }

    @Bean(name = "hello")
    @Profile("test")
    public String testHello() {
        System.out.println("profiles: test");
        return "hello jerome, this is test.";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProfilesBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("test")
                .run(args);
        String helloBean = context.getBean("hello", String.class);
        System.out.println("hello Bean: " + helloBean);
        context.close();
    }

}
