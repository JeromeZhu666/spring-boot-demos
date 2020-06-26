package xin.jerome.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * {@link UserNamePrefix} {@link ConstraintValidator}
 *
 * @author Jerome Zhu
 * @since 2018.08.30 18:03
 */
public class UserNamePrefixConstraintValidator implements ConstraintValidator<UserNamePrefix, String> {

    private String prefix;

    @Override
    public void initialize(UserNamePrefix constraintAnnotation) {
        this.prefix = constraintAnnotation.prefix();
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {

        if (!name.startsWith(prefix)) {

            context.disableDefaultConstraintViolation();

            ConstraintValidatorContext.ConstraintViolationBuilder builder =
                    context.buildConstraintViolationWithTemplate("name prefix must \"" + prefix + "\"start！");
            builder.addConstraintViolation();

            return false;
        }

        return true;
    }
}
