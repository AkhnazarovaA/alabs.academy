package kz.alabs.third;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/3/process")
public class ProcessServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    String firstName = req.getParameter("firstName");
    String lastName = req.getParameter("lastName");

    resp.getWriter().println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Обработка данных</title>
          </head>
          <body>
            <h2>Полученные данные:</h2>
            <p>Имя: %s</p>
            <p>Фамилия: %s</p>
            <br>
            <form action="/4/form" method="GET">
              <button type="submit">Перейти к следующему заданию</button>
            </form>
          </body>
        </html>
        """.formatted(firstName, lastName)
    );
  }

}
