package com.example.mathapp;

import java.util.Random;

public class QuestionDivide {
    private  int firstNumber;
    private  int secondNumber;
    private  int answerDivide;
    private  int [] answerDivideArray;

    private int answerDividePosition;

    private  int upperLimit;
    private String questionPharse;


    public QuestionDivide(int upperLimit){

        this.upperLimit=upperLimit;
        Random random=new Random();
        this.firstNumber=random.nextInt(20-10)+10;
        this.secondNumber=random.nextInt(10-1)+1;


        this.answerDivide=this.firstNumber/this.secondNumber;
        this.questionPharse=firstNumber+"÷"+secondNumber+"=";
        this.answerDividePosition=random.nextInt(4);




        this.answerDivideArray=new int [] {0,1,2,3};
        this.answerDivideArray[0]=answerDivide-1;
        this.answerDivideArray[1]=answerDivide+3;
        this.answerDivideArray[2]=answerDivide+17;
        this.answerDivideArray[3]=answerDivide+7;


        this.answerDivideArray=shuffleArray(this.answerDivideArray);

        answerDivideArray[answerDividePosition]=answerDivide;

    }

    private int [] shuffleArray(int [] array){
        int index,temp;
        Random rand=new Random();
        for (int i=array.length-1;i>0;i--){
            //rastgele bir sayı alıp bunun pozisyonun index içindeki
            //değerlerle değiş tokuş yapıyoruz
            index=rand.nextInt(i+1);
            temp=array[index];
            array[index]=array[i];
            array[i]=temp;

        }

        return  array;


    }


    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswerDivide() {
        return answerDivide;
    }

    public void setAnswerDivide(int answerDivide) {
        this.answerDivide = answerDivide;
    }

    public int[] getAnswerDivideArray() {
        return answerDivideArray;
    }

    public void setAnswerDivideArray(int[] answerDivideArray) {
        this.answerDivideArray = answerDivideArray;
    }

    public int getAnswerDividePosition() {
        return answerDividePosition;
    }

    public void setAnswerDividePosition(int answerDividePosition) {
        this.answerDividePosition = answerDividePosition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionPharse() {
        return questionPharse;
    }

    public void setQuestionPharse(String questionPharse) {
        this.questionPharse = questionPharse;
    }
}
