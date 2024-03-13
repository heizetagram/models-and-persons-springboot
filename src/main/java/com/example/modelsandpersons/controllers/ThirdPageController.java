package com.example.modelsandpersons.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThirdPageController {
    @GetMapping("/third_page")
    public String secondPage() {

        return "home/third_page";
    }
}
