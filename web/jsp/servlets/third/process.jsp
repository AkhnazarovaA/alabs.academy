<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Обработка данных</title>
    </head>
    <body>
        <h2>Полученные данные:</h2>
        <p>Имя: <%= request.getParameter("firstName") %></p>
        <p>Фамилия: <%= request.getParameter("lastName") %></p>
        <br>
        <form action="${pageContext.request.contextPath}/4" method="GET">
            <button type="submit">Перейти к следующему заданию</button>
        </form>
    </body>
</html>