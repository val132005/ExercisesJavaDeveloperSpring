package com.val132005.spring.reference;

public class Student {
    private Score score;


    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
