package xin.jerome.application.bootstrap;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 的事件监听
 *
 * @author Jerome Zhu
 * @since 2018.10.25 09:31
 */
public class SpringApplicationEvent {

    public static void main(String[] args) {

        // 创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 添加监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件: " + event);
        });

        // 启动上下文
        context.refresh();

        // 添加事件
        context.publishEvent("Hello Jerome !"); // 创建一个 PayloadApplicationEvent 事件
        context.publishEvent(new ApplicationEvent("Jerome") {});

        // 关闭上下文
        context.close();

    }

}
