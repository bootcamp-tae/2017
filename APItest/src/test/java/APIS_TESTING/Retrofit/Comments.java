package APIS_TESTING.Retrofit;

import APIS_TESTING.models.Comment;
 import retrofit2.Call;
 import retrofit2.http.GET;
import retrofit2.http.Path;

         import java.util.List;

         public interface Comments {

             @GET("/comments")
                Call<List<Comment>> getAll();

             @GET("/comments/{commentId}")
                Call<Comment> get(@Path("commentId") int id);
         }