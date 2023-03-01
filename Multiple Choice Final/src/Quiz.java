import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz {
// Three arraylists to store questions, choices, and answers
    ArrayList<String> storeQuestion = new ArrayList<>();
    ArrayList<String> storeChoices = new ArrayList<>();
    ArrayList<String> storeAnswer = new ArrayList<>();

    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String answer;


    public Quiz(String question, String choice1, String choice2, String choice3, String choice4, String answer) throws IOException {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.answer = answer;

// storing user generated questions, choices, and answers in each arraylist
        storeQuestion.add(getQuestion());
        storeChoices.add(getChoice1());
        storeChoices.add(getChoice2());
        storeChoices.add(getChoice3());
        storeChoices.add(getChoice4());
        storeAnswer.add(getAnswer());

// transport questions, choices, and answers to text file
        File questionFile = new File("Question.txt");
        File choiceFile = new File("Choices.txt");
        File answerFile = new File("Answers.txt");

        FileWriter fw = new FileWriter(questionFile,true);
        FileWriter fw1 = new FileWriter(choiceFile,true);
        FileWriter fw2 = new FileWriter(answerFile,true);

        BufferedWriter bw = new BufferedWriter(fw);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        for (int i = 0; i <= storeQuestion.size() - 1; i++){
            bw.write(storeQuestion.get(i) + "\r");
            bw2.write(storeAnswer.get(i) + "\r");

            for (int j = 0; j <= 3; j++){
                bw1.write(storeChoices.get(j) + "\r");
            }
        }
        bw.close();
        bw1.close();
        bw2.close();
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public String getAnswer(){
        return answer;
    }

    public String toString(){
        return "Question: " + question + "\n" + "Choice1: " + choice1 + "\n" + "Choice2: " + choice2 + "\n"
                + "choice3: " + choice3 + "\n" + "Choice4: " + choice4 + "\n";
    }
}
