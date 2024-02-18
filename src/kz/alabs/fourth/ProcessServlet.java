package kz.alabs.fourth;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/4/process")
public class ProcessServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    String fullName = req.getParameter("fullName");
    int age = Integer.parseInt(req.getParameter("age"));
    String gender = req.getParameter("gender");

    String title = gender.equalsIgnoreCase("male") ? "Mister" : "Miss";
    String ageCategory = age >= 18 ? "Dear" : "Dude";

    resp.getWriter().println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Результат</title>
          </head>
          <body>
            <h2>Hello %s %s %s!</h2>
            <br>
            <form action="/5" method="GET">
              <button type="submit">Перейти к следующему заданию</button>
            </form>
          </body>
        </html>
        """.formatted(ageCategory, title, fullName)
    );
  }

}
