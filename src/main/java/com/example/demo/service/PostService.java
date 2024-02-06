package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(0L, "Hello", new Date()),
            new Post(1L, "Good morning!", new Date()),
            new Post(2L, "Good evening!", new Date())));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Post post = new Post(Long.valueOf(posts.size()), text, new Date());
        posts.add(post);
    }
}
