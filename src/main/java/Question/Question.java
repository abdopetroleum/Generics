package Question;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Question <T> {
    private String question;
    private int points;
    private T correctAnswer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public T getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(T correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public abstract void printCorrectAnswer();

}
