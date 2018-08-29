package xin.jerome.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * spring boot 创建servlet
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:31
 */
public class SpringBootServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Writer writer = response.getWriter();

        ServletContext servletContext = request.getServletContext();

        servletContext.log("SpringBootServlet doGet ...");

        writer.write("<html><body>hello word! from SpringBootServlet</body></html>");
    }

}
