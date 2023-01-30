package com.example.mathapp;

import java.util.Random;

public class QuestionMultip {

    private int firstNumber;
    private int secondNumber;
    private int answerMultip;

    private int[] answerMultipArray;
    private int upperlimit;
    private String questionPharse;

    private int answerMultipPosition;


    public QuestionMultip(int upperLimit){

        this.upperlimit=upperLimit;
        Random random=new Random();

        this.firstNumber=random.nextInt(10-0)-0;
        this.secondNumber=random.nextInt(10-0)-0;

        this.answerMultip=this.firstNumber*this.secondNumber;
        this.questionPharse=firstNumber+"X"+this.secondNumber+"=";
        this.answerMultipPosition=random.nextInt(4);


        this.answerMultipArray=new int[]{0,1,2,3};
        this.answerMultipArray [0]=answerMultip-3;
        this.answerMultipArray [1]=answerMultip+6;
        this.answerMultipArray [2]=answerMultip+2;
        this.answerMultipArray [3]=answerMultip+1;

        this.answerMultipArray=shuffleArray(this.answerMultipArray);
        answerMultipArray[answerMultipPosition]=answerMultip;




    }

    private int [] shuffleArray(int [] array){
        int index,temp;
        Random rnd=new Random();

        for (int i=array.length-1;i>0;i--){
            index=rnd.nextInt(i+1);
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

    public int getAnswerMultip() {
        return answerMultip;
    }

    public void setAnswerMultip(int answerMultip) {
        this.answerMultip = answerMultip;
    }

    public int[] getAnswerMultipArray() {
        return answerMultipArray;
    }

    public void setAnswerMultipArray(int[] answerMultipArray) {
        this.answerMultipArray = answerMultipArray;
    }

    public int getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(int upperlimit) {
        this.upperlimit = upperlimit;
    }

    public String getQuestionPharse() {
        return questionPharse;
    }

    public void setQuestionPharse(String questionPharse) {
        this.questionPharse = questionPharse;
    }

    public int getAnswerMultipPosition() {
        return answerMultipPosition;
    }

    public void setAnswerMultipPosition(int answerMultipPosition) {
        this.answerMultipPosition = answerMultipPosition;
    }
}
