package com.game.word.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LetterViewController {

    @GetMapping("/letter/view")
    public String showRandomLetterPage(Model model) {
        // Add any model attributes here if needed
        return "Letter-homepage";
    }
}
