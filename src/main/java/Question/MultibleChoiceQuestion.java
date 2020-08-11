package Question;

import java.util.ArrayList;

public class MultibleChoiceQuestion extends Question<ArrayList<String>> {
    @Override
    public void printCorrectAnswer() {
        for (String answer:getCorrectAnswer()){
            System.out.println(answer);
        }
    }
}
