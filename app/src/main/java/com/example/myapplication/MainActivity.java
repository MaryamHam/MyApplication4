package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 ;
    boolean playerX = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignId();
        setClicks();

    }
    void setClicks() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(btn9);
            }
        });
    }

    void actionButton(Button btn) {
        if (btn.getText().equals("")) {
            if (playerX) {
                btn.setText("X");
            } else {
                btn.setText("O");
            }
            playerX = !playerX;

            checkEndGame();

        } else {
            Toast.makeText(getApplicationContext(), "exist before", Toast.LENGTH_SHORT).show();
        }
    }

    void checkEndGame() {

        if (
                ( btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X"))
                        ||  ( btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X"))
                        ||  ( btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X"))
                        ||  ( btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X"))
                        ||  ( btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X"))
                        ||  ( btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X"))
                        ||  ( btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X"))
                        ||  ( btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X"))
        ) {
            Toast.makeText(getApplicationContext(),  "Player 1 win !!!", Toast.LENGTH_LONG).show();
        }else if (
                ( btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O"))
                        ||  ( btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O"))
                        ||  ( btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O"))
                        ||  ( btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O"))
                        ||  ( btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O"))
                        ||  ( btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O"))
                        ||  ( btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O"))
                        ||  ( btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O"))

        ){
            Toast.makeText(getApplicationContext(),  "Player 2 win !!!", Toast.LENGTH_LONG).show();

        }
    }
    void assignId(){
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
    }
}