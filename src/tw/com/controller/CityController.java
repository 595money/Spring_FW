package tw.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tw.com.model.User;


@Controller
@RequestMapping("/city")
public class CityController {
  @RequestMapping("/inn")
  public String inn() {
    return "/city/inn";
  }

  @RequestMapping("/shop")
  public String shop() {
    return "/city/shop";
  }

  @RequestMapping("/guild")
  public String guild(Model theModel) {

    theModel.addAttribute("theUser", new User());
    return "/city/guild";
  }

}
