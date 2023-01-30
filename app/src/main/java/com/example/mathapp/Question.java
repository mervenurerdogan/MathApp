package com.example.mathapp;

import java.util.Random;

public class Question {

    private int fistNumber;
    private int secondNumber;
    private int answer;

    //4 tane cevabı tutacak olan dizi
    private int []  answerArray;

    //4 cevpatan doğru olanın konumu tutacak 0,1,2,3 hangisi doğru ise
    private  int answerPosition;

    //işlem yapılacak sayıların max değerini tutacak
    private int upperLimit;

    // işlem metni "9+6" gibi
    private  String questionPharse;

    // random soru üreteelim
    public Question(int upperLimit){
        this.upperLimit=upperLimit;
        Random randomNumber=new Random();

        this.fistNumber=randomNumber.nextInt(upperLimit);
        this.secondNumber=randomNumber.nextInt(upperLimit);
        this.answer=this.fistNumber+this.secondNumber;
        this.questionPharse=fistNumber+"+"+secondNumber+"=";

        this.answerPosition=randomNumber.nextInt(4);

        this.answerArray=new int []{0,1,2,3};
        this.answerArray[0] =answer+1;
        this.answerArray[1]=answer+10;
        this.answerArray[2]=answer-5;
        this.answerArray[3]=answer-10;

        this.answerArray=shuffleArray(this.answerArray);
        //doğru cevabı dizide bir yere yerleştirdik
        answerArray[answerPosition]=answer;



    }

    private int [] shuffleArray(int [] array){

        int index,temp;
        Random randomNumberGenerator=new Random();

        for (int i= array.length-1;i>0;i--){
            //rastgele bir sayı alıp bunun pozisyonun index içindeki
            //değerlerle değiş tokuş yapıyoruz
            index=randomNumberGenerator.nextInt(i+1);
            temp=array[index];
            array[index]=array[i];
            array[i]=temp;



        }

        return  array;



    }





    public int getFistNumber() {
        return fistNumber;
    }

    public void setFistNumber(int fistNumber) {
        this.fistNumber = fistNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerArray() {
        return answerArray;
    }

    public void setAnswerArray(int[] answerArray) {
        this.answerArray = answerArray;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
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
