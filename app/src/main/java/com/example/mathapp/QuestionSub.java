package com.example.mathapp;

import java.util.Random;

public class QuestionSub {


    private  int firstNumber;
    private  int secondNumber;
    private  int answerSub;
    private  int [] answerSubArray;

    private int answerSubPosition;

    private  int upperLimit;
    private String questionPharse;

    public  QuestionSub(int upperLimit){
        this.upperLimit=upperLimit;
        Random random=new Random();
        this.firstNumber=random.nextInt(40-10)+10;
        this.secondNumber=random.nextInt(10-0)+0;


        this.answerSub=Math.abs(this.firstNumber-this.secondNumber);
        this.questionPharse=firstNumber+"-"+secondNumber+"=";
        this.answerSubPosition=random.nextInt(4);




        this.answerSubArray=new int [] {0,1,2,3};
        this.answerSubArray[0]=answerSub-1;
        this.answerSubArray[1]=answerSub+3;
        this.answerSubArray[2]=answerSub+17;
        this.answerSubArray[3]=answerSub+7;


        this.answerSubArray=shuffleArray(this.answerSubArray);

        answerSubArray[answerSubPosition]=answerSub;

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

    public int getAnswerSub() {
        return answerSub;
    }

    public void setAnswerSub(int answerSub) {
        this.answerSub = answerSub;
    }

    public int[] getAnswerSubArray() {
        return answerSubArray;
    }

    public void setAnswerSubArray(int[] answerSubArray) {
        this.answerSubArray = answerSubArray;
    }

    public int getAnswerSubPosition() {
        return answerSubPosition;
    }

    public void setAnswerSubPosition(int answerSubPosition) {
        this.answerSubPosition = answerSubPosition;
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
