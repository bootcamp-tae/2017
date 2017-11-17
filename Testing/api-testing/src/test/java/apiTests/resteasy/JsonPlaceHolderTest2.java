package apiTests.resteasy;


import apis.resteasy.Comments;
import apis.resteasy.Posts;
import model.Comment;

import model.Post;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JsonPlaceHolderTest2 {

  @Test
  public void getCommentsRestEasy() throws IOException {
    ResteasyClient client = new ResteasyClientBuilder().build();
    ResteasyWebTarget target = client.target("https://jsonplaceholder.typicode.com");

    Comments api = target.proxy(Comments.class);

    List<Comment> comments = api.getAll();

    assertThat("Shit got real", comments.size(), is(500));
  }

  @Test
  public void postPostsRestEasy() throws IOException {
    ResteasyClient client = new ResteasyClientBuilder().build();
    ResteasyWebTarget target = client.target("https://jsonplaceholder.typicode.com");

    Posts api = target.proxy(Posts.class);

    Post post = new Post(1313, 600, "Trece", "Post");

    api.save(post);

    Post prePost = api.get(13);

    assertThat("Shit got real", prePost.getId(), is(post.getId()));
  }

}
