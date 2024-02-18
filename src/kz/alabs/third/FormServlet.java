package kz.alabs.third;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/3/form")
public class FormServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    resp.getWriter().println(
        """
        <!DOCTYPE html>
        <html>
            <head>
              <title>Отправка формы</title>
            </head>
          <body>
            <form action='process' method='POST'>
            <input type='text' name='firstName' placeholder='Имя'/>
            <input type='text' name='lastName' placeholder='Фамилия'/>
            <input type='submit' value='Отправить'/>
            </form>
          </body>
        </html>
        """
    );
  }

}
