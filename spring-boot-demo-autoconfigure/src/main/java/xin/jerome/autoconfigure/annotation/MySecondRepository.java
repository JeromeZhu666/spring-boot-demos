package xin.jerome.autoconfigure.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 自定义自动装配注解  继承{@link Component}
 *
 * @author Jerome Zhu
 * @since 2018.10.23 15:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MySecondRepository {

    String value() default "";
}
