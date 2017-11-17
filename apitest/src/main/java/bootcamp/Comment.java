package bootcamp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
    @JsonProperty
    private int postId;

    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String body;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }
}
