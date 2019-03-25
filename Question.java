package ke.co.system.tukquizs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Question {

    public String questions[] = {
            "Who is the Chiarman of the SATUK 2019/2020Councill?",
            "Who is the Secretary General of SATUK 2019/2020 Councill?",
            "How many Executive posts are there in SATUK constitution?"
    };

    public String choices[][] = {
            {"Paul Karanja", "Cliff Oketch", "Nevil Othiambo", "Yasmine Abdi"},
            {"Karanja Ngethe","Nevil Odhiambo","Ouko R.", "Yasmine Abdi"},
            {"Ten", "Seven", "six", "Eight"}
    };

    public String correctAnswer[] = {
            {"Paul Karanja"},
            {"Nevil Odhiambo"},
            {"Seven"}
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }
    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }


    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}