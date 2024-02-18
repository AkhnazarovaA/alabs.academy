package kz.alabs.second.model;

public class User {

  private String lastName;
  private String firstName;
  private String middleName;
  private int age;
  private String phone;

  public User(String lastName, String firstName, String middleName, int age, String phone) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.age = age;
    this.phone = phone;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
