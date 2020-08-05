package info.huzd.sb.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huzd on 2020/7/27 12:35 AM
 * Email:huzd@si-tech.com.cn or ahhzd@vip.qq.com
 * Blog: www.huzd.info
 */

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("second servlet!");
        super.doGet(req, resp);
    }
}
