package xin.jerome.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Hello {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author Jerome Zhu
 * @since 2018.10.24 15:15
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event.getApplicationContext().getId() + " listener do, on " + event.getTimestamp());
    }
}
