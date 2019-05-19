package tw.com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
  @NotNull(message = "is required")
  @Size(min=1,message="is required")
  private String firstName;
  private String lastName;
  private String city;
  private String[] gender;

  public Student() {
    System.out.println("in student constructor");

  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * @return the gender
   */
  public String[] getGender() {
    return gender;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(String[] gender) {
    this.gender = gender;
  }
}
