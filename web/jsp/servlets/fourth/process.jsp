<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.Integer" %>
<html>
    <head>
        <title>Результат</title>
    </head>
    <body>
        <%
            String fullName = request.getParameter("fullName");
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");

            String title = gender.equalsIgnoreCase("male") ? "Mister" : "Miss";
            String ageCategory = age >= 18 ? "Dear" : "Dude";
        %>
        <h2>Hello <%= ageCategory %> <%= title %> <%= fullName %>!</h2>
        <br>
        <form action="${pageContext.request.contextPath}/5" method="GET">
            <button type="submit">Перейти к следующему заданию</button>
        </form>
    </body>
</html>