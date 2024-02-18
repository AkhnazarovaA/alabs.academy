package kz.alabs.fifth;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/5")
public class BasicServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html;charset=UTF-8");

    PrintWriter writer = resp.getWriter();
    writer.println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Введите данные для оценки экзамена</title>
          </head>
          <body>
            <h2>Форма ввода данных экзамена</h2>
            <form action='' method='POST'>
            <label for='fullName'>Имя и Фамилия:</label>
            <input type='text' id='fullName' name='fullName' required>
              <br>
              <br>
            <label for='score'>Баллы за экзамен:</label>
            <input type='number' id='score' name='score' required min='0' max='100'>
              <br>
              <br>
            <input type='submit' value='SUBMIT'>
            </form>
          </body>
        </html>
        """
    );
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    String fullName = req.getParameter("fullName");
    int score = Integer.parseInt(req.getParameter("score"));
    String grade = calculateGrade(score);

    resp.getWriter().println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Результат экзамена</title>
          </head>
          <body>
            <h2>%s, ваша оценка за экзамен: %s</h2>
            <br>
            <form action="/6" method="GET">
              <button type="submit">Перейти к следующему заданию</button>
            </form>
          </body>
        </html>
        """.formatted(fullName, grade)
    );
  }

  private String calculateGrade(int score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 75) {
      return "B";
    } else if (score >= 60) {
      return "C";
    } else if (score >= 50) {
      return "D";
    } else {
      return "F";
    }
  }

}
