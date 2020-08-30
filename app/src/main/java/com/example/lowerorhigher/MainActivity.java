package com.example.lowerorhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Guess(View view){
        String message="";
        Random random=new Random();
        int ran=random.nextInt(20);
        EditText editText=(EditText)findViewById(R.id.editTextNumber);
        TextView textView=(TextView)findViewById(R.id.editTextNumber);
        int input=Integer.parseInt(editText.getText().toString());
        if(input>ran){
            message="Higher";
        }
        else if (input<ran){
            message="Lower";
        }
        else{
            message="You are right!!";
        }
        Toast.makeText(this,  message, Toast.LENGTH_SHORT).show();
    }
}