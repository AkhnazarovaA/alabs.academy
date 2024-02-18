package kz.alabs.fourth;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/4/form")
public class FormServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    resp.getWriter().println(
        """
            <!DOCTYPE html>
            <html>
              <head>
                <title>Введите данные</title>
              </head>
              <body>
                <form action='process' method='POST'>
                <label for='fullName'>ФИО:</label>
                <input type='text' id='fullName' name='fullName'>
                  <br>
                  <br>
                <label for='age'>Возраст:</label>
                <input type='number' id='age' name='age'>
                  <br>
                  <br>
                <label for='gender'>Пол:</label>
                <select id='gender' name='gender'>
                <option value='male'>Мужской</option>
                <option value='female'>Женский</option>
                </select>
                  <br>
                  <br>
                <input type='submit' value='Отправить'>
                </form>
              </body>
            </html>
        """
    );
  }

}
