package xin.jerome.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring {@link SpringBootApplication} 启动解析
 *      常规启动
 *
 * @author Jerome Zhu
 * @since 2018.10.24 11:17
 */
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
