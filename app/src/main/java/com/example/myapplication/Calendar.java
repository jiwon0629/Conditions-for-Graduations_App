package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Calendar extends AppCompatActivity {

    DatePicker dp;
    EditText edit;
    Button btn;
    String fileName;
    File[] fileNames;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        back = findViewById(R.id.back);
        dp = findViewById(R.id.datePicker);
        edit = findViewById(R.id.edit1);
        btn = findViewById(R.id.btn1);

        // 디렉터리 생성
        File diaryDir = new File(getExternalFilesDir(null), "myDiary");
        if (!diaryDir.exists()) {
            diaryDir.mkdirs();
        }

        fileNames = diaryDir.listFiles();

        java.util.Calendar cal = java.util.Calendar.getInstance();
        int cYear = cal.get(java.util.Calendar.YEAR);
        int cMonth = cal.get(java.util.Calendar.MONTH);
        int cDay = cal.get(java.util.Calendar.DAY_OF_MONTH);

        dp.init(cYear, cMonth, cDay, (datePicker, year, month, day) -> {
            fileName = new File(diaryDir, year + "_" + (month + 1) + "_" + day + ".txt").getAbsolutePath();
            String str = readDiary(fileName);
            edit.setText(str);
            btn.setEnabled(true);
        });

        btn.setOnClickListener(view -> {
            try {
                FileOutputStream outFs = new FileOutputStream(fileName);
                String str = edit.getText().toString();
                outFs.write(str.getBytes());
                outFs.close();
                Toast.makeText(getApplicationContext(), fileName + " 이 저장됨", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "에러입니다: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
            fileNames = diaryDir.listFiles();
        });

        back.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }

    String readDiary(String s) {
        String ret = null;

        for (File file : fileNames) {
            if (file.toString().equals(s)) {
                try {
                    FileInputStream inFs = new FileInputStream(s);
                    byte[] txt = new byte[inFs.available()];
                    inFs.read(txt);
                    inFs.close();
                    ret = new String(txt);
                    btn.setText("수정하기");
                    return ret;
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "오류입니다: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }

        edit.setHint("일기 없음");
        btn.setText("새로 저장");
        return ret;
    }
}