package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SchoolNumber extends AppCompatActivity {

    Button back3;
    TextView schnumbtn19, schnumbtn20, schnumbtn21;
    LinearLayout schnumbackground19, schnumbackground20, schnumbackground21;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.school_number);
        back3 = (Button) findViewById(R.id.back3);
        schnumbtn19 = (TextView) findViewById(R.id.schnumbtn19);
        schnumbtn20 = (TextView) findViewById(R.id.schnumbtn20);
        schnumbtn21 = (TextView) findViewById(R.id.schnumbtn21);
        schnumbackground19 = (LinearLayout)findViewById(R.id.schnumbackground19);
        schnumbackground20 = (LinearLayout)findViewById(R.id.schnumbackground20);
        schnumbackground21 = (LinearLayout)findViewById(R.id.schnumbackground21);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        schnumbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schnumbackground19.setVisibility(View.VISIBLE);
                schnumbackground20.setVisibility(View.INVISIBLE);
                schnumbackground21.setVisibility(View.INVISIBLE);
            }
        });
        schnumbtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schnumbackground19.setVisibility(View.INVISIBLE);
                schnumbackground20.setVisibility(View.VISIBLE);
                schnumbackground21.setVisibility(View.INVISIBLE);
            }
        });
        schnumbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schnumbackground19.setVisibility(View.INVISIBLE);
                schnumbackground20.setVisibility(View.INVISIBLE);
                schnumbackground21.setVisibility(View.VISIBLE);
            }
        });

    }
}