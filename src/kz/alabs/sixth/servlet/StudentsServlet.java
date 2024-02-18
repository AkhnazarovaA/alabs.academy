package kz.alabs.sixth.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import kz.alabs.sixth.manager.DBManager;
import kz.alabs.sixth.model.Student;

@WebServlet(value = "/6")
public class StudentsServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");
    List<Student> students = DBManager.getStudents();

    PrintWriter writer = resp.getWriter();
    
    writer.println(
        """
        <!DOCTYPE html>
        <html>
          <head>
            <title>Список студентов</title>
          </head>
          <body>
            <h2>Список студентов:</h2>
        """
    );
    for (Student student : students) {
      writer.println(
          """
          <p>
            %s %s
            <br>
            Age: %s
            <br>
            University: %s
          </p>
          """.formatted(
              student.getName(),
              student.getSurname(),
              student.getAge(),
              student.getUniversity()
          )
      );
    }
    writer.println(
        """
          </body>
        </html>
        """
    );
  }

}
