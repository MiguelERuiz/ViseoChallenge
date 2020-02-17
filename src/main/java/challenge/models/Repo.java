package challenge.models;

public class Repo {
  private String name;
  private String html_url;
  private Owner owner;

  public Repo(String name, String html_url, Owner owner) {
    this.name = name;
    this.html_url = html_url;
    this.owner = owner;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHtml_url() {
    return this.html_url;
  }

  public void setHtml_url(String html_url) {
    this.html_url = html_url;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }
}
