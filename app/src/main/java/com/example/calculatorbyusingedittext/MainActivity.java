package com.example.calculatorbyusingedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button sumButton, subButton, MulButton, DivButton;
    private TextView Resulttextlist;
    private EditText EditText1, EditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumButton = (Button) findViewById(R.id.sum_id);
        subButton = (Button) findViewById(R.id.sub_id);
        MulButton = (Button) findViewById(R.id.mul_id);
        DivButton = (Button) findViewById(R.id.div_id);
        EditText1 = (EditText)findViewById(R.id.lst_text);
        EditText2 = (EditText)findViewById(R.id.snd_text);
        Resulttextlist=(TextView)findViewById(R.id.text_id);

    }

    @SuppressLint("SetTextI18n")
    public  void showmessage(View view) {

        try {
            String number1 = EditText1.getText().toString();
            String number2 = EditText2.getText().toString();
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            if (view.getId() == R.id.sum_id) {
                double sum = num1 + num2;
                Resulttextlist.setText("summation is:" + sum);
            } else if (view.getId() == R.id.sub_id) {
                double sub = num1 - num2;
                Resulttextlist.setText("Substruction is:" + sub);
            } else if (view.getId() == R.id.mul_id) {
                double sub = num1 * num2;
                Resulttextlist.setText("Multiplication is:" + sub);
            } else {
                double div = num1 / num2;
                Resulttextlist.setText("Division is :"+div);
            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "Please Enter number", Toast.LENGTH_SHORT).show();
        }
    
    }
}
