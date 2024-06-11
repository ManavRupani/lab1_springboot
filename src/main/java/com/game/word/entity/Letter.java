package com.game.word.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Letters")
public class Letter {
    @Id
    private Long id;
    private String letter;
    private String rating;
    private String hint;

    // getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getHint(){
        return hint;
    }
    public void setHint(String hint){
        this.hint = hint;
    }

}