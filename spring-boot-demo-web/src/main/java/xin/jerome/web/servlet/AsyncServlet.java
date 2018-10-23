package xin.jerome.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 异步的servlet
 *      注：asyncSupported 默认是false,不开启会报以下错误：
 *          Unable to start async because the following classes in the processing chain do not support async
 *
 * @author Jerome Zhu
 * @since 2018.10.23 10:23
 */
@WebServlet(
        urlPatterns = "/async/servlet",
        asyncSupported = true
)
public class AsyncServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(()->{
            try {
                resp.getWriter().print("this is async servlet!");
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
