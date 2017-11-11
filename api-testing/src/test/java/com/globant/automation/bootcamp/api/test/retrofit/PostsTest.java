package com.globant.automation.bootcamp.api.test.retrofit;

import com.globant.automation.bootcamp.model.Comment;
import com.globant.automation.bootcamp.model.ThePost;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Facundo on 11/11/2017.
 */
public class PostsTest extends JsonPlaceHolderTest {

    @Test
    public void getPosts() throws IOException{

        Response<List<ThePost>> response = postsApi.getPosts().execute();

        List<ThePost> thePosts = response.body();

        assertThat("Its all OK!", response.code(), is(200));
        assertThat("We got them all", thePosts.size(), is(100));

    }

    @Test
    public void getPostById() throws IOException {

        Response<ThePost> response = postsApi.getPostById(35).execute();
        Response<ThePost> badResponse = postsApi.getPostById(101).execute();

        ThePost aRealOne = response.body();
        ThePost aFakeOne = badResponse.body();

        assertThat("I got one", aRealOne.getId(), is(35));
        assertThat("We are f***ed up, not found", badResponse.code(), is(404));

    }

    @Test
    public void getPostComments() throws IOException {
        Response<List<Comment>> response = postsApi.getPostComments(1).execute();

        List<Comment> postComments = response.body();

        assertThat("We got the comments", response.code(), is(200));
        assertThat("We got them all", postComments.size(), is(5));
    }

    @Test
    public void postSomething() throws IOException{
        ThePost onePost = new ThePost(1414, 500, "Hello there!", "The body is empty");

        Response<ThePost> postt = postsApi.addPost(onePost).execute();

        assertThat("We added a post", postt.code(), is(201) );
        assertThat("We said 'Hello there' in our post", onePost.getTitle(), is("Hello there!"));
    }

}
