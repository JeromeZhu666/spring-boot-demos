package xin.jerome.validation.commons;

import org.apache.commons.validator.routines.IntegerValidator;

/**
 * apache commons-validator 的演示
 *
 * @author Jerome Zhu
 * @since 2018.08.30 16:23
 */
public class ApacheCommonsValidator {

    public static void main(String[] args) {
        IntegerValidator validator = new IntegerValidator();

        Integer integer = validator.validate("aa");
        System.out.println(integer);

        integer = validator.validate("2018");
        System.out.println(integer);
    }
}
