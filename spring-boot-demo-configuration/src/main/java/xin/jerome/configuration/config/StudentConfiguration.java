package xin.jerome.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import xin.jerome.configuration.domain.Student;

/**
 * 配置
 *
 * @author Jerome Zhu
 * @since 2018.09.21 16:34
 */
@Configuration
public class StudentConfiguration {

    @Bean
    @Profile("test")
    public Student student() {
        Student student = new Student();

        return student;
    }

}
