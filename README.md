# Quiz-App
This is a Java console-based quiz application that allows users to attempt multiple-choice questions, records their answers, and displays the final score along with a pass/fail result
The program is structured into two main classes:

Question Class

Represents an individual quiz question.

Stores the question text, answer options, and the correct answer index.

Provides a method askQuestion() that displays the question and options, takes user input, and checks if the answer is correct.

QuizApp Class (Main Class)

Holds an array of Question objects (quiz questions).

Uses a loop to display each question, collect user input, and update the score based on correctness.

At the end, calculates the user’s total score and percentage.

Displays a Pass/Fail result (Pass if percentage ≥ 50%).
