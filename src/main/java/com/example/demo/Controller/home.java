package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

    @GetMapping("/")
    public String index() {
        return "index"; // Maps to src/main/resources/templates/index.html
    }

    // About page
    @GetMapping("/about")
    public String about() {
        return "about"; // Maps to src/main/resources/templates/about.html
    }

    // Contact page
    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Maps to src/main/resources/templates/contact.html
    }
}
