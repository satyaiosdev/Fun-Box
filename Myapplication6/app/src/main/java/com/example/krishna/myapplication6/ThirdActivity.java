package com.example.krishna.myapplication6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ThirdActivity extends Activity {
    TextView textView;
    EditText message_num;
    String numRegex   = ".*[0-9].*";
    String alphaRegex = ".*[A-Z].*";
    String display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        textView = (TextView)findViewById(R.id.message_num);

    }
    public void sendNum(View view)
    {
        message_num = (EditText)findViewById(R.id.message_num);
        String message = message_num.getText().toString();
//        Intent intent = new Intent(this,ThirdActivity.class);

//        startActivity(intent);
//        if (message.matches(numRegex)){
//            Random rn = new Random();
//            int answer = rn.nextInt(10) + 1;
//            String message1 = (answer+":is your Lucky Number");
////            textView.setText(message1);
//            Toast.makeText(ThirdActivity.this,
//                    message1, Toast.LENGTH_LONG).show();
//        }
//
//             else if (message.contains(alphaRegex)) {
//            Toast.makeText(ThirdActivity.this,
//                    "Enter valid DAY of a month", Toast.LENGTH_LONG).show();
//        }
//
//        else{
//
//            Toast.makeText(ThirdActivity.this,
//                    "Enter valid DAY of a month", Toast.LENGTH_LONG).show();
//        }

try {
    int number = Integer.parseInt(message);
    if (number > 0 && number < 32) {

        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        display = (answer + " is Your lucky number");
//            textView.setText(message);


        Toast.makeText(ThirdActivity.this,
                display, Toast.LENGTH_LONG).show();

    }
    else {

        Toast.makeText(ThirdActivity.this,
                "Enter valid day", Toast.LENGTH_LONG).show();
    }
}
catch (Exception e) {

    {
        Toast.makeText(ThirdActivity.this,
                "Enter valid day of a month", Toast.LENGTH_LONG).show();


    }
}


    }


}
