package APIS;

import Modelos.Comment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface CommonApi {

    @GET("/comments")
    Call <List<Comment> getAll()>;

    @GET("/comments/[algo]")
    Comment get(@Path("algo") int id);

    @GET("/comments/[commentId]")
    Comment get(@Path("commentId") int id, @Query("qr") String query);


}
