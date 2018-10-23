package xin.jerome.configuration.autoconfigure.condition;

import org.springframework.context.annotation.Conditional;
import xin.jerome.configuration.autoconfigure.condition.OnSystemPropertyCondition;

import java.lang.annotation.*;

/**
 * Java 系统条件判断
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:33
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {


    String name();

    String value();
}
