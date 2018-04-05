package com.example.setsn.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView edittext;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        edittext=(EditText)findViewById(R.id.edittext);
        button=(Button)findViewById(R.id.button);
    }
    public void Click (View v){
        String text = edittext.getText().toString();
        textView.setText(text);
    }
}
