package com.yaotuanjie.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MessageController {

    @GetMapping
    public String list(Model model) {
        model.addAttribute("list", "adsfa");
        return "list";
    }
}
