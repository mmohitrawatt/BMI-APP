package com.pbm.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtweight, editText2, editText3;
        Button button;
        TextView text;
        ConstraintLayout Contllmain;

        edtweight = findViewById(R.id.edtweight);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        Contllmain = findViewById(R.id.Contllmain);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtweight.getText().toString());
                int ft = Integer.parseInt(editText2.getText().toString());
                int in = Integer.parseInt(editText3.getText().toString());

                int totalIn = ft*12 + in;

                double totalCm = totalIn*2.53;

                double totalM = totalCm/100;
                double bmi = wt/(totalM*totalM);

                if (bmi>25){
                    text.setText("Apna Weight Km Krle");
                    Contllmain.setBackgroundColor(getResources().getColor(R.color.ColourOw));
                } else if (bmi<18){
                    text.setText("Sukde weight Gain krle ");
                    Contllmain.setBackgroundColor(getResources().getColor(R.color.ColourUw));

                }else{
                    text.setText("Tu Thik h!");
                    Contllmain.setBackgroundColor(getResources().getColor(R.color.ColourH));

                }


            }
        });


    }
}