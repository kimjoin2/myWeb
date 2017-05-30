package servlet;

import servlet.template.MyJspTemplate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * Created by bumskim on 2017. 5. 26..
 * this servlet is for welcome page
 * @version 1.0.0
 */
@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MyJspTemplate page = new MyJspTemplate(request, response);

        page.doForward();
    }
}
