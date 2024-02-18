package kz.alabs.second.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import kz.alabs.second.model.User;

@WebServlet("/2")
public class BasicServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");

    List<User> users = new ArrayList<>();
    users.add(new User("Бекзат", "Аружан", "Омаровна", 24, "+77478845454"));
    users.add(new User("Исмаилова", "Акерке", "Нурдаулетовна", 31, "+77715548764"));
    users.add(new User("Амангельдинов", "Дамир", "Кайратович", 26, "+77715547785"));
    users.add(new User("Аман", "Диас", "Аманжолович", 25, "+77715549876"));
    users.add(new User("Айнер", "Дамир", "Дауренович", 32, "+77715541542"));
    users.add(new User("Булатова", "Мадина", "Исмаиловна", 26, "+77715543459"));
    users.add(new User("Мустафина", "Асель", "Кайратовна", 24, "+77715547542"));

    PrintWriter writer = resp.getWriter();
    writer.println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Список пользователей</title>
          </head>
          <body>
            <h2>Пользователи:</h2>
            <table border='1'>
            <tr>
              <th>Фамилия</th>
              <th>Имя</th>
              <th>Отчество</th>
              <th>Возраст</th>
              <th>Номер телефона</th>
            </tr>
        """
    );

    for (User user : users) {
      writer.println(
          """
          <tr>
            <td>%s</td>
            <td>%s</td>
            <td>%s</td>
            <td>%s</td>
            <td>%s</td>
          </tr>
          """.formatted(
              user.getLastName(),
              user.getFirstName(),
              user.getMiddleName(),
              user.getAge(),
              user.getPhone()
          )
      );
    }
    writer.println(
        """
            </table>
            <br>
            <form action="/3/form" method="GET">
              <button type="submit">Перейти к следующему заданию</button>
            </form>
          </form>
          </body>
        </html>
        """
    );
  }

}
