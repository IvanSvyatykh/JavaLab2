package com.example.demo.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(String text, Date date) {
        this.text = text;
        creationDate = date;
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
