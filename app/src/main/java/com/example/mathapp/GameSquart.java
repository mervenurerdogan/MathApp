package com.example.mathapp;

import java.util.ArrayList;
import java.util.List;

public class GameSquart {

    private List<QuestionSquare> questionSquares=new ArrayList<>();
    private int numberCorrect;
    private  int numberIncorrect;
    private int totalQuestions;
    private int score;
    private QuestionSquare currentQuesitons;


    public GameSquart() {
        numberCorrect=0;
        numberIncorrect=0;
        totalQuestions=0;
        score=0;
        currentQuesitons=new QuestionSquare(10);
        questionSquares=new ArrayList<QuestionSquare>();

    }

    public  void makeNewQuestion(){
        //toplam soru sayısını artıracak güncel tutacak bir method yazıypruz
        currentQuesitons=new QuestionSquare(totalQuestions*2+5);
        totalQuestions++;
        questionSquares.add(currentQuesitons);//litemize soru sayısnı ekledik
    }

    public boolean checkAnswer(int submitedAnswer){
        boolean isCorrect;
        if (currentQuesitons.getAnswer()==submitedAnswer){
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

    public List<QuestionSquare> getQuestionSquares() {
        return questionSquares;
    }

    public void setQuestionSquares(List<QuestionSquare> questionSquares) {
        this.questionSquares = questionSquares;
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

    public QuestionSquare getCurrentQuesitons() {
        return currentQuesitons;
    }

    public void setCurrentQuesitons(QuestionSquare currentQuesitons) {
        this.currentQuesitons = currentQuesitons;
    }
}
