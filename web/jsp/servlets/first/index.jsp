<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>ALABS TEAM</title>
    </head>
    <body>
        <div>
            <%
                for (int i = 0; i < 10; i++) {
                    out.println("<h1>ALABS TEAM</h1>");
                }
            %>
        </div>

        <form action="${pageContext.request.contextPath}/2" method="GET">
            <button type="submit">Перейти к следующему заданию</button>
        </form>
    </body>
</html>
