package tw.com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
  @NotNull(message = "請輸入姓名")
  @Size(min = 1)
  private String name;
  @NotNull(message = "請輸入密碼")
  @Size(min = 1)
  private String password;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

}
