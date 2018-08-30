package xin.jerome.validation.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import xin.jerome.validation.domain.User;

/**
 * {@link User} {@link Validator}
 *
 * @author Jerome Zhu
 * @since 2018.08.30 16:45
 */
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = User.class.cast(target);

        String name = user.getName();

        if(!StringUtils.hasLength(name)) {
            errors.reject("10000","姓名不允许为空！");
        }
    }
}
