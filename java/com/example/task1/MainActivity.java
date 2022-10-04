package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.small);
        button2 = (Button) findViewById(R.id.medium);
        button3 = (Button) findViewById(R.id.large);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BeginnerActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MediumActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdvancedActivity.class);
                startActivity(intent);
            }
        });


//        small.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openBeginnerActivity();
//            }
//        });
//
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main);
//        medium.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openMediumActivity();
//            }
//        });
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main);
//
//        large.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openAdvancedActivity();
//            }
//        });
//
//
//    }
//    public void openMediumActivity(){
//        Intent intent = new Intent(this, MediumActivity.class);
//        startActivity(intent);
//    }
//    public void openBeginnerActivity(){
//        Intent intent = new Intent(this,BeginnerActivity.class);
//        startActivity(intent);
//    }
//    public void openAdvancedActivity(){
//        Intent intent = new Intent(this,AdvancedActivity.class);
//        startActivity(intent);
//    }

}
}