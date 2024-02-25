package kz.alabs.servlets.sixth.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.alabs.servlets.sixth.manager.DBManager;
import kz.alabs.servlets.sixth.model.Student;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/6")
public class StudentsServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Student> students = DBManager.getStudents();

    req.setAttribute("students", students);

    req.getRequestDispatcher("/jsp/sixth/index.jsp").forward(req, resp);
  }

}
