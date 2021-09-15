package com.example.demoweb.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes;
    Date creationDate;

    public Post(String text, Date creationDate) {
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
}
