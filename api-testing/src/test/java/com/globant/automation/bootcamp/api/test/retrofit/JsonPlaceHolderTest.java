package com.globant.automation.bootcamp.api.test.retrofit;

import com.globant.automation.bootcamp.apis.retrofit.Comments;
import com.globant.automation.bootcamp.apis.retrofit.Posts;
import org.junit.Before;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class JsonPlaceHolderTest {

    protected Retrofit retrofit;
    protected Comments commentsApi;
    protected Posts postsApi;

    @Before
    public void buildRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        commentsApi = retrofit.create(Comments.class);
        postsApi = retrofit.create(Posts.class);
    }
}
