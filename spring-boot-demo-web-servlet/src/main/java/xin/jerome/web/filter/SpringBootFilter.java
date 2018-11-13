package xin.jerome.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring boot 的方式创建 filter
 *
 * @author Jerome Zhu
 * @since 2018.08.29 16:33
 */
public class SpringBootFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();

        servletContext.log(request.getRequestURI() + " was filtered");

        filterChain.doFilter(request, response);
    }
}
