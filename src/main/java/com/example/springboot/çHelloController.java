package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HelloController {

    @RequestMapping("/")
    public String index() {
        return "GfQn3hVmLuVa95ogAyiK";
    }

}