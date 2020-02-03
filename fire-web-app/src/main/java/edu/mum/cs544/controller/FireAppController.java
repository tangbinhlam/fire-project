package edu.mum.cs544.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FireAppController {

    @GetMapping("/")
    public String redirectRoot() {
        return "redirect:/fire";
    }

    @GetMapping("/fire")
    public String fire() {
        return "firehome";
    }

}
