package com.example.krishna.myapplication6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstActivity extends Activity {
//public class FirstActivity extends MainActivity {
    TextView textView;
    public String input;
    EditText message_text;
    String numRegex   = ".*[0-9].*";
    String speialRegex = ".*[!@#\\$%\\^\\&*\\)\\(+=._-]+$]*.";
    String alphaRegex = ".*[A-Z].*";
    String expression = "^[a-zA-Z]*$";


    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        textView = (TextView)findViewById(R.id.message_text);
        }


    public void sendMessage(View views)

    {
        message_text = (EditText)findViewById(R.id.message_text);
        String message = message_text.getText().toString();
//        Intent intent = new Intent(this,FirstActivity.class);
        CharSequence inputStr = message;
//        startActivity(intent);

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            Random r = new Random();
            char c = (char) (r.nextInt(21) + 'A');
            String message1 = ("Your buddy name starts with :" + c);
//            textView.setText(message1);
            Toast.makeText(this,
                    message1, Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,
                    "Enter valid first name", Toast.LENGTH_LONG).show();
        }


//        if (message.matches(numRegex)||message.matches(speialRegex)) {
//            Toast.makeText(FirstActivity.this,
//                    "Enter valid first name", Toast.LENGTH_LONG).show();
//        }
//
//        else
//        if(message.matches("[a-zA-Z]")){
//
//            Random r = new Random();
//            char c = (char) (r.nextInt(21) + 'A');
//            String message1 = ("Your buddy name starts with :" + c);
//            textView.setText(message1);
//            Toast.makeText(FirstActivity.this,
//                    message1, Toast.LENGTH_LONG).show();
//        }
//        else
//        {
//            Toast.makeText(FirstActivity.this,
//                    "Enter valid first name", Toast.LENGTH_LONG).show();
//        }
    }

}
