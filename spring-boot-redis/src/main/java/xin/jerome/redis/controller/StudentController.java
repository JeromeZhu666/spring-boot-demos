package xin.jerome.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.jerome.redis.entity.Student;
import xin.jerome.redis.repository.StudentRepository;

/**
 * 学生缓存控制器
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:52
 */
@RestController
@RequestMapping("/redis")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student save(@RequestBody Student student) {
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

}
