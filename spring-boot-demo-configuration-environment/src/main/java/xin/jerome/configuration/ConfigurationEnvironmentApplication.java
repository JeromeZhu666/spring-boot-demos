package xin.jerome.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 多环境配置文件的启动器
 *
 * @author Jerome Zhu
 * @since 2018.11.19 11:10
 */
@SpringBootApplication
public class ConfigurationEnvironmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationEnvironmentApplication.class, args);
    }

}
