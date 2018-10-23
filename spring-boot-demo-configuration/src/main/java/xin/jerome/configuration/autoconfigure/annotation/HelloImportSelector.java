package xin.jerome.configuration.autoconfigure.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import xin.jerome.configuration.autoconfigure.configuration.HelloConfiguration;

/**
 * Hello {@link ImportSelector} 的实现
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:32
 */
public class HelloImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloConfiguration.class.getName()};
    }
}
