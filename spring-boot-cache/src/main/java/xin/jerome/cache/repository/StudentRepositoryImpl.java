package xin.jerome.cache.repository;

import org.springframework.stereotype.Repository;
import xin.jerome.cache.entity.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link StudentRepository}实现
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:10
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final Map<String, Student> repository = new HashMap<>();

    @Override
    public Student findStudent(String id) {
        return repository.get(id);
    }

    @Override
    public boolean saveStudent(Student student) {
        return repository.putIfAbsent(student.getId(), student) == null;
    }
}
