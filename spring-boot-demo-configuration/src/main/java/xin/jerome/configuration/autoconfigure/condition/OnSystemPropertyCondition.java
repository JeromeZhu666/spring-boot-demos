package xin.jerome.configuration.autoconfigure.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * {@link Condition} 实现  匹配条件
 *
 * @author Jerome Zhu
 * @since 2018.10.23 17:30
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String sysPropertyName = String.valueOf(attributes.get("name"));

        String sysPropertyValue = String.valueOf(attributes.get("value"));

        // 获取系统变量 PropertyName 对应的值
        String property = System.getProperty(sysPropertyName);

        return property.equals(sysPropertyValue);
    }
}
