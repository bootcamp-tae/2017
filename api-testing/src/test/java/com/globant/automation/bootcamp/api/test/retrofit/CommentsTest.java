package com.globant.automation.bootcamp.api.test.retrofit;

import com.globant.automation.bootcamp.model.Comment;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Facundo on 11/11/2017.
 */
public class CommentsTest extends JsonPlaceHolderTest {

    @Test
    public void getAllComments() throws IOException {

        Response<List<Comment>> response = commentsApi.getAll().execute();

        List<Comment> comments = response.body();

        assertThat("HTTP code is OK", response.code(), is(200));
        assertThat("Size is 500", comments.size(), is(500));
    }

    @Test
    public void getOneComment() throws IOException {

        Response<Comment> response = commentsApi.get(1).execute();

        Comment theComment = response.body();

        assertThat("HTTP code is OK", response.code(), is(200));
        assertThat("Id is fine", theComment.getId(), is(1));

    }

}
