<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List,kz.alabs.servlets.second.model.User" %>
<html>
    <head>
        <title>Список пользователей</title>
    </head>
    <body>
        <h2>Пользователи:</h2>
        <table border="1">
            <tr>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчество</th>
                <th>Возраст</th>
                <th>Номер телефона</th>
            </tr>
            <%
                List<User> users = (List<User>) request.getAttribute("users");
                for(User user : users) {
            %>
            <tr>
                <td><%= user.getLastName() %></td>
                <td><%= user.getFirstName() %></td>
                <td><%= user.getMiddleName() %></td>
                <td><%= user.getAge() %></td>
                <td><%= user.getPhone() %></td>
            </tr>
            <% } %>
        </table>

        <form action="${pageContext.request.contextPath}/3" method="GET">
            <button type="submit">Перейти к следующему заданию</button>
        </form>
    </body>
</html>