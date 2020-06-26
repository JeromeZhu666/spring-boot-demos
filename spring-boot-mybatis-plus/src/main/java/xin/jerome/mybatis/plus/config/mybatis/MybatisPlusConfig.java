package xin.jerome.mybatis.plus.config.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus 配置类
 *
 * @author JeromeSoar
 * @since 2020年 06月 26日 14:10
 */
@Configuration
@MapperScan("xin.jerome.mybatis.plus.mapper.**")
public class MybatisPlusConfig {

    /**
     * mybatis-plus 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDbType(DbType.MYSQL);
        return page;
    }

    /**
     * mybatis-plus 字段自动填充
     */
    @Bean
    public MetaObjectHandler metaObjectHandler() {
        return new MyBatisPlusFiledAutoFillHandler();
    }
}

