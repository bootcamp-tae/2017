package com.globant.automation.bootcamp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Post {

  @JsonProperty
  private Integer userId;

  @JsonProperty
  private Integer id;

  @JsonProperty
  private String title;

  @JsonProperty
  private String body;

  public Post() {

  }

  public Post(Integer userId, Integer id, String title, String body) {
    this.userId = userId;
    this.id = id;
    this.title = title;
    this.body = body;
  }

  public Integer getUserId() {
    return userId;
  }

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }

}