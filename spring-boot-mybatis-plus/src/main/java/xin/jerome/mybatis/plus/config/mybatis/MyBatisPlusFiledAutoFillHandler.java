package xin.jerome.mybatis.plus.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * MybatisPlus 字段自动填充配置
 *
 * @author JeromeSoar
 * @since 2020年 06月 26日 14:10
 */
public class MyBatisPlusFiledAutoFillHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        String userId = "your current login user id.";
        setFieldValByName("createUser", userId, metaObject);
        setFieldValByName("createTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String userId = "your current login user id.";
        setFieldValByName("updateUser", userId, metaObject);
        setFieldValByName("updateTime", new Date(), metaObject);
    }
}
