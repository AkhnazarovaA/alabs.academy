<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Введите данные для оценки экзамена</title>
    </head>
    <body>
        <h2>Форма ввода данных экзамена</h2>
        <form action='${pageContext.request.contextPath}/jsp/servlets/fifth/result.jsp' method='POST'>
            <label for='fullName'>Имя и Фамилия:</label>
            <input type='text' id='fullName' name='fullName' required>
            <br><br>
            <label for='score'>Баллы за экзамен:</label>
            <input type='number' id='score' name='score' required min='0' max='100'>
            <br><br>
            <input type='submit' value='SUBMIT'>
        </form>
    </body>
</html>