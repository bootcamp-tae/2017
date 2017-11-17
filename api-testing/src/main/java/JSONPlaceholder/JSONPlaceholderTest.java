package JSONPlaceholder;

import API.ApiTest;
import JSONPlaceholder.Models.Post;
import JSONPlaceholder.Retrofit.IPosts;
import org.junit.Before;

public abstract class JSONPlaceholderTest extends ApiTest {
    protected IPosts postsApi;

    @Before
    public void buildRetrofit(){
        super.buildRetrofit("https://jsonplaceholder.typicode.com");
        postsApi = retrofit.create(IPosts.class);
    }
}