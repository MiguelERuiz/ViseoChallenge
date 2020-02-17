package challenge.controllers;

import challenge.models.Repo;
import challenge.models.User;
import challenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;


@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/searchUser")
  public ModelAndView searchUser(@RequestParam String userName) throws IOException {
    User user = userService.getUser(userName);
    if (user == null) {
      return new ModelAndView("/error");
    }
    List<Repo> listRepo = userService.getUserRepos(userName);
    return new ModelAndView("search_user").addObject("user", user).addObject("listRepo", listRepo);
  }
}
