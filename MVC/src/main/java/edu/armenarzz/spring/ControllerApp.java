package edu.armenarzz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerApp {
    @GetMapping("/hello-world")
    public String hello() {
        System.out.println("hui");
        return "hello_world";
    }
}
