package challenge.services;


import challenge.models.Repo;
import challenge.models.RepoDetails;
import challenge.models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GithubService {

  @GET("/users/{user}")
  Call<User> getUser(@Path("user") String user);

  @GET("/users/{user}/repos")
  Call<List<Repo>> getUserRepos(@Path("user") String userName);

  @GET("/repos/{user}/{repo}")
  Call<RepoDetails> getRepoDetails(@Path("user") String userName, @Path("repo") String repoName);
}
