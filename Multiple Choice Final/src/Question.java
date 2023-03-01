import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Question{
//    ArrayList<String> question = new ArrayList<>();
//    ArrayList<String> choice = new ArrayList<>();
    ArrayList<String> answer = new ArrayList<>();

    private String userAnswer;

    public Question (String userAnswer) throws IOException {
        this.userAnswer = userAnswer;
        boolean isCorrect = false;

        File answerFile = new File("Answers.txt");
        FileReader fr2 = new FileReader(answerFile);
        BufferedReader br2 = new BufferedReader(fr2);

        String answerLine;

        while ((answerLine = br2.readLine()) != null){
            answer.add(answerLine);
        }
        br2.close();

        int answerFromTheFile = 0;
        for (int i = 0; i <= answer.size() - 1; i++){
            if (getUserAnswer().equals(answer.get(i))){
                System.out.println("Correct");
                isCorrect = true;
            }
        }
        if (isCorrect == false){
            System.out.println("Incorrect...");
        }
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public String toString(){
        return "You chose " + getUserAnswer()+ ".";
    }
}
