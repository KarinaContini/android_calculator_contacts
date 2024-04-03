package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSm, btnM, btnSb, btnDv, btnEq, btnCl, btnDt;
    TextView txtResult;

    float firstNumber, secondNumber, result;
    boolean isSum, isSub, isMult, isDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnSm = findViewById(R.id.btnSum);
        btnM = findViewById(R.id.btnMult);
        btnSb = findViewById(R.id.btnSubt);
        btnDv = findViewById(R.id.btnDiv);
        btnEq = findViewById(R.id.btnEqual);
        btnCl = findViewById(R.id.btnClear);
        btnDt = findViewById(R.id.btnDot);
        txtResult = findViewById(R.id.txtResult);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn1.getText().toString());
                String message = "You selected the button " + btn1.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn2.getText().toString());
                String message = "You selected the button " + btn2.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn3.getText().toString());
                String message = "You selected the button " + btn3.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn4.getText().toString());
                String message = "You selected the button " + btn4.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn5.getText().toString());
                String message = "You selected the button " + btn5.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn6.getText().toString());
                String message = "You selected the button " + btn6.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn7.getText().toString());
                String message = "You selected the button " + btn7.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn8.getText().toString());
                String message = "You selected the button " + btn8.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn9.getText().toString());
                String message = "You selected the button " + btn9.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btn0.getText().toString());
                String message = "You selected the button " + btn0.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.append(btnDt.getText().toString());
                String message = "You selected the button " + btnDt.getText().toString();
               // Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnSm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                isSum = true;

                String message = "You selected the button " + btnSm.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnSb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                isSub = true;
                String message = "You selected the button " + btnSb.getText().toString();
               // Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                isMult = true;
                String message = "You selected the button " + btnM.getText().toString();
               // Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnDv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = Float.parseFloat(txtResult.getText().toString());
                txtResult.setText("");
                isDiv = true;
                String message = "You selected the button " + btnDv.getText().toString();
                //Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = Float.parseFloat(txtResult.getText().toString());
                if (isSum){
                    result = firstNumber + secondNumber;
                } else if (isSub) {
                    result = firstNumber - secondNumber;
                } else if (isMult) {
                    result = firstNumber * secondNumber;
                } else if (isDiv) {
                    result = firstNumber / secondNumber;
                }
                txtResult.setText(String.valueOf(result));
                //txtResult.setText("");
                isSum = false;
                isSub = false;
                isMult = false;
                isDiv = false;

                String message = "You selected the button " + btnEq.getText().toString();
               // Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();


            }
        });

        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                isSum = false;
                isSub = false;
                isMult = false;
                isDiv = false;
            }
        });

    }
}