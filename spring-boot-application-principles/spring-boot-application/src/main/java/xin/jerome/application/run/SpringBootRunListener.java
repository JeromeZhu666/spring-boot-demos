package xin.jerome.application.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * spring boot 的方式实现运行监听器
 *
 * @author Jerome Zhu
 * @since 2018.10.25 09:47
 */
public class SpringBootRunListener implements SpringApplicationRunListener {

    public SpringBootRunListener(SpringApplication application, String[] args) {

    }


    @Override
    public void starting() {
        System.out.println("SpringBootRunListener.startion()....");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
