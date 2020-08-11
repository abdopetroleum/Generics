package Question;

public class SingleChoiceQuestion extends Question<String> {
    @Override
    public void printCorrectAnswer() {
        System.out.println(getCorrectAnswer());
    }
}
