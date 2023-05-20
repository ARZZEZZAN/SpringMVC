package edu.armenarzz.spring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "controller/hello";
    }
    @GetMapping("/bye")
    public String byePage() {
        return "controller/bye";
    }
}
