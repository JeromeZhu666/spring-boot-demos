package xin.jerome.redis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import xin.jerome.redis.entity.Student;

/**
 * {@link StudentRepository}的实现类
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:56
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository{

    @Autowired
    private RedisTemplate<String, Student> redisTemplate;

    @Override
    public Student findById(String id) {
        return redisTemplate.opsForValue().get(id);
    }

    @Override
    public boolean save(Student student) {
        redisTemplate.opsForValue().set(student.getId(), student);
        return true;
    }
}
