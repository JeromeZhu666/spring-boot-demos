package xin.jerome.web.thymeleaf;

import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

/**
 * {@link SpringTemplateEngine} 演示
 *
 * @author Jerome Zhu
 * @since 2018.11.13 15:56
 */
public class ThymeleafEngineBootstrap {

    public static void main(String[] args) {
        // create engine
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        // create context
        Context context = new Context();
        context.setVariable("message", "Hello Jerome");
        // template content
        String content = "<p th:text=\"${message}\">!!!</p>";
        // process
        String result = templateEngine.process(content, context);
        // print
        System.out.println(result);
    }
}
