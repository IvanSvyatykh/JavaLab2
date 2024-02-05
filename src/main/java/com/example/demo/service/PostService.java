package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {

        return Arrays.asList(new Post("Hello"),
                new Post("Good morning!"),
                new Post("Good evening!"));
    }
}
