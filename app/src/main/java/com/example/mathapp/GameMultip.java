package com.example.mathapp;

import java.util.ArrayList;
import java.util.List;

public class GameMultip {

    private List<QuestionMultip> questionMultips=new ArrayList<>();
    private int numberCorrect;
    private  int numberIncorrect;
    private int totalQuestions;
    private int score;

    private QuestionMultip currentQuestions;
    public GameMultip(){

        //structure
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuestions=new QuestionMultip(10);
        questionMultips=new ArrayList<QuestionMultip>();



    }
    public  void makeNewQuestion(){
        //toplam soru sayısını artıracak güncel tutacak bir method yazıypruz
        currentQuestions=new QuestionMultip(totalQuestions*2+5);
        totalQuestions++;
        questionMultips.add(currentQuestions);//litemize soru sayısnı ekledik
    }

    public boolean checkAnswer(int submitedAnswer){
        boolean isCorrect;
        if (currentQuestions.getAnswerMultip()==submitedAnswer){
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

    public List<QuestionMultip> getQuestionMultips() {
        return questionMultips;
    }

    public void setQuestionMultips(List<QuestionMultip> questionMultips) {
        this.questionMultips = questionMultips;
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

    public QuestionMultip getCurrentQuestions() {
        return currentQuestions;
    }

    public void setCurrentQuestions(QuestionMultip currentQuestions) {
        this.currentQuestions = currentQuestions;
    }
}
