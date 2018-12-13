package xin.jerome.autoconfigure.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 根据系统环境条件判断是否装配Bean
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:33
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * system property key
     */
    String key();

    /**
     * system property key
     */
    String value();
}
