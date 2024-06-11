package com.game.word.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.word.entity.Letter;

@Repository
public interface LetterRepository extends JpaRepository<Letter, Long> {
    // Custom query methods (if needed) can be added here
}
