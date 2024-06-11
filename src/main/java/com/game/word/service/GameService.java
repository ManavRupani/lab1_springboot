package com.game.word.service;
import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class GameService {
    private String[] randomWords = {"cat","hello","sister"};
    Random random = new Random();
    public String getRandomWord() {
        return randomWords[random.nextInt(randomWords.length)];
    }
}
