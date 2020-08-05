package info.huzd.sb.demo;

import info.huzd.sb.demo.filter.SecondtFilter;
import info.huzd.sb.demo.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {

    // fist modify by huzd.

    // second modify by huzd.

    // three modify by huzd.

    //new branch one.

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }

    @Bean
    FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondtFilter());
        bean.addUrlPatterns(new String[]{"/secondFilter"});
        return bean;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
