package com.eugens.jsonsample2;

import android.util.Log;

/**
 * Created by Eugen on 21.03.2015.
 */
public class Slide {
    String Letter;
    String Word;
    String Image;
    String Sound;


    public void printSlide(){
        Log.v("Letter", getLetter());
        Log.v("Word  ",  getWord());
        Log.v("Image ", getImage());
        Log.v("Sound ", getSound());
        Log.v("", "-----------------");

    }

    public String getLetter() {
        return Letter;
    }

    public String getWord() {
        return Word;
    }

    public String getImage() {
        return Image;
    }

    public String getSound() {
        return Sound;
    }

    public void setLetter(String letter) {
        Letter = letter;
    }

    public void setWord(String word) {
        Word = word;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setSound(String sound) {
        Sound = sound;
    }




}
