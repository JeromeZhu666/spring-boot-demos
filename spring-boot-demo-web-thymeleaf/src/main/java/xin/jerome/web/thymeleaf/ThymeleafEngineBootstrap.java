package xin.jerome.web.thymeleaf;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * {@link SpringTemplateEngine} 演示
 *
 * @author Jerome Zhu
 * @since 2018.11.13 15:56
 */
public class ThymeleafEngineBootstrap {

    public static void main(String[] args) throws IOException {
//        processContentByString();
        processContentByResource();
    }

    /**
     * 渲染来自模板文件的内容
     *
     * @throws IOException IO异常
     */
    private static void processContentByResource() throws IOException {
        // create engine
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        // create context
        Context context = new Context();
        context.setVariable("message", "Hello Jerome");
        // get template content by resource
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/templates/template.html");
        InputStream inputStream = resource.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, byteArrayOutputStream);
        String content = byteArrayOutputStream.toString();
        // process
        String result = templateEngine.process(content, context);
        // print
        System.out.println(result);
    }

    /**
     * 渲染String Content的模板
     */
    private static void processContentByString() {
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
