package xin.jerome.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * After Hello {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author Jerome Zhu
 * @since 2018.10.24 15:15
 */
public class AfterHelloApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event.getApplicationContext().getId() + " after listener do, on " + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
