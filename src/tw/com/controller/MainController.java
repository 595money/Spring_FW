package tw.com.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tw.com.model.Student;
import tw.com.model.User;

@Controller
public class MainController {
  @Value("#{cities}")
  private Map<String, String> cities;

  @RequestMapping("/")
  public String index(Model theModel) {
    return "index";
  }

  @RequestMapping("/home")
  public String home(Model theModel) {

    // create a student object Student
    Student theStudent = new Student();

    // add student object to the model
    theModel.addAttribute("student", theStudent);

    // add the country options to the model
    theModel.addAttribute("theCityOptions", cities);
    return "home";
  }

  @RequestMapping("/test")
  public String test(@ModelAttribute("student") Student theStudent) {

    // log the input data
    System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

    return "test";
  }
}
