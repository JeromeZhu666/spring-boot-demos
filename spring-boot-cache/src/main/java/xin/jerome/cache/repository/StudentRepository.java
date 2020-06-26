package xin.jerome.cache.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.NoRepositoryBean;
import xin.jerome.cache.entity.Student;

/**
 * 学生仓库
 *
 * @author Jerome Zhu
 * @since 2018.08.29 13:35
 */
@NoRepositoryBean
public interface StudentRepository {

    @Cacheable(cacheNames = {"students"})
    Student findStudent(String id);

    boolean saveStudent(Student student);
}
