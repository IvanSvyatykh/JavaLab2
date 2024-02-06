package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            new Post("Hello", new Date()),
            new Post("Good morning!", new Date()),
            new Post("Good evening!", new Date())));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Post post = new Post(text, new Date());
        posts.add(post);
    }
}
