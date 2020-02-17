package challenge.services;

import challenge.models.RepoDetails;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class RepoDetailsService {

  public RepoDetails getRepoDetails(String userName, String repoName) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GithubService githubService = retrofit.create(GithubService.class);
    Call<RepoDetails> repoDetailsCall = githubService.getRepoDetails(userName, repoName);
    RepoDetails repoDetails = repoDetailsCall.execute().body();
    return repoDetails;
  }
}
