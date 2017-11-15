package APIS_TESTING.ReastEasy;



import APIS_TESTING.models.Post;
import javax.ws.rs.*;
import java.util.List;

@Consumes(value = "application/json")
public interface Posts {

    @GET
    @Path("/posts")
    List<Post> getAll();

    @GET
    @Path("/posts/{postId}")
    Post get(@PathParam("postId") int postId);

    @POST
    @Path("/posts")
    void save(Post post);

}