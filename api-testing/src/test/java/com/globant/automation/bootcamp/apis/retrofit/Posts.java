package com.globant.automation.bootcamp.apis.retrofit;

import com.globant.automation.bootcamp.model.Comment;
import com.globant.automation.bootcamp.model.ThePost;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by Facundo on 11/11/2017.
 */
public interface Posts {

    @POST("/posts")
    Call<ThePost> addPost(@Body ThePost post);

    @GET("/posts")
    Call<List<ThePost>> getPosts();

    @GET("/posts/{id}")
    Call<ThePost> getPostById(@Path("id") int postId);

    @GET("/posts/{id}/comments")
    Call<List<Comment>> getPostComments(@Path("id") int postId);


}
