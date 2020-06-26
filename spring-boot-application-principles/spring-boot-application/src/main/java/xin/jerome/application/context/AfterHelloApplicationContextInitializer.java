package xin.jerome.application.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * 在{@link HelloApplicationContextInitializer} 之后初始化
 *
 * @author Jerome Zhu
 * @since 2018.10.24 14:36
 */
public class AfterHelloApplicationContextInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("after hello application init :" + applicationContext.getId());
    }


    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
