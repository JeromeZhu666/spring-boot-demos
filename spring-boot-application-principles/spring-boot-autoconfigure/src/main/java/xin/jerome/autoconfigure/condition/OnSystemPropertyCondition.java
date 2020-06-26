package xin.jerome.autoconfigure.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * {@link Condition} 实现匹配系统配置的条件
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:30
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String propertyKey = String.valueOf(attributes.get("key"));

        String propertyValue = String.valueOf(attributes.get("value"));

        // 获取系统变量 propertyKey 对应的值
        String sysPropertyValue = System.getProperty(propertyKey);

        return propertyValue.equals(sysPropertyValue);
    }
}
