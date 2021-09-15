package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        var posts = new ArrayList<Post>();
        posts.add(new Post("I", new Date()));
        posts.add(new Post("Hate", new Date()));
        posts.add(new Post("Java", new Date()));
        return posts;
    }
}
