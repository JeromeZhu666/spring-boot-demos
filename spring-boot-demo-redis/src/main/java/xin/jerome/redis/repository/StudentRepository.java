package xin.jerome.redis.repository;

import org.springframework.data.repository.NoRepositoryBean;
import xin.jerome.redis.entity.Student;

/**
 * 学生仓储
 *
 * @author Jerome Zhu
 * @since 2018.08.29 14:54
 */
@NoRepositoryBean
public interface StudentRepository {

    Student findById(String id);

    boolean save(Student student);

}
