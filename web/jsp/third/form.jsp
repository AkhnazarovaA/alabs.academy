<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Отправка формы</title>
    </head>
    <body>
        <form action='${pageContext.request.contextPath}/jsp/third/process.jsp' method='POST'>
            <input type='text' name='firstName' placeholder='Имя'/>
            <input type='text' name='lastName' placeholder='Фамилия'/>
            <input type='submit' value='Отправить'/>
        </form>
    </body>
</html>