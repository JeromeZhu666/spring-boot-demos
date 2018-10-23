package xin.jerome.configuration.autoconfigure.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 自定义自动装配注解(模式注解) 继承{@link Repository}
 *
 * @author Jerome Zhu
 * @since 2018.10.23 15:42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repository
public @interface MyFirstRepository {

    String value() default "";

}
