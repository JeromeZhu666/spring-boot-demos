package xin.jerome.application.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * 配置类 + {@link SpringApplication}#setSources 启动项目
 *      {@link SpringApplication}#deduceMainApplicationClass -> 根据stackTraceElement.getMethodName()
 *          来推断出启动应用的main方法所在的class
 *      {@link SpringApplication}#SpringApplication(ResourceLoader resourceLoader, Class<?>... primarySources)
 *          -> {@link WebApplicationType} #deduceFromClasspath  在应用初始化的时候推断 web 应用的类型
 *
 * @author Jerome Zhu
 * @since 2018.10.24 11:31
 */
public class ConfigurationBootApplication {

    public static void main(String[] args) {
        Set<String> sources = new HashSet<>();
        // 添加配置Class名称
        sources.add(ApplicationConfiguration.class.getName());

        SpringApplication springApplication = new SpringApplication();
        // A source can be: a class name, package name, or an XML resource location.
        springApplication.setSources(sources);
        ConfigurableApplicationContext context = springApplication.run(args);

        /* 检查 web 环境
         * org.springframework.boot.WebApplicationType #deduceFromClasspath  or  #deduceFromApplicationContext
         * 在 org.springframework.boot.SpringApplication 初始化的时候 在2.0.6.RELEASE 会根据上面的方法去推断web环境
         */
        System.out.println(springApplication.getWebApplicationType());

        // 检查是否作为Bean注入
        System.out.println("Boot Bean :" + context.getBean(ApplicationConfiguration.class));

    }

    @SpringBootApplication
    public static class ApplicationConfiguration {
    }

}
