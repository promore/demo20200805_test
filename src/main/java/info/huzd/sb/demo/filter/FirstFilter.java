package info.huzd.sb.demo.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huzd on 2020/7/27 12:54 AM
 * Email:huzd@si-tech.com.cn or ahhzd@vip.qq.com
 * Blog: www.huzd.info
 */

@WebFilter(filterName = "firstFilter",urlPatterns = {"/firstFilter"})
public class FirstFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("first do first");
        super.doFilter(request, response, chain);
        System.out.println("first do first ...");
    }
}
