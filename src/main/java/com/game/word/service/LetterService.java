package com.game.word.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.word.entity.Letter;
import com.game.word.repository.LetterRepository;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    public List<Letter> getAllLetters() {
        return letterRepository.findAll();
    }

    public Letter getLetterById(Long id) {
        return letterRepository.findById(id).orElse(null);
    }

    public Letter saveLetter(Letter letter) {
        return letterRepository.save(letter);
    }

    public void deleteLetter(Long id) {
        letterRepository.deleteById(id);
    }

    public Letter getRandomLetterByRating(String rating) {
        List<Letter> letters = letterRepository.findAll().stream()
                .filter(letter -> letter.getRating().equalsIgnoreCase(rating))
                .collect(Collectors.toList());

        if (letters.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(letters.size());
        return letters.get(index);
    }
}
