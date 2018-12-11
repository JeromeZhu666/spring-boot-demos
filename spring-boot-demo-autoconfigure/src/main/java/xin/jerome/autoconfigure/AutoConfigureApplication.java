package xin.jerome.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 *  spring 自动配置相关的Demo
 *
 * @author Jerome Zhu
 * @since 2018.09.21 14:44
 */
@SpringBootApplication
public class AutoConfigureApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigureApplication.class, args);
    }
}
