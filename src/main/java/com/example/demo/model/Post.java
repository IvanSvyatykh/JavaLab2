package com.example.demo.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes = 0;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        creationDate = date;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
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
