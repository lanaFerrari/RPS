package com.nology;

import java.util.List;

public class Person {

String name;
int score = 0;
List<Integer> totalScore;

    public Person(String name) {
        this.name = name;
    }

    public Person() {};

    public void setScore() {
        this.score = score+1;
    }

    public void setTotalScore() {
        totalScore.add(score);
    }

}
