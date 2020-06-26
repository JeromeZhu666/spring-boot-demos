package xin.jerome.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.jerome.cache.entity.Student;
import xin.jerome.cache.repository.StudentRepository;

/**
 * 学生缓存控制器
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:18
 */
@RestController
@RequestMapping("/cache")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student save(@RequestBody Student student) {
        studentRepository.saveStudent(student);
        return student;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable String id) {
        return studentRepository.findStudent(id);
    }
}
