package xin.jerome.configuration.entity;

/**
 * Xml 配置文件对应的实体
 *
 * @author Jerome Zhu
 * @since 2018.12.11 21:48
 */
public class XmlBean {

    private Integer id;

    private String name;

    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
