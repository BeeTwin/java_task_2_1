package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    List<Post> posts;

    public PostService() {
        var texts = Arrays.asList("I", "Hate", "Java");
        posts = new ArrayList<>();
        for (Integer i = 0; i < texts.size(); i++) {
            posts.add(new Post(i, texts.get(i), new Date()));
        }
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(Post post) {
        posts.add(post);
    }
}
