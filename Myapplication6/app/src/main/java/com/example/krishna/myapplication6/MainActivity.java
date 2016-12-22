package com.example.krishna.myapplication6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by satya on 4/18/2016.
 */
public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        textView = (TextView)findViewById(R.id.textView2);

    }

    public void menu(View view)
    {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Buddy Search"))
        {
            Intent intent =new Intent(this,FirstActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("Monty Hall"))
        {
            Intent intent =new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("Number Game"))
        {
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
