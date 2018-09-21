package xin.jerome.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.configuration.domain.Student;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * {@link Student} {@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.09.21 14:57
 */
@RestController
public class StudentController implements EnvironmentAware {

    @Autowired
    @Qualifier("student")
    private Student student;

    @Value("${student.id}")
    private Integer id;

    @Value("${student.name}")
    private String name;

    @Value("${student.age:17}")
    private Integer age;

    private Integer mark;

    @GetMapping("/student")
    public Student getOneStudent() {
        return student;
    }

    @GetMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("id", id);
        map.put("name", name);
        map.put("age", age);
        map.put("mark", mark);

        return map;
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.mark = environment.getProperty("student.mark", Integer.class);
    }
}
