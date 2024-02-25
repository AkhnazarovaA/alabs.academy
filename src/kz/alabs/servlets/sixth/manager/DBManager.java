package kz.alabs.servlets.sixth.manager;

import java.util.ArrayList;
import java.util.List;
import kz.alabs.servlets.sixth.model.Student;

public class DBManager {

  private static final List<Student> students = new ArrayList<>();

  static {
    students.add(new Student(1L, "Alisher", "Bekkalpenov", 22, "Narxoz University"));
    students.add(new Student(2L, "Anel", "Muratova", 20, "KazNU"));
    students.add(new Student(3L, "Bolat", "Nazarbayev", 666, "Nazarbayev University"));
  }

  public static List<Student> getStudents() {
    return students;
  }

}
