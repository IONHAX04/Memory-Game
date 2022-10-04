package com.example.task1;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.Arrays;
import java.util.Collections;

public class MediumActivity extends AppCompatActivity {

    TextView player_1, player_2;
    ImageView i11,i12,i13,i14,i21,i22,i23,i24,i31,i32,i33,i34,i41,i42,i43,i44;

    // array of images
    Integer cardsArray[] = { 101, 102, 103, 104, 105, 106, 107, 108, 201, 202, 203, 204, 205, 206, 207, 208};

    // images
    int image101, image102, image103, image104, image105, image106, image107, image108, image201, image202, image203, image204, image205, image206, image207, image208;

    int firstCard, secondCard;
    int clickFirst, clickSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium_activity_scores);

        player_1 = (TextView) findViewById (R.id.player_1);
        player_2 = (TextView) findViewById (R.id.player_2);

        i11 = (ImageView) findViewById(R.id.i11);
        i12 = (ImageView) findViewById(R.id.i12);
        i13 = (ImageView) findViewById(R.id.i13);
        i14 = (ImageView) findViewById(R.id.i14);

        i21 = (ImageView) findViewById(R.id.i21);
        i22 = (ImageView) findViewById(R.id.i22);
        i23 = (ImageView) findViewById(R.id.i23);
        i24 = (ImageView) findViewById(R.id.i24);

        i31 = (ImageView) findViewById(R.id.i31);
        i32 = (ImageView) findViewById(R.id.i32);
        i33 = (ImageView) findViewById(R.id.i33);
        i34 = (ImageView) findViewById(R.id.i34);

        i41 = (ImageView) findViewById(R.id.i41);
        i42 = (ImageView) findViewById(R.id.i42);
        i43 = (ImageView) findViewById(R.id.i43);
        i44 = (ImageView) findViewById(R.id.i44);


        i11.setTag("0");
        i12.setTag("1");
        i13.setTag("2");
        i14.setTag("3");

        i21.setTag("4");
        i22.setTag("5");
        i23.setTag("6");
        i24.setTag("7");

        i31.setTag("8");
        i32.setTag("9");
        i33.setTag("10");
        i34.setTag("11");

        i41.setTag("12");
        i42.setTag("13");
        i43.setTag("14");
        i44.setTag("15");

        frontOfCardResources(); // to load the images

        Collections.shuffle(Arrays.asList(cardsArray)); // to shuffle images

        player_2.setTextColor(Color.RED);
        // 11
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i11, theCard);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i12, theCard);
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i13, theCard);
            }
        });
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i14, theCard);
            }
        });
        //22
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i21, theCard);
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i22, theCard);
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i23, theCard);
            }
        });
        i24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i24, theCard);
            }
        });
        //33
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i31, theCard);
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i32, theCard);
            }
        });
        i33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i33, theCard);
            }
        });
        i34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i34, theCard);
            }
        });

        i41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i41, theCard);
            }
        });
        i42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i42, theCard);
            }
        });
        i43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i43, theCard);
            }
        });
        i44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(i44, theCard);
            }
        });
    }
    private void doStuff(ImageView i, int card ){
        if(cardsArray[card] == 101){
            i.setImageResource(image101);
        }
        else if(cardsArray[card] == 102){
            i.setImageResource(image102);
        }
        else if(cardsArray[card] == 103){
            i.setImageResource(image103);
        }
        else if(cardsArray[card] == 104){
            i.setImageResource(image104);
        }
        else if(cardsArray[card] == 105){
            i.setImageResource(image105);
        }
        else if(cardsArray[card] == 106){
            i.setImageResource(image106);
        }
        else if(cardsArray[card] == 107){
            i.setImageResource(image107);
        }
        else if(cardsArray[card] == 108){
            i.setImageResource(image108);
        }
        else if(cardsArray[card] == 201){
            i.setImageResource(image201);
        }
        else if(cardsArray[card] == 202){
            i.setImageResource(image202);
        }
        else if(cardsArray[card] == 203){
            i.setImageResource(image203);
        }
        else if(cardsArray[card] == 204){
            i.setImageResource(image204);
        }
        else if(cardsArray[card] == 205){
            i.setImageResource(image205);
        }
        else if(cardsArray[card] == 206){
            i.setImageResource(image206);
        }
        else if(cardsArray[card] == 207){
            i.setImageResource(image207);
        }
        else if(cardsArray[card] == 208){
            i.setImageResource(image208);
        }

        // checking which is selected and save it
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickFirst = card;
            i.setEnabled(false);
        }
        else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickSecond = card;

            i11.setEnabled(false);
            i12.setEnabled(false);
            i13.setEnabled(false);
            i14.setEnabled(false);

            i21.setEnabled(false);
            i22.setEnabled(false);
            i23.setEnabled(false);
            i24.setEnabled(false);

            i31.setEnabled(false);
            i32.setEnabled(false);
            i33.setEnabled(false);
            i34.setEnabled(false);

            i41.setEnabled(false);
            i42.setEnabled(false);
            i43.setEnabled(false);
            i44.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();  // check the cards are same or not
                }
            },800);
        }
    }

    private void calculate(){
        if(firstCard == secondCard){
            if(clickFirst == 0){
                i11.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 1){
                i12.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 2){
                i13.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 3){
                i14.setVisibility(View.INVISIBLE);
            }

            else if(clickFirst == 4){
                i21.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 5){
                i22.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 6){
                i23.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 7){
                i24.setVisibility(View.INVISIBLE);
            }

            else if(clickFirst == 8){
                i31.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 9){
                i32.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 10){
                i33.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst ==11){
                i34.setVisibility(View.INVISIBLE);
            }

            else if(clickFirst == 12){
                i41.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 13){
                i42.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 14){
                i43.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 15){
                i44.setVisibility(View.INVISIBLE);
            }




            if(clickSecond == 0){
                i11.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 1){
                i12.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 2){
                i13.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 3){
                i14.setVisibility(View.INVISIBLE);
            }

            else if(clickSecond == 4){
                i21.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 5){
                i22.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 6){
                i23.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 7){
                i24.setVisibility(View.INVISIBLE);
            }

            else if(clickSecond == 8){
                i31.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 9){
                i32.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 10){
                i33.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond ==11){
                i34.setVisibility(View.INVISIBLE);
            }

            else if(clickSecond == 12){
                i41.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 13){
                i42.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 14){
                i43.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 15){
                i44.setVisibility(View.INVISIBLE);
            }



            if(turn == 1){
                playerPoints++;
                player_1.setText("P1 : "+ playerPoints);
            }
            else if(turn == 2){
                cpuPoints++;
                player_2.setText("P2 : "+cpuPoints);
            }
        }
        else {
            i11.setImageResource(R.drawable.joker);
            i12.setImageResource(R.drawable.joker);
            i13.setImageResource(R.drawable.joker);
            i14.setImageResource(R.drawable.joker);
            i21.setImageResource(R.drawable.joker);
            i22.setImageResource(R.drawable.joker);
            i23.setImageResource(R.drawable.joker);
            i24.setImageResource(R.drawable.joker);
            i31.setImageResource(R.drawable.joker);
            i32.setImageResource(R.drawable.joker);
            i33.setImageResource(R.drawable.joker);
            i34.setImageResource(R.drawable.joker);
            i41.setImageResource(R.drawable.joker);
            i42.setImageResource(R.drawable.joker);
            i43.setImageResource(R.drawable.joker);
            i44.setImageResource(R.drawable.joker);

            if(turn == 1){
                turn = 2;
                player_1.setTextColor(Color.RED);
                player_2.setTextColor(Color.GREEN);
            }
            else if(turn == 2){
                turn = 1;
                player_2.setTextColor(Color.RED);
                player_1.setTextColor(Color.GREEN);
            }
        }
        i11.setEnabled(true);
        i12.setEnabled(true);
        i13.setEnabled(true);
        i14.setEnabled(true);
        i21.setEnabled(true);
        i22.setEnabled(true);
        i23.setEnabled(true);
        i24.setEnabled(true);
        i31.setEnabled(true);
        i32.setEnabled(true);
        i33.setEnabled(true);
        i34.setEnabled(true);
        i41.setEnabled(true);
        i42.setEnabled(true);
        i43.setEnabled(true);
        i44.setEnabled(true);

        checkEnd();
    }

    private void checkEnd(){
        if(i11.getVisibility() == View.INVISIBLE && i12.getVisibility() == View.INVISIBLE && i13.getVisibility() == View.INVISIBLE && i14.getVisibility() == View.INVISIBLE &&
                i21.getVisibility() == View.INVISIBLE && i22.getVisibility() == View.INVISIBLE && i23.getVisibility() == View.INVISIBLE && i24.getVisibility() == View.INVISIBLE &&
                i31.getVisibility() == View.INVISIBLE && i32.getVisibility() == View.INVISIBLE && i33.getVisibility() == View.INVISIBLE && i34.getVisibility() == View.INVISIBLE &&
                i41.getVisibility() == View.INVISIBLE && i42.getVisibility() == View.INVISIBLE && i43.getVisibility() == View.INVISIBLE && i44.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MediumActivity.this);
            alertDialogBuilder.setMessage("GAME OVER...\nPlayer 1 points " + playerPoints + "\nPlayer 2 points "+cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MediumActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })

                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void frontOfCardResources(){
        image101 = R.drawable.img1;
        image102 = R.drawable.img2;
        image103 = R.drawable.img3;
        image104 = R.drawable.img4;

        image105 = R.drawable.img5;
        image106 = R.drawable.img6;
        image107 = R.drawable.img7;
        image108 = R.drawable.img8;

        image201 = R.drawable.img201;
        image202 = R.drawable.img202;
        image203 = R.drawable.img203;
        image204 = R.drawable.img204;

        image205 = R.drawable.img205;
        image206 = R.drawable.img206;
        image207 = R.drawable.img207;
        image208 = R.drawable.img208;
    }

}