<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Результат экзамена</title>
</head>
<body>
<%
    String fullName = request.getParameter("fullName");
    int score = Integer.parseInt(request.getParameter("score"));
    String grade;

    if (score >= 90) {
        grade = "A";
    } else if (score >= 75) {
        grade = "B";
    } else if (score >= 60) {
        grade = "C";
    } else if (score >= 50) {
        grade = "D";
    } else {
        grade = "F";
    }
%>
<h2><%= fullName %>, ваша оценка за экзамен: <%= grade %></h2>
<br>
<form action="${pageContext.request.contextPath}/6" method="GET">
    <button type="submit">Перейти к следующему заданию</button>
</form>
</body>
</html>