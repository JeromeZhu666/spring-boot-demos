package xin.jerome.validation.domain;

import xin.jerome.validation.constraints.UserNamePrefix;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 用户对象
 *
 * @author Jerome Zhu
 * @since 2018.08.30 16:42
 */
public class User {

    @NotNull
    @UserNamePrefix(prefix = "student-")
    private String name;

    @Min(value = 0)
    @Max(value = 200)
    private int age;

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
