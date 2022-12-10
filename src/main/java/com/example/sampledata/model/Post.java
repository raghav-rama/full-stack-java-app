package com.example.sampledata.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dummy")
public class Post {
  private String name;
  private String job;
  private String based;

  public Post () {

  }

  public String getName () {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }

  public String getJob () {
    return job;
  }

  public void setJob (String job) {
    this.job = job;
  }

  public String getBased () {
    return based;
  }

  public void setBased (String based) {
    this.based = based;
  }

  @Override
  public String toString () {
    return "Post{" +
        "name='" + name + '\'' +
        ", job='" + job + '\'' +
        ", based='" + based + '\'' +
        '}';
  }
}
