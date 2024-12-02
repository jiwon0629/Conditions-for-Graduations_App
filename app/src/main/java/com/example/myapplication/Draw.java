package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import yuku.ambilwarna.AmbilWarnaDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Draw extends AppCompatActivity {

    Button back;
    MyPaintView view;
    int tColor = 0xFF000000;  // 기본 색상: 검정색

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw);

        view = new MyPaintView(this);  // MyPaintView 초기화
        back = findViewById(R.id.back);
        LinearLayout container = findViewById(R.id.container);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        container.addView(view, params);

        // 색상 선택 버튼
        Button btn = findViewById(R.id.colorPickerButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker();
            }
        });

        // 뒤로가기 버튼
        back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });

        // 굵기 조정 버튼
        Button btn2 = findViewById(R.id.thickPickerButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showThicknessDialog();
            }
        });

        // 지우기 버튼
        Button eraseBtn = findViewById(R.id.eraseButton);  // 지우기 버튼 아이디
        eraseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.clear();  // 화면 지우기
            }
        });
    }

    private void showThicknessDialog() {
        final EditText editText = new EditText(this);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("굵기 설정");
        builder.setMessage("굵기 입력");
        builder.setView(editText);
        builder.setPositiveButton("입력", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // 사용자가 입력한 굵기로 설정
                view.setStrokeWidth(Integer.parseInt(editText.getText().toString()));
            }
        });
        builder.setNegativeButton("취소", null);
        builder.show();
    }

    private void openColorPicker() {
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, tColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {
                // 색상 선택 취소 시 처리할 내용
            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                tColor = color;  // 색상 변경
                Toast.makeText(getApplicationContext(), "선택된 색상: #" + Integer.toHexString(tColor).toUpperCase(), Toast.LENGTH_LONG).show();
                view.setColor(color);  // MyPaintView에 색상 반영
            }
        });
        colorPicker.show();
    }
}
