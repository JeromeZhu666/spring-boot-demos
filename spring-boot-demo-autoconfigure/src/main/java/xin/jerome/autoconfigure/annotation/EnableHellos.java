package xin.jerome.autoconfigure.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活Hellos模块配置
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:38
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloImportSelector.class) // 模块装配：接口驱动实现 优点可选bean
public @interface EnableHellos {
}
