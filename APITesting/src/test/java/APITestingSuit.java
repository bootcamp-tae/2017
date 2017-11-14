import Modelos.Comment;
import org.junit.Test;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;

public class APITestingSuit {

    @Test
    public void getCommonAttributes() throws IOException {
        Retrofit retrofit = new Retrofit().newBuilder()
                .baseUrl("UnaUrl")
                .addConverterFactory()
                .build();
        Comment comment = retrofit.create(Comment.class);

        List<Comment> comments = comment.getAll().execute(); //LLamada a la lista de comment Sincrónico
            //Si uso Enqueue() He de usar un callback, especificar que:
                                // En el caso de que haya salido bien que ocurre
                                // En el caso de que salga mal que ocurre.


    }

}
