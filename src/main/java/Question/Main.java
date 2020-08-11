package Question;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SingleChoiceQuestion singleChoiceQuestion = new SingleChoiceQuestion();
        singleChoiceQuestion.setCorrectAnswer("Abdo");

        MultibleChoiceQuestion multibleChoiceQuestion = new MultibleChoiceQuestion();
        multibleChoiceQuestion.setCorrectAnswer(new ArrayList<String>() {
            {
                add("abdo");
                add("Mohamed");
                add("esam");
            }
        });

        System.out.println("Single Choice answer");
        singleChoiceQuestion.printCorrectAnswer();

        System.out.println("Multiple choice answer ");
        multibleChoiceQuestion.printCorrectAnswer();

    }

}
