package APIS_TESTING.ReastEasy;


import APIS_TESTING.models.Comment;
import APIS_TESTING.models.Post;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;
import java.io.IOException;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReastEasyTest {

    @Test
    public void getCommentsRestEasy() throws IOException {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://jsonplaceholder.typicode.com");

        Comments api = target.proxy(Comments.class);

        List<Comment> comments = api.getAll();//problema

        assertThat("", comments.size(), is(500));
    }

    @Test
    public void postPostsRestEasy() throws IOException {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://jsonplaceholder.typicode.com");

        Posts api = target.proxy(Posts.class);

        Post post = new Post(1313, 600, "Trece", "Post");

        api.save(post); //problema

        Post prePost = api.get(13);

        assertThat("TEST APROVADO", prePost.getId(), is(post.getId()));
    }

}