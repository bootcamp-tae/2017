package APIS_TESTING.ReastEasy;


import APIS_TESTING.models.Comment;
//ReastEasy
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

public interface Comments {

    @GET
    @Path("/comments")
    List<Comment> getAll();

    @GET
    @Path("/comments/{commentId}")
    Comment get(@PathParam("commentId") int commentId);

}