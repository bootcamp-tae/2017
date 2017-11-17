package apiTests.retrofit;

import apis.retrofit.Comments;
import model.Comment;
import okhttp3.OkHttpClient;
import org.junit.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;


import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JsonPlaceHolderTest {

  @Test
  public void getCommentsRetrofit() throws IOException {
    OkHttpClient c = new OkHttpClient.Builder().build();

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(JacksonConverterFactory.create())
        .client(c)
        .build();

    Comments api = retrofit.create(Comments.class);

    Response<List<Comment>> response = api.getAll().execute();

    List<Comment> comments = response.body();

    assertThat("HTTP code is OK", response.code(), is(500));
    assertThat("Shit got real", comments.size(), is(500));
  }

}
