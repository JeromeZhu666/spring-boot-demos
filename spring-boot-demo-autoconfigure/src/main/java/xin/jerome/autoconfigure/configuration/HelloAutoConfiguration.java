package xin.jerome.autoconfigure.configuration;

import org.springframework.context.annotation.Configuration;
import xin.jerome.autoconfigure.annotation.EnableHello;
import xin.jerome.autoconfigure.condition.ConditionalOnSystemProperty;

/**
 * Hello自动装配
 *
 * @author Jerome Zhu
 * @since 2018.10.24 09:41
 */
@Configuration // 模式注解
@EnableHello // spring Enable模块装配  ↑
@ConditionalOnSystemProperty(key = "user.key", value = "user") // 条件装配 ↑
public class HelloAutoConfiguration {
}
