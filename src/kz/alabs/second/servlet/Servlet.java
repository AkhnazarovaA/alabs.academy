package kz.alabs.second.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.alabs.second.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/2")
public class Servlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<User> users = new ArrayList<>();
    users.add(new User("Бекзат", "Аружан", "Омаровна", 24, "+77478845454"));
    users.add(new User("Исмаилова", "Акерке", "Нурдаулетовна", 31, "+77715548764"));
    users.add(new User("Амангельдинов", "Дамир", "Кайратович", 26, "+77715547785"));
    users.add(new User("Аман", "Диас", "Аманжолович", 25, "+77715549876"));
    users.add(new User("Айнер", "Дамир", "Дауренович", 32, "+77715541542"));
    users.add(new User("Булатова", "Мадина", "Исмаиловна", 26, "+77715543459"));
    users.add(new User("Мустафина", "Асель", "Кайратовна", 24, "+77715547542"));

    req.setAttribute("users", users);

    req.getRequestDispatcher("/jsp/second/index.jsp").forward(req, resp);
  }

}
