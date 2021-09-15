package com.example.demoweb.model;

import java.util.Date;

public class Post {
    long id;
    String text;
    Integer likes;
    Date creationDate;

    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public long getId() {
        return id;
    }
}
