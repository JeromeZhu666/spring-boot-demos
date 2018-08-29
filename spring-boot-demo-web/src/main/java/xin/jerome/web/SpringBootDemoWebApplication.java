package xin.jerome.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import xin.jerome.web.filter.SpringBootFilter;
import xin.jerome.web.servlet.SpringBootServlet;

import java.util.Arrays;

/**
 * 项目启动类
 *
 * @author Jerome Zhu
 * @since 2018.08.29 11:03
 */
@SpringBootApplication
@ServletComponentScan(basePackages = {"xin.jerome.web.*"})
public class SpringBootDemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebApplication.class);
    }

    @Bean
    public static ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new SpringBootServlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/bootGet"));
        return servletRegistrationBean;
    }

    @Bean
    public static FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new SpringBootFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/bootGet"));
        return filterRegistrationBean;
    }
}
