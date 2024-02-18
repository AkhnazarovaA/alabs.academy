<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Введите данные</title>
    </head>
    <body>
        <form action='${pageContext.request.contextPath}/jsp/fourth/process.jsp' method='POST'>
            <label for='fullName'>ФИО:</label>
            <input type='text' id='fullName' name='fullName'>
            <br><br>
            <label for='age'>Возраст:</label>
            <input type='number' id='age' name='age'>
            <br>
            <br>
            <label for='gender'>Пол:</label>
            <select id='gender' name='gender'>
                <option value='male'>Мужской</option>
                <option value='female'>Женский</option>
            </select>
            <br>
            <br>
            <input type='submit' value='Отправить'>
        </form>
    </body>
</html>