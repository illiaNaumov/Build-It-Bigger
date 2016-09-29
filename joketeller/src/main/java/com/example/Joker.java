package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {
    private static ArrayList<String> learnedJokes;
    private Random random = new Random();

    public Joker(){
        learnedJokes = new ArrayList<>();
        learnedJokes.add("Can a kangaroo jump higher than a house? Of course, a house doesn't jump at all.");
        learnedJokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        learnedJokes.add("My wife's cooking is so bad we usually pray after our food.");
    }

    public String getJoke(){
        return getRandomJoke();
    }

    private String getRandomJoke(){
        int randNumber = random.nextInt(learnedJokes.size());
        return learnedJokes.get(randNumber);
    }
}
