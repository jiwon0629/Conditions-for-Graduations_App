package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Others extends AppCompatActivity {

    Button back4;
    TextView minzun, jaegyeong, jiwon;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.others);
        back4 = (Button) findViewById(R.id.back4);
        minzun = (TextView)findViewById(R.id.minzun);
//        jaegyeong = (TextView)findViewById(R.id.jaegyeong);
        jiwon = (TextView)findViewById(R.id.jiwon);

        minzun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/minzunkang/?igshid=NzZlODBkYWE4Ng%3D%3D"));
                startActivity(urlintent);
            }
        });

//        jaegyeong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/jk_park0525/?igshid=NzZlODBkYWE4Ng%3D%3D"));
//                startActivity(urlintent);
//            }
//        });

        jiwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/xerosix_won/?igshid=NzZlODBkYWE4Ng%3D%3D"));
                startActivity(urlintent);
            }
        });


        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}