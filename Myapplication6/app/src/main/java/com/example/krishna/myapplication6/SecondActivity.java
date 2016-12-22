package com.example.krishna.myapplication6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by satya on 4/16/2016.
 */
public class SecondActivity extends Activity{
    TextView textView;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        textView = (TextView)findViewById(R.id.textView1);
    }
    public void monty_hall(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();

        Random rn = new Random();
        int answer = rn.nextInt(2) + 1;


        int bet = rn.nextInt(99) + 1;

        if(button_text.equals("DOOR 1"))
        {
            if(answer==1){
                result=("Congratlations, You Won"+bet+"$");
            }
            else
            {
                result="You Lost, it is a goat";
            }
        }
        else if(button_text.equals("DOOR 2"))
        {
            if(answer==2){
                result=("Congratlations, You Won"+bet+"$");
            }
            else
            {
                result="You Lost,it is a goat";
            }
        }
        else if(button_text.equals("DOOR 3"))
        {
            if(answer==3){
                result=("Congratlations, You Won"+bet+"$");
            }
            else
            {
                result="You Lost, it is a goat";
            }

        }
        Toast.makeText(SecondActivity.this,
                result, Toast.LENGTH_LONG).show();

    }
}
