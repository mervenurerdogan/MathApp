package com.example.mathapp;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Question> questions = new ArrayList<>();
    private  int numberCorrect;
    private int numberIncorrect;
    private int totalQuestions;
    private int score;
    private Question currentQuestions;

    public  Game(){
        //structure
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuestions = new Question(10);
        questions = new ArrayList<Question>();



    }

    public  void makeNewQuestion(){
        //toplam soru sayısını artıracak güncel tutacak bir method yazıypruz
        currentQuestions=new Question(totalQuestions*2+5);
        totalQuestions++;
        questions.add(currentQuestions);//litemize soru sayısnı ekledik
    }

    public  boolean chechAnswer(int submitedAnswer){
        //soruların doğruluğunu kontrol ediyoruz

        boolean isCorrect;
        if(currentQuestions.getAnswer()==submitedAnswer){
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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

    public Question getCurrentQuestions() {
        return currentQuestions;
    }

    public void setCurrentQuestions(Question currentQuestions) {
        this.currentQuestions = currentQuestions;
    }
}
