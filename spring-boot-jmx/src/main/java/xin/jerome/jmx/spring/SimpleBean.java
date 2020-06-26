package xin.jerome.jmx.spring;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * SimpleBean
 *
 * @author Jerome Zhu
 * @since 2018.09.20 15:27
 */
@ManagedResource(
        objectName = "xin.jerome.jmx.spring:type=SimpleBean",
        description = "spring 托管的 Bean"
)
@Component
public class SimpleBean {

    private Long id;
    private String name;

    @ManagedAttribute(description = "name 属性")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManagedAttribute(description = "name 属性")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManagedOperation(description = "display 操作")
    public String display() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
