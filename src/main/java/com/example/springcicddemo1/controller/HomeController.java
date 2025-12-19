package com.example.springcicddemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String indexGet() {
    System.out.println("index호출");
    return "main/index";
  }

}
