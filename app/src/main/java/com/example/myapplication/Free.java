package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Free extends AppCompatActivity {

    EditText edtAbility, edtSubject, edtCredit, edtAbilityResult, edtSubjectResult, edtCreditResult;
    Button btnInit, btnInsert, btnSelect, btnUpdate, btnDelete, back5;
    SQLiteDatabase sqlDB3;
    myDBHelper myHelper3;
    int sum=0;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.free);
        edtAbility = (EditText) findViewById(R.id.edtAbility);
        edtSubject = (EditText) findViewById(R.id.edtSubject);
        edtCredit = (EditText) findViewById(R.id.edtCredit);
        edtAbilityResult = (EditText) findViewById(R.id.edtAbilityResult);
        edtSubjectResult = (EditText) findViewById(R.id.edtSubjectResult);
        edtCreditResult = (EditText) findViewById(R.id.edtCreditResult);
        btnInit = (Button) findViewById(R.id.btnInit);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        back5 = (Button) findViewById(R.id.back5);
        myHelper3 = new myDBHelper(this);
        // 시작할때 먼저 조회
        sqlDB3 = myHelper3.getReadableDatabase();
        Cursor cursor3;
        cursor3 = sqlDB3.rawQuery("SELECT * FROM groupFree;", null);
        String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
        String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
        String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
        sum=0;
        while (cursor3.moveToNext()) {
            strAbility += cursor3.getString(0) + "역량"+"\r\n";
            strSubject += cursor3.getString(1) + "\r\n";
            strCredit += cursor3.getString(2) + "학점"+"\r\n";
            sum = sum + Integer.parseInt(cursor3.getString(2));
        }Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
        edtAbilityResult.setText(strAbility);
        edtSubjectResult.setText(strSubject);
        edtCreditResult.setText(strCredit);
        cursor3.close();
        sqlDB3.close();

        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB3 = myHelper3.getWritableDatabase();
                myHelper3.onUpgrade(sqlDB3, 1, 2); // 인수는 아무거나 입력하면 됨.
                sqlDB3.close();
                // 초기화 결과
                Toast.makeText(getApplicationContext(), "초기화됨",
                        Toast.LENGTH_SHORT).show();
                sum=0;
                Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im3 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im3.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB3 = myHelper3.getWritableDatabase();
                    sqlDB3.execSQL("INSERT INTO groupFree VALUES ( "
                            + edtAbility.getText().toString().trim() + " ,'"
                            + edtSubject.getText().toString().trim() + "' , "
                            + edtCredit.getText().toString().trim() + ");");
                    sqlDB3.close();
                    // 입력결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 입력됨", Toast.LENGTH_SHORT).show();
                    sqlDB3 = myHelper3.getReadableDatabase();
                    Cursor cursor3;
                    cursor3 = sqlDB3.rawQuery("SELECT * FROM groupFree;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor3.moveToNext()) {
                        strAbility += cursor3.getString(0) + "역량"+"\r\n";
                        strSubject += cursor3.getString(1) + "\r\n";
                        strCredit += cursor3.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor3.getString(2));
                    }
                    Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor3.close();
                    sqlDB3.close();
                    // 입력결과 조회
                    Toast.makeText(getApplicationContext(), "입력결과 조회됨",
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    // 입력결과 확인
                    Toast.makeText(getApplicationContext(),
                                    "SQL오류 :" + e.toString(), Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im3 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im3.hideSoftInputFromWindow(edtSubject.getWindowToken(), 0);
                sqlDB3 = myHelper3.getReadableDatabase();
                Cursor cursor3;
                cursor3 = sqlDB3.rawQuery("SELECT * FROM groupFree;", null);
                String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                sum=0;
                while (cursor3.moveToNext()) {
                    strAbility += cursor3.getString(0) + "역량"+"\r\n";
                    strSubject += cursor3.getString(1) + "\r\n";
                    strCredit += cursor3.getString(2) + "학점"+"\r\n";
                    sum = sum + Integer.parseInt(cursor3.getString(2));
                }
                Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
                edtAbilityResult.setText(strAbility);
                edtSubjectResult.setText(strSubject);
                edtCreditResult.setText(strCredit);
                cursor3.close();
                sqlDB3.close();
                // 처리결과 확인
                Toast.makeText(getApplicationContext(), "조회됨",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im3 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im3.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB3 = myHelper3.getWritableDatabase();
                    sqlDB3.execSQL("UPDATE groupFree set fAbility = " + edtAbility.getText().toString().trim() + ", fCredit = "+edtCredit.getText().toString().trim()+" where fSubject = '" + edtSubject.getText().toString().trim() + "';");
                    sqlDB3.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 수정됨", Toast.LENGTH_SHORT).show();

                    sqlDB3 = myHelper3.getReadableDatabase();
                    Cursor cursor3;
                    cursor3 = sqlDB3.rawQuery("SELECT * FROM groupFree;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor3.moveToNext()) {
                        strAbility += cursor3.getString(0) + "역량"+"\r\n";
                        strSubject += cursor3.getString(1) + "\r\n";
                        strCredit += cursor3.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor3.getString(2));
                    }
                    Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor3.close();
                    sqlDB3.close();
                    // 입력결과 조회
                    Toast.makeText(getApplicationContext(), "수정결과 조회됨",
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    // 입력결과 확인
                    Toast.makeText(getApplicationContext(),
                                    "SQL오류 :" + e.toString(), Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im3 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im3.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB3 = myHelper3.getWritableDatabase();
                    sqlDB3.execSQL("DELETE from groupFree where fSubject = '"
                            + edtSubject.getText().toString().trim() + "';");
                    sqlDB3.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 삭제됨", Toast.LENGTH_SHORT).show();

                    sqlDB3 = myHelper3.getReadableDatabase();
                    Cursor cursor3;
                    cursor3 = sqlDB3.rawQuery("SELECT * FROM groupFree;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor3.moveToNext()) {
                        strAbility += cursor3.getString(0) + "역량"+"\r\n";
                        strSubject += cursor3.getString(1) + "\r\n";
                        strCredit += cursor3.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor3.getString(2));
                    }
                    Toast.makeText(getApplicationContext(), "sum : "+ sum, Toast.LENGTH_SHORT).show();
                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor3.close();
                    sqlDB3.close();
                    // 입력결과 조회
                    Toast.makeText(getApplicationContext(), "삭제결과 조회됨",
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    // 입력결과 확인
                    Toast.makeText(getApplicationContext(),
                                    "SQL오류 :" + e.toString(), Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inIntent = getIntent();
                int Freegetnum = inIntent.getIntExtra("Free", 0);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("FputNum", sum);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper(Context context) {
            super(context, "groupDB3", null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase db3) {
            db3.execSQL("CREATE TABLE  groupFree (fAbility INTEGER, fSubject CHAR(20) PRIMARY KEY, fCredit INTEGER);");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db3, int oldVersion, int newVersion) {
            db3.execSQL("DROP TABLE IF EXISTS groupFree");
            onCreate(db3);
        }
    }
}