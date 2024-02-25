package kz.alabs.jdbc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kz.alabs.jdbc.db.DBManager;
import kz.alabs.jdbc.model.entity.Product;

@WebServlet(value = "/products")
public class ProductServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setCharacterEncoding("UTF-8");

    String name = req.getParameter("name");
    String description = req.getParameter("description");
    LocalDate expirationDate = LocalDate.parse(req.getParameter("expirationDate"));

    Product product = new Product(name, description, expirationDate);
    DBManager.create(product);

    resp.sendRedirect("/products");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    List<Product> products = DBManager.findAll();
    req.setAttribute("products", products);
    req.getRequestDispatcher("/jsp/jdbc/index.jsp").forward(req, resp);
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doPut(req, resp);
  }

  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doDelete(req, resp);
  }

}
