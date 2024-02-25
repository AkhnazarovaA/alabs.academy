<%@ page import="kz.alabs.jdbc.model.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Создание Продукта</title>
    </head>
    <body>
        <div>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">№</th>
                        <th scope="col">Name</th>
                        <th scope="col">Description</th>
                        <th scope="col">Expiration date</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    List<Product> products = (List<Product>) request.getAttribute("products");

                    for (Product product : products) {
                %>
                    <tr>
                        <th scope="row"><%=product.getId()%></th>
                        <td><%=product.getName()%></td>
                        <td><%=product.getDescription()%></td>
                        <td><%=product.getExpirationDate()%></td>
                    </tr>
                <%
                    }
                %>
                </tbody>
            </table>

            <form action="/products" method="post" style="width: 300px">
                <div class="mb-3">
                    <label class="form-label">Product Name:</label>
                    <input class="form-control" placeholder="Milk" name="name">
                </div>
                <div class="mb-3">
                    <label class="form-label">Product Description:</label>
                    <input class="form-control" placeholder="Milk product" name="description">
                </div>
                <div class="mb-3">
                    <label class="form-label">Product Expiration Date:</label>
                    <input class="form-control" placeholder="2024-01-01" name="expirationDate">
                </div>

                <button class="btn btn-primary">CREATE</button>
            </form>
        </div>
    </body>
</html>