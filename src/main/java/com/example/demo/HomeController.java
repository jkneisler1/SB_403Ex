package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/course")
    public String course() {
        return "course";
    }

    @RequestMapping("/teacher")
    public String teacher() {
        return "teacher";
    }

    @RequestMapping("/student")
    public String student() {
        return "student";
    }
}