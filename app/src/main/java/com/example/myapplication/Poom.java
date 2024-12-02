package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Poom extends AppCompatActivity {

    Button back2;
    EditText edtName, edtPoint, edtNameResult, edtPointResult;
    Button btnInit, btnInsert, btnSelect, btnUpdate, btnDelete;
    SQLiteDatabase sqlDB2;
    myDBHelper myHelper2;
    TextView text;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poom);
        back2 = (Button) findViewById(R.id.back2);
        edtName = (EditText) findViewById(R.id.edtName);
        edtPoint = (EditText) findViewById(R.id.edtPoint);
        edtNameResult = (EditText) findViewById(R.id.edtNameResult);
        edtPointResult = (EditText) findViewById(R.id.edtPointResult);
        btnInit = (Button) findViewById(R.id.btnInit);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        text = (TextView) findViewById(R.id.text);
        myHelper2 = new myDBHelper(this);
        // 시작할때 먼저 조회
        sqlDB2 = myHelper2.getReadableDatabase();
        Cursor cursor2;
        sum=0;
        cursor2 = sqlDB2.rawQuery("SELECT * FROM groupPOOM;", null);
        String strNames = "등록 항목" + "\r\n" + "___________________________________" + "\r\n";
        String strNumbers = "인증 점수" + "\r\n" + "_____________" + "\r\n";
        while (cursor2.moveToNext()) {
            strNames += cursor2.getString(0) + "\r\n";
            strNumbers += cursor2.getString(1) + "점"+"\r\n";
            sum=sum+Integer.parseInt(cursor2.getString(1));
        }
        edtNameResult.setText(strNames);
        edtPointResult.setText(strNumbers);
        text.setText("총합 : "+sum);
        cursor2.close();
        sqlDB2.close();
        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB2 = myHelper2.getWritableDatabase();
                myHelper2.onUpgrade(sqlDB2, 1, 2); // 인수는 아무거나 입력하면 됨.
                sqlDB2.close();
                // 초기화 결과
                Toast.makeText(getApplicationContext(), "초기화됨",
                        Toast.LENGTH_SHORT).show();
                sum=0;
            }
        });
        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im2.hideSoftInputFromWindow(edtPoint.getWindowToken(), 0);
                try {
                    sqlDB2 = myHelper2.getWritableDatabase();
                    sqlDB2.execSQL("INSERT INTO groupPOOM VALUES ( '"
                            + edtName.getText().toString().trim() + "' , "
                            + edtPoint.getText().toString().trim() + ");");
                    sqlDB2.close();
                    // 입력결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "등록 항목 : '" + edtName.getText().toString().trim()
                                    + "' 입력됨", Toast.LENGTH_SHORT).show();
                    sqlDB2 = myHelper2.getReadableDatabase();
                    sum=0;
                    Cursor cursor2;
                    cursor2 = sqlDB2.rawQuery("SELECT * FROM groupPOOM;", null);
                    String strNames = "등록 항목" + "\r\n" + "___________________________________" + "\r\n";
                    String strNumbers = "인증 점수" + "\r\n" + "_____________" + "\r\n";
                    while (cursor2.moveToNext()) {
                        strNames += cursor2.getString(0) + "\r\n";
                        strNumbers += cursor2.getString(1) + "점"+"\r\n";
                        sum=sum+Integer.parseInt(cursor2.getString(1));
                    }
                    edtNameResult.setText(strNames);
                    edtPointResult.setText(strNumbers);
                    text.setText("총합 : "+sum);
                    cursor2.close();
                    sqlDB2.close();
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
                InputMethodManager im2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im2.hideSoftInputFromWindow(edtName.getWindowToken(), 0);
                sqlDB2 = myHelper2.getReadableDatabase();
                sum=0;
                Cursor cursor2;
                cursor2 = sqlDB2.rawQuery("SELECT * FROM groupPOOM;", null);
                String strNames = "등록 항목" + "\r\n" + "___________________________________" + "\r\n";
                String strNumbers = "인증 점수" + "\r\n" + "_____________" + "\r\n";
                while (cursor2.moveToNext()) {
                    strNames += cursor2.getString(0) + "\r\n";
                    strNumbers += cursor2.getString(1) + "점"+"\r\n";
                    sum=sum+Integer.parseInt(cursor2.getString(1));
                }
                edtNameResult.setText(strNames);
                edtPointResult.setText(strNumbers);
                text.setText("총합 : "+sum);
                cursor2.close();
                sqlDB2.close();
                // 처리결과 확인
                Toast.makeText(getApplicationContext(), "조회됨",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im2.hideSoftInputFromWindow(edtPoint.getWindowToken(), 0);
                sum=0;
                try {
                    sqlDB2 = myHelper2.getWritableDatabase();
                    sqlDB2.execSQL("UPDATE groupPOOM set pPoint = "
                            + edtPoint.getText().toString().trim()
                            + " where pName = '"
                            + edtName.getText().toString().trim() + "';");
                    sqlDB2.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "등록 항목 : '" + edtName.getText().toString().trim()
                                    + "' 수정됨", Toast.LENGTH_SHORT).show();

                    sqlDB2 = myHelper2.getReadableDatabase();
                    Cursor cursor2;
                    cursor2 = sqlDB2.rawQuery("SELECT * FROM groupPOOM;", null);
                    String strNames = "등록 항목" + "\r\n" + "___________________________________" + "\r\n";
                    String strNumbers = "인증 점수" + "\r\n" + "_____________" + "\r\n";
                    while (cursor2.moveToNext()) {
                        strNames += cursor2.getString(0) + "\r\n";
                        strNumbers += cursor2.getString(1) + "점"+"\r\n";
                        sum=sum+Integer.parseInt(cursor2.getString(1));
                    }
                    edtNameResult.setText(strNames);
                    edtPointResult.setText(strNumbers);
                    text.setText("총합 : "+sum);
                    cursor2.close();
                    sqlDB2.close();
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
                InputMethodManager im2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im2.hideSoftInputFromWindow(edtPoint.getWindowToken(), 0);
                sum=0;
                try {
                    sqlDB2 = myHelper2.getWritableDatabase();
                    sqlDB2.execSQL("DELETE from groupPOOM where pName = '"
                            + edtName.getText().toString().trim() + "';");
                    sqlDB2.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "등록 항목 : '" + edtName.getText().toString().trim()
                                    + "' 삭제됨", Toast.LENGTH_SHORT).show();

                    sqlDB2 = myHelper2.getReadableDatabase();
                    Cursor cursor;
                    cursor = sqlDB2.rawQuery("SELECT * FROM groupPOOM;", null);
                    String strNames = "등록 항목" + "\r\n" + "___________________________________" + "\r\n";
                    String strNumbers = "인증 점수" + "\r\n" + "_____________" + "\r\n";
                    while (cursor.moveToNext()) {
                        strNames += cursor.getString(0) + "\r\n";
                        strNumbers += cursor.getString(1) + "점"+"\r\n";
                        sum=sum+Integer.parseInt(cursor.getString(1));
                    }
                    edtNameResult.setText(strNames);
                    edtPointResult.setText(strNumbers);
                    text.setText("총합 : "+sum);
                    cursor.close();
                    sqlDB2.close();
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
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper(Context context) {
            super(context, "groupDB2", null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase db2) {
            db2.execSQL("CREATE TABLE  groupPOOM (pName CHAR(20) PRIMARY KEY, pPoint INTEGER);");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
            db2.execSQL("DROP TABLE IF EXISTS groupPOOM");
            onCreate(db2);
        }
    }
}