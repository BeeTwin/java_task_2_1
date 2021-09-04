package com.example.demoweb;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsViewController {
    @ResponseBody
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list() {
        return "Здесь будет главная страница";
    }
}
