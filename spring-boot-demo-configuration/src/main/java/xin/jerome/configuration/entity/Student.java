package xin.jerome.configuration.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 学生类
 *
 * @author Jerome Zhu
 * @since 2018.12.11 22:47
 */
@ConfigurationProperties("student")
@Component
public class Student {

    private String name;

    private Integer mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}


