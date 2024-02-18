<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="kz.alabs.sixth.model.Student" %>
<html>
    <head>
        <title>Список студентов</title>
    </head>
    <body>
        <h2>Список студентов:</h2>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student student : students) {
        %>
        <p>
            <%= student.getName() %> <%= student.getSurname() %>
            <br>
            Age: <%= student.getAge() %>
            <br>
            University: <%= student.getUniversity() %>
        </p>
        <%
            }
        %>
    </body>
</html>