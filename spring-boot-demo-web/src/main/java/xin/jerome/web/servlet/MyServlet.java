package xin.jerome.web.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * 自定义Servlet
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:10
 */
@WebServlet(
        name = "myGet",
        urlPatterns = "/myGet",
        initParams = {
                @WebInitParam(name = "name", value = "value")
        }
)
public class MyServlet extends HttpServlet {
    private String value;

    public void init(ServletConfig servletConfig) {
        this.value = servletConfig.getInitParameter("name");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Writer writer = response.getWriter();

        ServletContext servletContext = request.getServletContext();

        servletContext.log("MyServlet doGet ...");

        writer.write("<html><body>hello word! myValue = " + value + "</body></html>");
    }
}
