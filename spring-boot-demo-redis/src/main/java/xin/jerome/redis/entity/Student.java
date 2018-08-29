package xin.jerome.redis.entity;

/**
 * 学生类
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:53
 */
public class Student {

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
