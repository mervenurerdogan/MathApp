package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {

    Button btn_start,btn_answer0,btn_answer1,btn_answer2,btn_answer3;
    TextView tv_score,tv_question,tv_timer,tv_bottomMesagge;
    ProgressBar prog_timer;

    GameSquart g=new GameSquart();
    int secondRemaining = 60; //kalan saniyeyi tutacak değişken


    CountDownTimer timer = new CountDownTimer(60000,1000) {
        @Override
        public void onTick(long l) {
            secondRemaining--;
            tv_timer.setText(Integer.toString(secondRemaining)+"sn");//kalan süreyi textview de yazdırdık
            prog_timer.setProgress(60 - secondRemaining);//ve kalan süre akışını progress bar dagösterdik


        }

        @Override
        public void onFinish() {

            btn_answer0.setEnabled(false);
            btn_answer1.setEnabled(false);
            btn_answer2.setEnabled(false);
            btn_answer3.setEnabled(false);
            tv_bottomMesagge.setText("Süre Doldu" + g.getNumberCorrect() + "/"+ (g.getTotalQuestions()-1)  );

            final Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn_start.setVisibility(View.VISIBLE);
                }
            }, 1000);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);





        btn_start=findViewById(R.id.btn_start);
        btn_answer0=findViewById(R.id.btn_answer0);
        btn_answer1=findViewById(R.id.btn_answer1);
        btn_answer2=findViewById(R.id.btn_answer2);
        btn_answer3=findViewById(R.id.btn_answer3);

        tv_score=findViewById(R.id.tv_score);
        tv_timer=findViewById(R.id.tv_timer);
        tv_question=findViewById(R.id.tv_questions);
        tv_bottomMesagge=findViewById(R.id.tv_bottomMessage);

        prog_timer=findViewById(R.id.prog_timer);

        tv_timer.setText("0Sn");
        tv_question.setText("");
        tv_score.setText("0 Puan");
        tv_bottomMesagge.setText("Doğru Cevabı Seç !");
        prog_timer.setProgress(0);


        View.OnClickListener startButtonClickListener =new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Button start_button= (Button) v;

                start_button.setVisibility(View.INVISIBLE);
                secondRemaining = 60;
                g = new GameSquart();
                nextTurn();
                timer.start();

            }

        };
        View.OnClickListener answerButtonClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button buttonClicked = (Button) v;

                int answerSelected =Integer.parseInt(buttonClicked.getText().toString());
                g.checkAnswer(answerSelected);
                tv_score.setText(Integer.toString(g.getScore()) + "puan");
                nextTurn();

            }
        };

        btn_start.setOnClickListener(startButtonClickListener);
        btn_answer0.setOnClickListener(answerButtonClickListener);
        btn_answer1.setOnClickListener(answerButtonClickListener);
        btn_answer2.setOnClickListener(answerButtonClickListener);
        btn_answer3.setOnClickListener(answerButtonClickListener);


    }
    private void nextTurn(){
        //soru üretilir
        //cevap şıkları etkin olavak
        //zaman başlatılmış olacak

        g.makeNewQuestion();
        int  [] answer= g.getCurrentQuesitons().getAnswerArray();
        btn_answer0.setText(Integer.toString(answer[0]));
        btn_answer1.setText(Integer.toString(answer[1]));
        btn_answer2.setText(Integer.toString(answer[2]));
        btn_answer3.setText(Integer.toString(answer[3]));

        btn_answer0.setEnabled(true);
        btn_answer1.setEnabled(true);
        btn_answer2.setEnabled(true);
        btn_answer3.setEnabled(true);

        tv_question.setText(g.getCurrentQuesitons().getQuestionPharse());

        tv_bottomMesagge.setText(g.getNumberCorrect()+"/" + (g.getTotalQuestions()-1));





    }


}