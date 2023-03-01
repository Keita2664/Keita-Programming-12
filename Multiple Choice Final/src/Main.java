import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> storeQuestions = new ArrayList<>();
        ArrayList<String> storeChoices = new ArrayList<>();
        ArrayList<String> storeAnswers = new ArrayList<>();

        File questionFile = new File("Question.txt");
        File choicesFile = new File("Choices.txt");
        File answersFile = new File("Answers.txt");

        Scanner scanner = new Scanner(System.in);

        String multipleChoice;
        int score = 0;

        System.out.println("Welcome to the quiz making");
        System.out.println("Type in [1] to CREATE new quizzes");
        System.out.println("Type in [2] to TAKE the quiz");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("We well create new quizzes");
            System.out.println("Type in how many questions you would like to create");
            int numOfQuestions = scanner.nextInt();
            System.out.println("We will create " + numOfQuestions + " questions");

            for (int i = 1; i <= numOfQuestions; i++) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Type in your No. " + i + " question followed by your 4 choices and answer.");
                String question = scanner1.nextLine();
                String choice1 = scanner1.nextLine();
                String choice2 = scanner1.nextLine();
                String choice3 = scanner1.nextLine();
                String choice4 = scanner1.nextLine();
                String answer = scanner1.nextLine();
                Quiz quiz = new Quiz(question, choice1, choice2, choice3, choice4, answer);
                System.out.println(quiz);
            }
        } else if (userChoice == 2) {
            if (questionFile.exists()) {
                System.out.println("We have a quiz for you:");

                FileReader fr = new FileReader(questionFile);
                BufferedReader br = new BufferedReader(fr);

                FileReader fr1 = new FileReader(choicesFile);
                BufferedReader br1 = new BufferedReader(fr1);

                FileReader fr2 = new FileReader(answersFile);
                BufferedReader br2 = new BufferedReader(fr2);
                String questionLine;
                String choiceLine;
                String answerLine;
                while ((questionLine = br.readLine()) != null) {
                    storeQuestions.add(questionLine);
                }
                while ((choiceLine = br1.readLine()) != null) {
                    storeChoices.add(choiceLine);
                }
                while ((answerLine = br2.readLine()) != null) {
                    storeAnswers.add(answerLine);
                }

                for (int x = 0; x <= storeQuestions.size() - 1; x++) {
                    System.out.println("Quiz No." + Math.addExact(x, 1) + ".");
                    System.out.println(storeQuestions.get(x));
                    for (int j = 0; j <= 3; j++) {
                        System.out.println("[Choice No." + Math.addExact(j, 1) + "] " + storeChoices.get(j + x * 4) + " ");
                    }
                    Scanner scanner1 = new Scanner(System.in);
                    multipleChoice = scanner1.nextLine();
                    Question question = new Question(multipleChoice);
                    System.out.println(question);
                }
            }
        }
    }}