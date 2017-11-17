package JSONPlaceholderTests;

import JSONPlaceholder.JSONPlaceholderTest;
import JSONPlaceholder.Models.Post;
import JSONPlaceholder.Retrofit.IPosts;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PostsTests extends JSONPlaceholderTest{

    @Test
    public void getPosts() throws IOException {

        Response<List<Post>> response = postsApi.getPosts().execute();

        List<Post> thePosts = response.body();

        assertThat("The HTTP code is OK", response.code(), is(200));
        assertThat("We catch them all", thePosts.size(), is(100));
    }

    @Test
    public void getOnePost() throws IOException {

        Response<Post> response = postsApi.getPostById(35).execute();
        Response<Post> errorResponse = postsApi.getPostById(101).execute();

        Post onePost = response.body();

        assertThat("The HTTP code is OK", response.code(), is(200));
        assertThat("We catch the post that we want", onePost.getId(), is(35));
        assertThat("OH NO, THERE WAS NOTHING THERE", errorResponse.code(), is(404));
    }

    @Test
    public void postAPost() throws IOException{
        Post onePost = new Post(1414, 501, "This is a title", "This is a body");

        Response<Post> response = postsApi.addPost(onePost).execute();

        assertThat("The post was created", response.code(), is(201) );
    }
}
