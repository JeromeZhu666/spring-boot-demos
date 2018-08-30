package xin.jerome.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 检测人名的前缀
 *
 * @author Jerome Zhu
 * @since 2018.08.30 18:04
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {UserNamePrefixConstraintValidator.class})
public @interface UserNamePrefix {

    String message() default "name prefix must {prefix}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String prefix() default "student-";
}
