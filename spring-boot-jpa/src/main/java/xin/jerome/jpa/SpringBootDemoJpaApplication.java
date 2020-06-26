package xin.jerome.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 启动类
 *
 * @author Jerome Zhu
 * @since 2018.08.29 17:34
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"xin.jerome.jpa.entity.*"})
public class SpringBootDemoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoJpaApplication.class);
    }
}
