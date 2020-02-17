package challenge.services;

import challenge.models.Repo;
import challenge.models.User;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class UserService {

  public User getUser(String username) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GithubService githubService = retrofit.create(GithubService.class);
    Call<User> userCall = githubService.getUser(username);
    User user = userCall.execute().body();
    return user;
  }

  public List<Repo> getUserRepos(String username) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GithubService githubService = retrofit.create(GithubService.class);
    Call<List<Repo>> listRepoCall = githubService.getUserRepos(username);
    List<Repo> listRepo = listRepoCall.execute().body();
    return listRepo;
  }
}