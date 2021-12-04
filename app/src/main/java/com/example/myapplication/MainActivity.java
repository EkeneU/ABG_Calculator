package com.example.myapplication;

import static java.lang.Float.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.abg_calculator.ArterialBloodGasInterpretation;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtpH_abg =findViewById(R.id.pH_abg);
        EditText edtC02_abg=findViewById(R.id.C02_abg);
        EditText edtHC03_abg=findViewById(R.id.HC03_abg);
        TextView txt_ans_abg=findViewById(R.id.txt_ans_abg);

        Button btnans_abg=findViewById(R.id.ans_abg);



        btnans_abg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float PH_input= parseFloat(edtpH_abg.getText().toString());
                float PaC02= parseFloat(edtC02_abg.getText().toString());
                float HC03= parseFloat(edtHC03_abg.getText().toString());

                txt_ans_abg.getText().toString();

                Scanner scanner=new Scanner(System.in);


                    if(PH_input<7.35 && PaC02>45.0 && HC03>=22 && HC03<=28) {
                        String ans = "Respiratory acidosis";
                        txt_ans_abg.setText(ans);
                    }
                    else if(PH_input<=7.45 && PH_input>=7.35 && PaC02>45.0 && HC03>28.0) {
                        String ans = "Compensated Respiratory Acidosis / Compensated Metabolic Alkalosis.";
                        txt_ans_abg.setText(ans);
                    }

                    else if(PH_input>7.45 && PaC02<35.0 &&  HC03>=22 && HC03<=28 ) {
                        String ans = "Respiratory Alkalosis.";
                        txt_ans_abg.setText(ans);
                    }
                    else if(PH_input<=7.45 && PH_input>=7.35 && PaC02<35.0 && HC03<=22) {
                        String ans = "Compensated Respiratory Alkalosis / Compensated Metabolic Acidosis.";
                        txt_ans_abg.setText(ans);
                    }

                    else if(PH_input<7.35 && PaC02>=35.0 && PaC02<=45.0 && HC03<=22) {
                        String ans = "Metabolic Acidosis.";
                        txt_ans_abg.setText(ans);
                    }
                    else if(PH_input>7.45 && PaC02>=35.0 && PaC02<=45.0 && HC03>28.0) {
                        String ans = "Metabolic Alkalosis.";
                        txt_ans_abg.setText(ans);
                    }
                }







        });
    }

}