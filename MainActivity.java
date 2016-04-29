package com.example.android.howto3dprintin5steps;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void responseText(boolean userHas3DModel)
    {String yesButton = "Begin on Step 3!";
        String noButton = "Awesome! Start with Step 1!";
        setContentView(R.layout.activity_main);
        TextView outputText = (TextView) findViewById(R.id.textView);
        if (!userHas3DModel) {
            System.out.println(yesButton);
            outputText.setText(yesButton);
        } else {
            System.out.println(noButton);
            outputText.setText(noButton);
        }

    }

    //This was the original code to change the button message (doesn't work anymore)
    public void buttonOnClick(View v)
    {
        Button button = (Button)v;
        responseText(true);

        //   ((Button)v).setText("Awesome! Start at Step 1!");
    }

    public void ButtonOnClick2 (View v)
    {
        Button button2 = (Button)v;
        responseText(false);

        //  ((Button)v).setText("Skip to Step 3!");
    }

}