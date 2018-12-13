package xin.jerome.autoconfigure.annotation;

import org.springframework.context.annotation.Import;
import xin.jerome.autoconfigure.configuration.HelloConfiguration;

import java.lang.annotation.*;

/**
 * 激活Hello模块配置
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloConfiguration.class) // 模块装配：注解驱动实现
public @interface EnableHello {
}
