package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    Button sub, mul, div, ndot, clear, back, Ok, plus;
    Button n[] = new Button[10];
    Integer[] Rid_button = {
            R.id.n0, R.id.n1, R.id.n2, R.id.n3, R.id.n4,
            R.id.n5, R.id.n6, R.id.n7, R.id.n8, R.id.n9
    };

    private TextView text;
    private double storedValue;
    private char curOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        text = (TextView) findViewById(R.id.text);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        ndot = (Button) findViewById(R.id.ndot);
        clear = (Button) findViewById(R.id.clear);
        back = (Button) findViewById(R.id.back);
        Ok = (Button) findViewById(R.id.Ok);
        plus = (Button) findViewById(R.id.plus);

        for (int i = 0; i <= 9; i++) {
            n[i] = (Button) findViewById(Rid_button[i]);
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        String current = text.getText().toString();
        if (view.getId() == R.id.n0) {
            text.setText(current + "0");
        } else if (view.getId() == R.id.n1) {
            text.setText(current + "1");
        } else if (view.getId() == R.id.n2) {
            text.setText(current + "2");
        } else if (view.getId() == R.id.n3) {
            text.setText(current + "3");
        } else if (view.getId() == R.id.n4) {
            text.setText(current + "4");
        } else if (view.getId() == R.id.n5) {
            text.setText(current + "5");
        } else if (view.getId() == R.id.n6) {
            text.setText(current + "6");
        } else if (view.getId() == R.id.n7) {
            text.setText(current + "7");
        } else if (view.getId() == R.id.n8) {
            text.setText(current + "8");
        } else if (view.getId() == R.id.n9) {
            text.setText(current + "9");
        } else if (view.getId() == R.id.ndot) {
            if (!current.contains(".")) {
                text.setText(current + ".");
            } else {
                Toast.makeText(getApplicationContext(), "이미 소수점이 있습니다.", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.plus) {
            handleOperator(current, '+');
        } else if (view.getId() == R.id.sub) {
            handleOperator(current, '-');
        } else if (view.getId() == R.id.mul) {
            handleOperator(current, '*');
        } else if (view.getId() == R.id.div) {
            handleOperator(current, '/');
        } else if (view.getId() == R.id.clear) {
            text.setText("");
            storedValue = 0.0;
        } else if (view.getId() == R.id.Ok) {
            if (current.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                double result = 0;
                double thisValue = Double.parseDouble(text.getText().toString());
                switch (curOperator) {
                    case '+':
                        result = storedValue + thisValue;
                        break;
                    case '-':
                        result = storedValue - thisValue;
                        break;
                    case '*':
                        result = storedValue * thisValue;
                        break;
                    case '/':
                        result = storedValue / thisValue;
                        break;
                }
                text.setText(String.valueOf(result));
                storedValue = 0.0;
            }
        }

    }

    private void handleOperator(String current, char operator) {
        if (current.equals("")) {
            Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
        } else {
            storedValue = Double.parseDouble(current);
            curOperator = operator;
            text.setText("");
        }
    }
}
