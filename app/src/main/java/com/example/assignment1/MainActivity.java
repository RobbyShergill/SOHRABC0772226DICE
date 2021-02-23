package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button higher_btn = (Button) findViewById(R.id.higher);
        Button lower_btn = (Button) findViewById(R.id.lower);
        TextView Result = (TextView) findViewById(R.id.Result_txt);
        ImageView user_dice_img= (ImageView) findViewById(R.id.user_dice);
        ImageView computer_dice_img = (ImageView) findViewById(R.id.computer_dice);

        //Higher Button Click event
        higher_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number = new Random();
                int user_score = Number.nextInt(6) + 1;
                int computer_score = Number.nextInt(6) + 1;

                switch (user_score){
                    case 1:
                        user_dice_img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_dice_img.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_dice_img.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_dice_img.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_dice_img.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_dice_img.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (computer_score){
                    case 1:
                        computer_dice_img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_dice_img.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_dice_img.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_dice_img.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_dice_img.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_dice_img.setImageResource(R.drawable.dice6);
                        break;

                }
                //0 = higher
                String result = compare_dices(user_score, computer_score, 0);
                Result.setText(result);
            }
        });

        //Lower Button click event
        lower_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number = new Random();
                int user_score = Number.nextInt(6) + 1;
                int computer_score = Number.nextInt(6) + 1;

                switch (user_score){
                    case 1:
                        user_dice_img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_dice_img.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_dice_img.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_dice_img.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_dice_img.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_dice_img.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (computer_score){
                    case 1:
                        computer_dice_img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_dice_img.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_dice_img.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_dice_img.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_dice_img.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_dice_img.setImageResource(R.drawable.dice6);
                        break;

                }
                //1 = lower
                String result = compare_dices(user_score, computer_score, 1);
                Result.setText(result);
            }
        });
    }
    
    public  String  compare_dices(int user_dice, int computer_dice, int cmp){
        String Result_display = "";
        if(cmp == 0){
            if(user_dice == computer_dice){
                //Tie
                Result_display = "It’s a tie";
            }else if (user_dice < computer_dice){
                //loose
                Result_display = "Computer Win!";
            }else {
                //Win
                Result_display = "User Win!";
            }
        }
        if(cmp == 1){
            if(user_dice == computer_dice){
                //Tie
                Result_display = "It’s a tie";
            }else if (user_dice > computer_dice){
                //loose
                Result_display = "Computer Win!";
            }else {
                //Win
                Result_display = "User Win!";
            }
        }
        return  Result_display;

    }
}