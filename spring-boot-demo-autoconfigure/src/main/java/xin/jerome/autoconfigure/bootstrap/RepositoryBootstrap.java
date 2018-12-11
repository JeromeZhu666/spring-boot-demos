package xin.jerome.autoconfigure.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import xin.jerome.autoconfigure.annotation.MyFirstRepository;
import xin.jerome.autoconfigure.annotation.MySecondRepository;
import xin.jerome.autoconfigure.repository.MyRepositoryOne;
import xin.jerome.autoconfigure.repository.MyRepositoryTwo;

/**
 * 验证手动方式实现自定义注解{@link MyFirstRepository} 和 {@link MySecondRepository}装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 15:45
 */
@ComponentScan(basePackages = "xin.jerome.autoconfigure.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        /*
         测试bean是否被自动装配成功，如果不存在bean name 会报错：
         org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'XXXX' available
        */
        MyRepositoryOne myFirstRepository = context.getBean("myFirstRepository", MyRepositoryOne.class);
        MyRepositoryTwo mySecondRepository = context.getBean("mySecondRepository", MyRepositoryTwo.class);

        // 关闭上下文
        context.close();
    }

}
