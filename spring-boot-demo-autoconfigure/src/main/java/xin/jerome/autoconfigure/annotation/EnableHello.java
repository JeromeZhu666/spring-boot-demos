package xin.jerome.autoconfigure.annotation;

import org.springframework.context.annotation.Import;
import xin.jerome.autoconfigure.configuration.HelloConfiguration;

import java.lang.annotation.*;

/**
 * 模块自动装配
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloConfiguration.class) // 模块自动装配：注解驱动实现
//@Import(HelloImportSelector.class) // 模块自动装配：接口驱动实现 优点可选bean
public @interface EnableHello {
}
