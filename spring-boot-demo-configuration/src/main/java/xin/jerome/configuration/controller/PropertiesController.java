package xin.jerome.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 加载properties文件中的属性的 {@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.12.11 21:55
 */
@RestController
public class PropertiesController implements EnvironmentAware{

    @Value("${properties.id}")
    private Integer id;

    @Value("${properties.name:jerome}")
    private String name;

    private Integer age;

    @Value("${properties.mark}")
    private Integer mark;

    @GetMapping("/properties")
    public Map<String, Object> getProperties() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("age", age);
        map.put("mark", mark);
        return map;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.age = environment.getProperty("properties.age", Integer.class);
    }
}
