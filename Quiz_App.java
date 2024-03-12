import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex;

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isCorrect(int selectedOption) {
        return selectedOption == correctOptionIndex;
    }

    public int getcorrectOptionsIndex() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getcorrectOptionsIndex'");
    }
}

class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (question.isCorrect(choice )) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
            System.out.println();
        }
        System.out.println("Quiz ended. Your score: " + score + "/" + questions.length);
    }
}

public class Quiz_App {
    public static void main(String[] args) {
        Question[] questions = {
            new Question("Who is the Father of Indian Missle technology?",
                    new String[]{"Dr Hammi Bhabha", "Dr Chidambaram", "Dr U.R.Rao", "Dr A.P.J Abdul Kalam"}, 4),
            new Question("What year was the United Nations established?",
                    new String[]{"1935", "1945", "1955", "1965"}, 2),
            new Question("How many elements are in the periodic table?",
                    new String[]{"112", "118", "122", "128"}, 2),
            new Question("Who is the father of Artificial Intelligence?",
                    new String[]{"Charles Babbage", "Lee De Forest", "John McCharthy", "JP Eckert"}, 3),
            new Question("Which of the following is the first calculating device?",
                    new String[]{"Abacus", "Calculator", "Turing Machine", "Pascaline"}, 1),
            new Question("Which of the following programming language is used to create programs like applets?",
                    new String[]{"COBOL", "C Language", "Java", "BASIC"}, 3)
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
