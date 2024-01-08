package com.example.infinitypobnd.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@NoArgsConstructor
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String home() {

        return "index.html";

    }

}
