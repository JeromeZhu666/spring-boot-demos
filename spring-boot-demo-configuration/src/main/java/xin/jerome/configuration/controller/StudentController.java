package xin.jerome.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.configuration.entity.Student;

/**
 * {@link Student} 的{@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.12.11 22:48
 */
@RestController
public class StudentController {

    @Autowired
    private Student student;

    @GetMapping("/student")
    public Student getStudent() {
        return student;
    }

}
