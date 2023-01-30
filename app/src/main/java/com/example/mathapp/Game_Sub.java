package com.example.mathapp;

import java.util.ArrayList;
import java.util.List;

public class Game_Sub {


    private List<QuestionSub> questionSubs=new ArrayList<>();
    private int numberCorrect;
    private  int numberIncorrect;
    private int totalQuestions;
    private int score;
    private QuestionSub currentQuesitons;



    public  Game_Sub(){

        //structure
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuesitons=new QuestionSub(10);
        questionSubs=new ArrayList<QuestionSub>();

    }


    public  void makeNewQuestion(){
        //toplam soru sayısını artıracak güncel tutacak bir method yazıypruz
        currentQuesitons=new QuestionSub(totalQuestions*2+5);
        totalQuestions++;
        questionSubs.add(currentQuesitons);//litemize soru sayısnı ekledik
    }

    public boolean checkAnswer(int submitedAnswer){
        boolean isCorrect;
        if (currentQuesitons.getAnswerSub()==submitedAnswer){
            numberCorrect++;
            isCorrect=true;

        }
        else {
            numberIncorrect++;
            isCorrect=false;
        }

        score=numberCorrect*10-numberIncorrect*5;
        return  isCorrect;
    }


    public List<QuestionSub> getQuestionSubs() {
        return questionSubs;
    }

    public void setQuestionSubs(List<QuestionSub> questionSubs) {
        this.questionSubs = questionSubs;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect(int numberCorrect) {
        this.numberCorrect = numberCorrect;
    }

    public int getNumberIncorrect() {
        return numberIncorrect;
    }

    public void setNumberIncorrect(int numberIncorrect) {
        this.numberIncorrect = numberIncorrect;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public QuestionSub getCurrentQuesitons() {
        return currentQuesitons;
    }

    public void setCurrentQuesitons(QuestionSub currentQuesitons) {
        this.currentQuesitons = currentQuesitons;
    }
}
