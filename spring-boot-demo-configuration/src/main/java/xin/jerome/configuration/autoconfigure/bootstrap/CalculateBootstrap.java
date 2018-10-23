package xin.jerome.configuration.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import xin.jerome.configuration.autoconfigure.service.CalculateService;

/**
 * 验证手动实现基于注解{@link Profile}的条件装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:08
 */
@SpringBootApplication(scanBasePackages = "xin.jerome.configuration.autoconfigure.service")
public class CalculateBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println("sum(1...9):"+ calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // 关闭上下文
        context.close();
    }
}
