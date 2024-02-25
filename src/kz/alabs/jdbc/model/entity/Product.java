package kz.alabs.jdbc.model.entity;

import java.time.LocalDate;

public class Product {

  private Long id;
  private String name;
  private String description;
  private LocalDate expirationDate;

  public Product() {}

  public Product(String name, String description, LocalDate expirationDate) {
    this.name = name;
    this.description = description;
    this.expirationDate = expirationDate;
  }

  public Product(Long id, String name, String description, LocalDate expirationDate) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.expirationDate = expirationDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

}
