package kz.alabs.first;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/1")
public class BasicServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    PrintWriter writer = resp.getWriter();
    writer.println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>ALABS TEAM</title>
          </head>
          <body>
        """
    );

    for (int i = 0; i < 10; i++) {
      writer.println("<h1>ALABS TEAM</h1>");
    }

    writer.println(
        """
            <form action="/2" method="GET">
              <button type="submit">Перейти к следующему заданию</button>
            </form>
          </body>
        </html>
        """
    );
  }

}
