package challenge.controllers;

import challenge.models.RepoDetails;
import challenge.services.RepoDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

@Controller
public class RepoDetailsController {

  @Autowired
  private RepoDetailsService repoDetailsService;

  @GetMapping("/show_repo_details/{user}/{repo}")
  public ModelAndView showRepoDetails(@PathVariable Map<String, String> requestParams) throws IOException {
    String userName = requestParams.get("user");
    String repoName = requestParams.get("repo");
    RepoDetails repoDetails = repoDetailsService.getRepoDetails(userName, repoName);
    return new ModelAndView("show_repo_details").addObject("repoDetails", repoDetails);
  }
}
