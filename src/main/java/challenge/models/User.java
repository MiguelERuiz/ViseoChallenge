package challenge.models;


import java.util.List;

public class User {

  private String login;
  private String avatar_url;
  private List<Repo> listRepo;

  public User() {
  }

  public User(String login, String avatar_url, List<Repo> listRepo) {
    this.login = login;
    this.avatar_url = avatar_url;
    this.listRepo = listRepo;
  }

  public String getLogin() {
    return this.login;
  }

  public String getAvatar_url() {
    return this.avatar_url;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setAvatar_url(String avatar_url) {
    this.avatar_url = avatar_url;
  }

  public List<Repo> getListRepo() {
    return this.listRepo;
  }

  public void setListRepo(List<Repo> listRepo) {
    this.listRepo = listRepo;
  }

}
