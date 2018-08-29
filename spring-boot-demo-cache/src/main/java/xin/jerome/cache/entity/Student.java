package xin.jerome.cache.entity;

import java.io.Serializable;

/**
 * 学生
 *
 * @author Jerome Zhu
 * @since 2018.08.29 13:32
 */
public class Student implements Serializable {

    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
