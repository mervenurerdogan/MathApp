package com.example.mathapp;

import java.util.ArrayList;
import java.util.List;

public class GameDividie {

    private List<QuestionDivide> questionDivide=new ArrayList<>();
    private int numberCorrect;
    private  int numberIncorrect;
    private int totalQuestions;
    private int score;
    private QuestionDivide currentQuesitons;

    public GameDividie (){
        //structure
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuesitons=new QuestionDivide(10);
        questionDivide=new ArrayList<QuestionDivide>();

    }

    public  void makeNewQuestion(){
        //toplam soru sayısını artıracak güncel tutacak bir method yazıypruz
        currentQuesitons=new QuestionDivide(totalQuestions*2+5);
        totalQuestions++;
        questionDivide.add(currentQuesitons);//litemize soru sayısnı ekledik
    }

    public boolean checkAnswer(int submitedAnswer){
        boolean isCorrect;
        if (currentQuesitons.getAnswerDivide()==submitedAnswer){
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

    public List<QuestionDivide> getQuestionDivide() {
        return questionDivide;
    }

    public void setQuestionDivide(List<QuestionDivide> questionDivide) {
        this.questionDivide = questionDivide;
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

    public QuestionDivide getCurrentQuesitons() {
        return currentQuesitons;
    }

    public void setCurrentQuesitons(QuestionDivide currentQuesitons) {
        this.currentQuesitons = currentQuesitons;
    }
}
