package kz.alabs.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kz.alabs.jdbc.model.entity.Product;

public class DBManager {

  private static Connection connection;

  static {
    try {
      Class.forName("org.postgresql.Driver");
      connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/products?useUnicode=true&serverTimezone=UTC",
          "postgres",
          "1234"
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void create(Product product) {
    try {
      PreparedStatement statement = connection.prepareStatement(
          """
              INSERT INTO public.product (name, description, expiration_date)
              VALUES (?, ?, ?)
              """
      );
      statement.setString(1, product.getName());
      statement.setString(2, product.getDescription());
      statement.setString(3, product.getExpirationDate().toString());

      statement.executeUpdate();

      statement.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static List<Product> findAll() {
    List<Product> products = new ArrayList<>();

    try {
      PreparedStatement statement = connection.prepareStatement(
          """
              SELECT * FROM products
              """
      );

      ResultSet resultSet = statement.getResultSet();

      if (Objects.isNull(resultSet)) {
        return Collections.emptyList();
      }

      while (resultSet.next()) {
        Product product = new Product(
            resultSet.getLong("id"),
            resultSet.getString("name"),
            resultSet.getString("description"),
            resultSet.getDate("expiration_date").toLocalDate()
        );
        products.add(product);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return products;
  }

}
