package challenge.models;

import java.util.Date;

public class RepoDetails {

  private String name;
  private String language;
  private int stargazers_count;
  private String description;
  private Date created_at;
  private Date updated_at;
  private String html_url;
  private Owner owner;

  public RepoDetails(String name, String language, int stargazers_count, String description, Date created_at, Date updated_at, String html_url, Owner owner) {
    this.name = name;
    this.language = language;
    this.stargazers_count = stargazers_count;
    this.description = description;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.html_url = html_url;
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getStargazers_count() {
    return stargazers_count;
  }

  public void setStargazers_count(int stargazers_count) {
    this.stargazers_count = stargazers_count;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public String getHtml_url() {
    return html_url;
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
