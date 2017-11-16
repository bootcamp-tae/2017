package JSONPlaceholder.Retrofit;

import JSONPlaceholder.Models.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface IPosts {

    @POST("/posts")
    Call<Post> addPost(@Body Post post);

    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/posts/{id}")
    Call<Post> getPostById(@Path("id") int id);

}