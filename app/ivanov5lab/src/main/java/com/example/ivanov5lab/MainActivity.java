package com.example.ivanov5lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView MyTextView = (TextView)findViewById(R.id.myText);
        MyTextView.setText("Пятая лабораторная работа");
        Button MyButton = (Button)findViewById(R.id.myBtn);
        MyButton.setText("Кнопка");
        MyButton.setClickable(false);
        CheckBox MyCheckbox = (CheckBox)findViewById(R.id.myChb);
        MyCheckbox.setText("Я - галочка");
        MyCheckbox.setChecked(true);
    }
}
