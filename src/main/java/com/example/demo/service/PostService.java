package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    public List<Post> listAllPosts() {

        return Arrays.asList(new Post("Hello", new Date(2024, Calendar.FEBRUARY, 5)),
                new Post("Good morning!", new Date(2024, Calendar.MARCH, 4)),
                new Post("Good evening!", new Date(2024, Calendar.JANUARY, 3)));
    }
}
