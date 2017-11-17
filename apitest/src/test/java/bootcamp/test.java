package bootcamp;

import okhttp3.OkHttpClient;
import org.junit.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class test {
    @Test
    public void getComments() throws IOException {
        OkHttpClient c = new OkHttpClient.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .client(c)
                .build();

        Comments api = retrofit.create(Comments.class);

        Response<List<Comment>> response = api.getAll().execute();

        List<Comment> comments = response.body();

        assertThat("HTTP 200", response.code(), is(200));
    }

}
