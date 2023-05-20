package edu.armenarzz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerApp {
    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
