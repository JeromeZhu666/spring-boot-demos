package xin.jerome.configuration.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * book类
 *
 * @author Jerome Zhu
 * @since 2018.09.21 17:46
 */
@ConfigurationProperties("book")
public class Book {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
