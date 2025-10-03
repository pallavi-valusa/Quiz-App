import java.util.Scanner;

// Class representing a quiz question
class Question {
    String questionText;
    String[] options;
    int correctAnswer; // index (1-based)

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean askQuestion(Scanner sc) {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Your answer (1-" + options.length + "): ");
        int userAnswer = sc.nextInt();

        return userAnswer == correctAnswer;
    }
}

// Class to run quiz and show results
public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create quiz questions
        Question[] questions = {
            new Question("What is the capital of France?",
                    new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 3),
            new Question("Which language is used for Android development?",
                    new String[]{"Python", "Java", "C#", "Ruby"}, 2),
            new Question("Which planet is known as the Red Planet?",
                    new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 2)
        };

        int score = 0;

        System.out.println("===== Welcome to the Quiz =====\n");

        // Loop through questions
        for (Question q : questions) {
            if (q.askQuestion(sc)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        // Show result
        System.out.println("===== Quiz Finished =====");
        System.out.println("Your score: " + score + " out of " + questions.length);

        // Calculate percentage
        double percentage = ((double) score / questions.length) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Pass/Fail status
        if (percentage >= 50) {
            System.out.println("Result: PASS 🎉");
        } else {
            System.out.println("Result: FAIL ❌");
        }

        sc.close();
    }
}
