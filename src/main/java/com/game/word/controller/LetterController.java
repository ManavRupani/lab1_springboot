package com.game.word.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.word.entity.Letter;
import com.game.word.service.LetterService;

@RestController
public class LetterController {

    @Autowired
    private LetterService letterService;

    @GetMapping("/letter/random")
    public ResponseEntity<Letter> getRandomLetter(@RequestParam String rating) {
        Letter randomLetter = letterService.getRandomLetterByRating(rating);
        if (randomLetter == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(randomLetter);
    }
}
