package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Refinement extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    LinearLayout BRPage, NRPage, REReset, RCPage, textExplain;

    CheckBox BR_1, BR_2, BR_3, BR_4, BR_5, BR_6, BR_7, BR_8, BR_9;

    CheckBox NR_1, NR_2, NR_3, NR_4, NR_5, NR_6, NR_7, NR_8;

    Button back1, save, reset;

    //데이터 저장
    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    Boolean BLBR_1, BLBR_2, BLBR_3, BLBR_4, BLBR_5, BLBR_6, BLBR_7, BLBR_8, BLBR_9;

    Boolean BLNR_1, BLNR_2, BLNR_3, BLNR_4, BLNR_5, BLNR_6, BLNR_7, BLNR_8;

    EditText edtAbility, edtSubject, edtCredit, edtAbilityResult, edtSubjectResult, edtCreditResult;
    Button btnInit, btnInsert, btnSelect, btnUpdate, btnDelete;
    SQLiteDatabase sqlDB;
    myDBHelper myHelper;
    int sum=0;


    int RECount = 0, FreenumRE = 0;

    int resetRE = 0;
    int pointRE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refinement);

        back1 = (Button) findViewById(R.id.back1);

        save = (Button) findViewById(R.id.save);

        reset = (Button) findViewById(R.id.reset);

        BRPage = (LinearLayout) findViewById(R.id.BRPage);

        NRPage = (LinearLayout) findViewById(R.id.NRPage);

        REReset = (LinearLayout) findViewById(R.id.REReset);

        RCPage = (LinearLayout) findViewById(R.id.RCPage);

        textExplain = (LinearLayout) findViewById(R.id.textExplain);

        BR_1 = (CheckBox) findViewById(R.id.BR_1);
        BR_2 = (CheckBox) findViewById(R.id.BR_2);
        BR_3 = (CheckBox) findViewById(R.id.BR_3);
        BR_4 = (CheckBox) findViewById(R.id.BR_4);
        BR_5 = (CheckBox) findViewById(R.id.BR_5);
        BR_6 = (CheckBox) findViewById(R.id.BR_6);
        BR_7 = (CheckBox) findViewById(R.id.BR_7);
        BR_8 = (CheckBox) findViewById(R.id.BR_8);
        BR_9 = (CheckBox) findViewById(R.id.BR_9);

        NR_1 = (CheckBox) findViewById(R.id.NR_1);
        NR_2 = (CheckBox) findViewById(R.id.NR_2);
        NR_3 = (CheckBox) findViewById(R.id.NR_3);
        NR_4 = (CheckBox) findViewById(R.id.NR_4);
        NR_5 = (CheckBox) findViewById(R.id.NR_5);
        NR_6 = (CheckBox) findViewById(R.id.NR_6);
        NR_7 = (CheckBox) findViewById(R.id.NR_7);
        NR_8 = (CheckBox) findViewById(R.id.NR_8);

        pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        editor = pref.edit();
        BLBR_1 = pref.getBoolean("BLBR_1", false);
        BR_1.setChecked(Boolean.valueOf(BLBR_1));
        BLBR_2 = pref.getBoolean("BLBR_2", false);
        BR_2.setChecked(Boolean.valueOf(BLBR_2));
        BLBR_3 = pref.getBoolean("BLBR_3", false);
        BR_3.setChecked(Boolean.valueOf(BLBR_3));
        BLBR_4 = pref.getBoolean("BLBR_4", false);
        BR_4.setChecked(Boolean.valueOf(BLBR_4));
        BLBR_5 = pref.getBoolean("BLBR_5", false);
        BR_5.setChecked(Boolean.valueOf(BLBR_5));
        BLBR_6 = pref.getBoolean("BLBR_6", false);
        BR_6.setChecked(Boolean.valueOf(BLBR_6));
        BLBR_7 = pref.getBoolean("BLBR_7", false);
        BR_7.setChecked(Boolean.valueOf(BLBR_7));
        BLBR_8 = pref.getBoolean("BLBR_8", false);
        BR_8.setChecked(Boolean.valueOf(BLBR_8));
        BLBR_9 = pref.getBoolean("BLBR_9", false);
        BR_9.setChecked(Boolean.valueOf(BLBR_9));

        BLNR_1 = pref.getBoolean("BLNR_1", false);
        NR_1.setChecked(Boolean.valueOf(BLNR_1));
        BLNR_2 = pref.getBoolean("BLNR_2", false);
        NR_2.setChecked(Boolean.valueOf(BLNR_2));
        BLNR_3 = pref.getBoolean("BLNR_3", false);
        NR_3.setChecked(Boolean.valueOf(BLNR_3));
        BLNR_4 = pref.getBoolean("BLNR_4", false);
        NR_4.setChecked(Boolean.valueOf(BLNR_4));
        BLNR_5 = pref.getBoolean("BLNR_5", false);
        NR_5.setChecked(Boolean.valueOf(BLNR_5));
        BLNR_6 = pref.getBoolean("BLNR_6", false);
        NR_6.setChecked(Boolean.valueOf(BLNR_6));
        BLNR_7 = pref.getBoolean("BLNR_7", false);
        NR_7.setChecked(Boolean.valueOf(BLNR_7));
        BLNR_8 = pref.getBoolean("BLNR_8", false);
        NR_8.setChecked(Boolean.valueOf(BLNR_8));

        FreenumRE = pref.getInt("FreenumRE", FreenumRE);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointRE = 1;

//기초교양=================================================================================================================
                BR_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_1.isChecked() == true) {

                            editor.putBoolean("BLBR_1", b);
                            editor.apply();
                            RECount += 1;

                        }
                        if (BR_1.isChecked() == false) {
                            editor.putBoolean("BLBR_1", b);
                            editor.apply();
                            RECount -= 1;
                        }
                    }
                });
                BR_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_2.isChecked() == true) {
                            editor.putBoolean("BLBR_2", b);
                            editor.apply();
                            RECount += 1;

                        }
                        if (BR_2.isChecked() == false) {
                            editor.putBoolean("BLBR_2", b);
                            editor.apply();
                            RECount -= 1;

                        }
                    }
                });

                BR_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_3.isChecked() == true) {
                            editor.putBoolean("BLBR_3", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_3.isChecked() == false) {
                            editor.putBoolean("BLBR_3", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_4.isChecked() == true) {
                            editor.putBoolean("BLBR_4", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_4.isChecked() == false) {
                            editor.putBoolean("BLBR_4", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_5.isChecked() == true) {
                            editor.putBoolean("BLBR_5", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_5.isChecked() == false) {
                            editor.putBoolean("BLBR_5", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_6.isChecked() == true) {
                            editor.putBoolean("BLBR_6", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_6.isChecked() == false) {
                            editor.putBoolean("BLBR_6", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_7.isChecked() == true) {
                            editor.putBoolean("BLBR_7", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_7.isChecked() == false) {
                            editor.putBoolean("BLBR_7", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_8.isChecked() == true) {
                            editor.putBoolean("BLBR_8", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_8.isChecked() == false) {
                            editor.putBoolean("BLBR_8", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                BR_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (BR_9.isChecked() == true) {
                            editor.putBoolean("BLBR_9", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (BR_9.isChecked() == false) {
                            editor.putBoolean("BLBR_9", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });


//나사렛교양=================================================================================================================

                NR_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_1.isChecked() == true) {

                            editor.putBoolean("BLNR_1", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_1.isChecked() == false) {
                            editor.putBoolean("BLNR_1", b);
                            editor.apply();
                            RECount -= 2;
                        }
                    }
                });
                NR_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_2.isChecked() == true) {
                            editor.putBoolean("BLNR_2", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_2.isChecked() == false) {
                            editor.putBoolean("BLNR_2", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                NR_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_3.isChecked() == true) {
                            editor.putBoolean("BLNR_3", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_3.isChecked() == false) {
                            editor.putBoolean("BLNR_3", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                NR_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_4.isChecked() == true) {
                            editor.putBoolean("BLNR_4", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_4.isChecked() == false) {
                            editor.putBoolean("BLNR_4", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                NR_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_5.isChecked() == true) {
                            editor.putBoolean("BLNR_5", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_5.isChecked() == false) {
                            editor.putBoolean("BLNR_5", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                NR_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_6.isChecked() == true) {
                            editor.putBoolean("BLNR_6", b);
                            editor.apply();
                            RECount += 2;

                        }
                        if (NR_6.isChecked() == false) {
                            editor.putBoolean("BLNR_6", b);
                            editor.apply();
                            RECount -= 2;

                        }
                    }
                });

                NR_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_7.isChecked() == true) {
                            editor.putBoolean("BLNR_7", b);
                            editor.apply();
                            RECount += 1;

                        }
                        if (NR_7.isChecked() == false) {
                            editor.putBoolean("BLNR_7", b);
                            editor.apply();
                            RECount -= 1;

                        }
                    }
                });

                NR_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (NR_8.isChecked() == true) {
                            editor.putBoolean("BLNR_8", b);
                            editor.apply();
                            RECount += 1;

                        }
                        if (NR_8.isChecked() == false) {
                            editor.putBoolean("BLNR_8", b);
                            editor.apply();
                            RECount -= 1;

                        }
                    }
                });
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BR_1.setChecked(false);
                BR_2.setChecked(false);
                BR_3.setChecked(false);
                BR_4.setChecked(false);
                BR_5.setChecked(false);
                BR_6.setChecked(false);
                BR_7.setChecked(false);
                BR_8.setChecked(false);
                BR_9.setChecked(false);

                NR_1.setChecked(false);
                NR_2.setChecked(false);
                NR_3.setChecked(false);
                NR_4.setChecked(false);
                NR_5.setChecked(false);
                NR_6.setChecked(false);
                NR_7.setChecked(false);
                NR_8.setChecked(false);

                RECount = 0;
                resetRE = 1;

                editor.putBoolean("BLBR_1", false);
                editor.putBoolean("BLBR_2", false);
                editor.putBoolean("BLBR_3", false);
                editor.putBoolean("BLBR_4", false);
                editor.putBoolean("BLBR_5", false);
                editor.putBoolean("BLBR_6", false);
                editor.putBoolean("BLBR_7", false);
                editor.putBoolean("BLBR_8", false);
                editor.putBoolean("BLBR_9", false);

                editor.putBoolean("BLNR_1", false);
                editor.putBoolean("BLNR_2", false);
                editor.putBoolean("BLNR_3", false);
                editor.putBoolean("BLNR_4", false);
                editor.putBoolean("BLNR_5", false);
                editor.putBoolean("BLNR_6", false);
                editor.putBoolean("BLNR_7", false);
                editor.putBoolean("BLNR_8", false);
                editor.putBoolean("BLNR_9", false);
                editor.apply();
            }
        });

//교선 페이지============================================================================================================================================================================
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
        myHelper = new myDBHelper(this);
        // 시작할때 먼저 조회
        sqlDB = myHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);
        String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
        String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
        String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
        sum=0;
        while (cursor.moveToNext()) {
            strAbility += cursor.getString(0) + "역량"+"\r\n";
            strSubject += cursor.getString(1) + "\r\n";
            strCredit += cursor.getString(2) + "학점"+"\r\n";
            sum = sum + Integer.parseInt(cursor.getString(2));
        }
        edtAbilityResult.setText(strAbility);
        edtSubjectResult.setText(strSubject);
        edtCreditResult.setText(strCredit);
        cursor.close();
        sqlDB.close();

        //초기화
        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                myHelper.onUpgrade(sqlDB, 1, 2); // 인수는 아무거나 입력하면 됨.
                sqlDB.close();
                // 초기화 결과
                Toast.makeText(getApplicationContext(), "초기화됨",
                        Toast.LENGTH_SHORT).show();
                sum=0;
            }
        });

        //입력
        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("INSERT INTO groupTBL VALUES ( "
                            + edtAbility.getText().toString().trim() + " ,'"
                            + edtSubject.getText().toString().trim() + "' , "
                            + edtCredit.getText().toString().trim() + ");");
                    sqlDB.close();
                    // 입력결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 입력됨", Toast.LENGTH_SHORT).show();
                    sqlDB = myHelper.getReadableDatabase();
                    Cursor cursor;
                    cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor.moveToNext()) {
                        strAbility += cursor.getString(0) + "역량"+"\r\n";
                        strSubject += cursor.getString(1) + "\r\n";
                        strCredit += cursor.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor.getString(2));
                    }
                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor.close();
                    sqlDB.close();
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

        //조회
        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im.hideSoftInputFromWindow(edtSubject.getWindowToken(), 0);
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);
                String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                sum=0;
                while (cursor.moveToNext()) {
                    strAbility += cursor.getString(0) + "역량"+"\r\n";
                    strSubject += cursor.getString(1) + "\r\n";
                    strCredit += cursor.getString(2) + "학점"+"\r\n";
                    sum = sum + Integer.parseInt(cursor.getString(2));
                }
                edtAbilityResult.setText(strAbility);
                edtSubjectResult.setText(strSubject);
                edtCreditResult.setText(strCredit);
                cursor.close();
                sqlDB.close();
                // 처리결과 확인
                Toast.makeText(getApplicationContext(), "조회됨",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //수정
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("UPDATE groupTBL set gAbility = " + edtAbility.getText().toString().trim() + ", gCredit = "+edtCredit.getText().toString().trim()+" where gSubject = '" + edtSubject.getText().toString().trim() + "';");
                    sqlDB.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 수정됨", Toast.LENGTH_SHORT).show();

                    sqlDB = myHelper.getReadableDatabase();
                    Cursor cursor;
                    cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor.moveToNext()) {
                        strAbility += cursor.getString(0) + "역량"+"\r\n";
                        strSubject += cursor.getString(1) + "\r\n";
                        strCredit += cursor.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor.getString(2));
                    }
                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor.close();
                    sqlDB.close();
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

        //삭제
        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 키보드 닫기
                InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                im.hideSoftInputFromWindow(edtCredit.getWindowToken(), 0);
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("DELETE from groupTBL where gSubject = '"
                            + edtSubject.getText().toString().trim() + "';");
                    sqlDB.close();
                    // 처리결과 확인
                    Toast.makeText(
                            getApplicationContext(),
                            "과목 : '" + edtSubject.getText().toString().trim()
                                    + "' 삭제됨", Toast.LENGTH_SHORT).show();

                    sqlDB = myHelper.getReadableDatabase();
                    Cursor cursor;
                    cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);
                    String strAbility = "역량" + "\r\n" + "__________" + "\r\n\n";
                    String strSubject = "과목" + "\r\n" + "___________________________" + "\r\n";
                    String strCredit = "학점" + "\r\n" + "__________" + "\r\n";
                    sum=0;
                    while (cursor.moveToNext()) {
                        strAbility += cursor.getString(0) + "역량"+"\r\n";
                        strSubject += cursor.getString(1) + "\r\n";
                        strCredit += cursor.getString(2) + "학점"+"\r\n";
                        sum = sum + Integer.parseInt(cursor.getString(2));
                    }

                    edtAbilityResult.setText(strAbility);
                    edtSubjectResult.setText(strSubject);
                    edtCreditResult.setText(strCredit);
                    cursor.close();
                    sqlDB.close();
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


        Intent inIntent = getIntent();


        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //교필 데이터 받아오기
                if (pointRE == 1) {
                    int REgetnum = inIntent.getIntExtra("REputPercent", 0) + RECount;
                    int REgetGauge = inIntent.getIntExtra("REputGraph", 0) + RECount;

                    if (resetRE == 1) {
                        REgetnum = 0;
                        REgetGauge = 0;
                        REgetnum = 0;
                        REgetGauge = 0;
                    }


                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    //교필 데이터 보내기
                    intent.putExtra("REputNum", REgetnum);
                    intent.putExtra("REputGauge", REgetGauge);
                    intent.putExtra("RCputNum", sum);


                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });

    }


    //학년 메뉴
    public void refinementMenu(View view) {
        PopupMenu MajorMenu = new PopupMenu(this, view);
        MajorMenu.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
        MajorMenu.inflate(R.menu.refinement_menu);
        MajorMenu.show();
    }


    //메뉴================================================================================================================================================================================

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.BasicRefinement) {
            textExplain.setVisibility(View.INVISIBLE);
            BRPage.setVisibility(View.VISIBLE);
            NRPage.setVisibility(View.INVISIBLE);
            REReset.setVisibility(View.VISIBLE);
            RCPage.setVisibility(View.INVISIBLE);
            return true;
        } else if (itemId == R.id.NazareneRefinement) {
            textExplain.setVisibility(View.INVISIBLE);
            BRPage.setVisibility(View.INVISIBLE);
            NRPage.setVisibility(View.VISIBLE);
            REReset.setVisibility(View.VISIBLE);
            RCPage.setVisibility(View.INVISIBLE);
            return true;
        } else if (itemId == R.id.ChoiceRefinement) {
            textExplain.setVisibility(View.INVISIBLE);
            BRPage.setVisibility(View.INVISIBLE);
            NRPage.setVisibility(View.INVISIBLE);
            REReset.setVisibility(View.INVISIBLE);
            RCPage.setVisibility(View.VISIBLE);
            return true;
        }
        return false;
    }

    //DB===============================================================================================================================================================================
    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper(Context context) {
            super(context, "groupDB", null, 1);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE  groupTBL (gAbility INTEGER, gSubject CHAR(20) PRIMARY KEY, gCredit INTEGER);");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS groupTBL");
            onCreate(db);
        }
    }
}