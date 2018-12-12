package xin.jerome.autoconfigure.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import xin.jerome.autoconfigure.configuration.HelloConfiguration;
import xin.jerome.autoconfigure.configuration.HelloJeromeConfiguration;

/**
 * Hello {@link ImportSelector} 的实现
 *
 * @author Jerome Zhu
 * @since 2018.10.23 16:32
 */
public class HelloImportSelector implements ImportSelector {

    private final String key = "jerome";

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        if ("jerome".equals(key)) {
            return new String[]{HelloJeromeConfiguration.class.getName()};
        }

        return new String[]{HelloConfiguration.class.getName()};
    }
}
