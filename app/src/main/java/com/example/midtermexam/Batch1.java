package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Batch1 extends AppCompatActivity {
    char state = '0';
    TextView turn;
    LinearLayout Layout;

    Button grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        grid1 = (Button) findViewById(R.id.btn1);
        grid2 = (Button) findViewById(R.id.btn2);
        grid3 = (Button) findViewById(R.id.btn3);
        grid4 = (Button) findViewById(R.id.btn4);
        grid5 = (Button) findViewById(R.id.btn5);
        grid6 = (Button) findViewById(R.id.btn6);
        grid7 = (Button) findViewById(R.id.btn7);
        grid8  = (Button) findViewById(R.id.btn8);
        grid9 = (Button) findViewById(R.id.btn9);
        turn = (TextView) findViewById(R.id.textView);
        turn.setText("Player O's Turn");
        Layout = (LinearLayout) findViewById(R.id.Layout);
        Layout.setBackgroundColor(Color.BLUE);

        grid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid1.getText() == ""){
                    grid1.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid2.getText() == ""){
                    grid2.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid3.getText() == ""){
                    grid3.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid4.getText() == ""){
                    grid4.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid5.getText() == ""){
                    grid5.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid6.getText() == ""){
                    grid6.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid7.getText() == ""){
                    grid7.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid8.getText() == ""){
                    grid8.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });

        grid9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grid9.getText() == ""){
                    grid9.setText(String.valueOf(state));
                    TurnChanger();

                }
            }
        });
    }

    public void TurnChanger(){
        if (state == 'X') {
            state = '0';
            Layout.setBackgroundColor(Color.BLUE);
        } else {
            state = 'X';
            Layout.setBackgroundColor(Color.RED);
        }

        turn.setText("Player " + state + "'s turn");
    }
}