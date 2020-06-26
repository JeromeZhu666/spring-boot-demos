package xin.jerome.mybatis.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;
import xin.jerome.mybatis.entity.User;

import java.io.Reader;

/**
 * 基于Xml配置的方式
 *
 * @author Jerome Zhu
 * @since 2018.08.29 17:59
 */
public class XmlConfigDemo {

    public static void main(String[] args) throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/mybatis/mybatis-config.xml");
        EncodedResource encodedResource = new EncodedResource(resource, "UTF-8");
        Reader reader = encodedResource.getReader();

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(reader, "development");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("selectOneUser", 1);
        System.out.println(user);
        sqlSession.close();


    }
}
