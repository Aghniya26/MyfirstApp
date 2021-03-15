package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    TextView resultTextView;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton=(Button)findViewById(R.id.rollButton);
        resultTextView=(TextView)findViewById(R.id.resultTextView);
        seekBar=(SeekBar)findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rand= new Random().nextInt(seekBar.getProgress());

                resultTextView.setText(String.valueOf(rand));
                resultTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}