package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Major extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    LinearLayout textExplain;

    LinearLayout schpage19_MC, schpage19_ME, schpage19_MChoice, SaveAndReset19;

    LinearLayout schpage20_MC, schpage20_ME, schpage20_MChoice, SaveAndReset20;

    LinearLayout schpage21_MC, schpage21_ME, schpage21_MChoice, SaveAndReset21;

    ScrollView scroll19_MChoice, scroll20_MChoice, scroll21_MChoice;




    Button back;
    Button save19, reset19;
    Button save20, reset20;
    Button save21, reset21;

    //19학번 체크박스
    CheckBox MC19_1, MC19_2, MC19_3, MC19_4, MC19_5, MC19_6, MC19_7, MC19_8, MC19_9, MC19_10, MC19_11, MC19_12;

    CheckBox ME19_1, ME19_2, ME19_3, ME19_4, ME19_5, ME19_6, ME19_7, ME19_8, ME19_9, ME19_10, ME19_11,
            ME19_12, ME19_13, ME19_14, ME19_15, ME19_16, ME19_17, ME19_18, ME19_19, ME19_20, ME19_21, ME19_22,
            ME19_23, ME19_24, ME19_25, ME19_26, ME19_27, ME19_28, ME19_29, ME19_30;

    CheckBox MChoice19_1, MChoice19_2, MChoice19_3, MChoice19_4, MChoice19_5, MChoice19_6, MChoice19_7,
            MChoice19_8, MChoice19_9, MChoice19_10, MChoice19_11, MChoice19_12, MChoice19_13, MChoice19_14,
            MChoice19_15, MChoice19_16, MChoice19_17, MChoice19_18, MChoice19_19, MChoice19_20, MChoice19_21,
            MChoice19_22, MChoice19_23, MChoice19_24, MChoice19_25, MChoice19_26, MChoice19_27, MChoice19_28
            , MChoice19_29, MChoice19_30, MChoice19_31, MChoice19_32, MChoice19_33, MChoice19_34, MChoice19_35
            , MChoice19_36, MChoice19_37, MChoice19_38, MChoice19_39, MChoice19_40, MChoice19_41, MChoice19_42
            , MChoice19_43, MChoice19_44, MChoice19_45, MChoice19_46, MChoice19_47, MChoice19_48, MChoice19_49
            , MChoice19_50, MChoice19_51, MChoice19_52, MChoice19_53, MChoice19_54, MChoice19_55, MChoice19_56
            , MChoice19_57, MChoice19_58, MChoice19_59, MChoice19_60, MChoice19_61, MChoice19_62, MChoice19_63,
            MChoice19_64, MChoice19_65,  MChoice19_66;

    //20학번 체크박스
    CheckBox MC20_1, MC20_2, MC20_3, MC20_4, MC20_5, MC20_6, MC20_7, MC20_8, MC20_9, MC20_10, MC20_11, MC20_12;

    CheckBox ME20_1, ME20_2, ME20_3, ME20_4, ME20_5, ME20_6, ME20_7, ME20_8, ME20_9, ME20_10, ME20_11,
            ME20_12, ME20_13, ME20_14, ME20_15, ME20_16, ME20_17, ME20_18, ME20_19, ME20_20, ME20_21, ME20_22,
            ME20_23, ME20_24, ME20_25, ME20_26, ME20_27, ME20_28, ME20_29, ME20_30;

    CheckBox MChoice20_1, MChoice20_2, MChoice20_3, MChoice20_4, MChoice20_5, MChoice20_6, MChoice20_7,
            MChoice20_8, MChoice20_9, MChoice20_10, MChoice20_11, MChoice20_12, MChoice20_13, MChoice20_14,
            MChoice20_15, MChoice20_16, MChoice20_17, MChoice20_18, MChoice20_19, MChoice20_20, MChoice20_21,
            MChoice20_22, MChoice20_23, MChoice20_24, MChoice20_25, MChoice20_26, MChoice20_27, MChoice20_28,
            MChoice20_29, MChoice20_30, MChoice20_31, MChoice20_32, MChoice20_33, MChoice20_34, MChoice20_35
            , MChoice20_36, MChoice20_37, MChoice20_38, MChoice20_39, MChoice20_40, MChoice20_41, MChoice20_42
            , MChoice20_43, MChoice20_44, MChoice20_45, MChoice20_46, MChoice20_47, MChoice20_48, MChoice20_49
            , MChoice20_50, MChoice20_51, MChoice20_52, MChoice20_53, MChoice20_54, MChoice20_55, MChoice20_56
            , MChoice20_57, MChoice20_58, MChoice20_59, MChoice20_60, MChoice20_61, MChoice20_62, MChoice20_63
            , MChoice20_64, MChoice20_65;

    //21학번 체크박스
    CheckBox MC21_1, MC21_2, MC21_3, MC21_4, MC21_5, MC21_6, MC21_7, MC21_8, MC21_9, MC21_10, MC21_11, MC21_12;

    CheckBox ME21_1, ME21_2, ME21_3, ME21_4, ME21_5, ME21_6, ME21_7, ME21_8, ME21_9, ME21_10, ME21_11,
            ME21_12, ME21_13, ME21_14, ME21_15, ME21_16, ME21_17, ME21_18, ME21_19, ME21_20, ME21_21, ME21_22,
            ME21_23, ME21_24, ME21_25, ME21_26, ME21_27, ME21_28, ME21_29, ME21_30;

    CheckBox MChoice21_1, MChoice21_2, MChoice21_3, MChoice21_4, MChoice21_5, MChoice21_6, MChoice21_7,
            MChoice21_8, MChoice21_9, MChoice21_10, MChoice21_11, MChoice21_12, MChoice21_13, MChoice21_14,
            MChoice21_15, MChoice21_16, MChoice21_17, MChoice21_18, MChoice21_19, MChoice21_20, MChoice21_21,
            MChoice21_22, MChoice21_23, MChoice21_24, MChoice21_25, MChoice21_26, MChoice21_27, MChoice21_28,
            MChoice21_29, MChoice21_30, MChoice21_31, MChoice21_32, MChoice21_33, MChoice21_34, MChoice21_35
            , MChoice21_36, MChoice21_37, MChoice21_38, MChoice21_39, MChoice21_40, MChoice21_41, MChoice21_42
            , MChoice21_43, MChoice21_44, MChoice21_45, MChoice21_46, MChoice21_47, MChoice21_48, MChoice21_49
            , MChoice21_50, MChoice21_51, MChoice21_52, MChoice21_53, MChoice21_54, MChoice21_55, MChoice21_56
            , MChoice21_57, MChoice21_58, MChoice21_59, MChoice21_60, MChoice21_61, MChoice21_62, MChoice21_63
            , MChoice21_64;

    //데이터 저장
    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터



    //19학번 체크 여부
    Boolean BLMC19_1, BLMC19_2, BLMC19_3, BLMC19_4, BLMC19_5, BLMC19_6, BLMC19_7, BLMC19_8, BLMC19_9, BLMC19_10, BLMC19_11, BLMC19_12;

    Boolean BLME19_1, BLME19_2, BLME19_3, BLME19_4, BLME19_5, BLME19_6, BLME19_7, BLME19_8, BLME19_9, BLME19_10, BLME19_11,
            BLME19_12, BLME19_13, BLME19_14, BLME19_15, BLME19_16, BLME19_17, BLME19_18, BLME19_19, BLME19_20, BLME19_21, BLME19_22,
            BLME19_23, BLME19_24, BLME19_25, BLME19_26, BLME19_27, BLME19_28, BLME19_29, BLME19_30;

    Boolean BLMChoice19_1, BLMChoice19_2, BLMChoice19_3, BLMChoice19_4, BLMChoice19_5, BLMChoice19_6, BLMChoice19_7,
            BLMChoice19_8, BLMChoice19_9, BLMChoice19_10, BLMChoice19_11, BLMChoice19_12, BLMChoice19_13, BLMChoice19_14,
            BLMChoice19_15, BLMChoice19_16, BLMChoice19_17, BLMChoice19_18, BLMChoice19_19, BLMChoice19_20, BLMChoice19_21,
            BLMChoice19_22, BLMChoice19_23, BLMChoice19_24, BLMChoice19_25, BLMChoice19_26, BLMChoice19_27, BLMChoice19_28,
            BLMChoice19_29, BLMChoice19_30, BLMChoice19_31, BLMChoice19_32, BLMChoice19_33, BLMChoice19_34, BLMChoice19_35,
            BLMChoice19_36, BLMChoice19_37, BLMChoice19_38, BLMChoice19_39, BLMChoice19_40, BLMChoice19_41, BLMChoice19_42,
            BLMChoice19_43, BLMChoice19_44, BLMChoice19_45, BLMChoice19_46, BLMChoice19_47, BLMChoice19_48, BLMChoice19_49,
            BLMChoice19_50, BLMChoice19_51, BLMChoice19_52, BLMChoice19_53, BLMChoice19_54, BLMChoice19_55, BLMChoice19_56,
            BLMChoice19_57, BLMChoice19_58, BLMChoice19_59, BLMChoice19_60, BLMChoice19_61, BLMChoice19_62, BLMChoice19_63,
            BLMChoice19_64, BLMChoice19_65,  BLMChoice19_66;

    //20학번 체크 여부
    Boolean BLMC20_1, BLMC20_2, BLMC20_3, BLMC20_4, BLMC20_5, BLMC20_6, BLMC20_7, BLMC20_8, BLMC20_9, BLMC20_10, BLMC20_11, BLMC20_12;

    Boolean BLME20_1, BLME20_2, BLME20_3, BLME20_4, BLME20_5, BLME20_6, BLME20_7, BLME20_8, BLME20_9, BLME20_10, BLME20_11,
            BLME20_12, BLME20_13, BLME20_14, BLME20_15, BLME20_16, BLME20_17, BLME20_18, BLME20_19, BLME20_20, BLME20_21, BLME20_22,
            BLME20_23, BLME20_24, BLME20_25, BLME20_26, BLME20_27, BLME20_28, BLME20_29, BLME20_30;

    Boolean BLMChoice20_1, BLMChoice20_2, BLMChoice20_3, BLMChoice20_4, BLMChoice20_5, BLMChoice20_6, BLMChoice20_7,
            BLMChoice20_8, BLMChoice20_9, BLMChoice20_10, BLMChoice20_11, BLMChoice20_12, BLMChoice20_13, BLMChoice20_14,
            BLMChoice20_15, BLMChoice20_16, BLMChoice20_17, BLMChoice20_18, BLMChoice20_19, BLMChoice20_20, BLMChoice20_21,
            BLMChoice20_22, BLMChoice20_23, BLMChoice20_24, BLMChoice20_25, BLMChoice20_26, BLMChoice20_27, BLMChoice20_28,
            BLMChoice20_29, BLMChoice20_30, BLMChoice20_31, BLMChoice20_32, BLMChoice20_33, BLMChoice20_34, BLMChoice20_35,
            BLMChoice20_36, BLMChoice20_37, BLMChoice20_38, BLMChoice20_39, BLMChoice20_40, BLMChoice20_41, BLMChoice20_42,
            BLMChoice20_43, BLMChoice20_44, BLMChoice20_45, BLMChoice20_46, BLMChoice20_47, BLMChoice20_48, BLMChoice20_49,
            BLMChoice20_50, BLMChoice20_51, BLMChoice20_52, BLMChoice20_53, BLMChoice20_54, BLMChoice20_55, BLMChoice20_56,
            BLMChoice20_57, BLMChoice20_58, BLMChoice20_59, BLMChoice20_60, BLMChoice20_61, BLMChoice20_62, BLMChoice20_63,
            BLMChoice20_64, BLMChoice20_65;

    //21학번 체크 여부
    Boolean BLMC21_1, BLMC21_2, BLMC21_3, BLMC21_4, BLMC21_5, BLMC21_6, BLMC21_7, BLMC21_8, BLMC21_9, BLMC21_10, BLMC21_11, BLMC21_12;

    Boolean BLME21_1, BLME21_2, BLME21_3, BLME21_4, BLME21_5, BLME21_6, BLME21_7, BLME21_8, BLME21_9, BLME21_10, BLME21_11,
            BLME21_12, BLME21_13, BLME21_14, BLME21_15, BLME21_16, BLME21_17, BLME21_18, BLME21_19, BLME21_20, BLME21_21, BLME21_22,
            BLME21_23, BLME21_24, BLME21_25, BLME21_26, BLME21_27, BLME21_28, BLME21_29, BLME21_30;

    Boolean BLMChoice21_1, BLMChoice21_2, BLMChoice21_3, BLMChoice21_4, BLMChoice21_5, BLMChoice21_6, BLMChoice21_7,
            BLMChoice21_8, BLMChoice21_9, BLMChoice21_10, BLMChoice21_11, BLMChoice21_12, BLMChoice21_13, BLMChoice21_14,
            BLMChoice21_15, BLMChoice21_16, BLMChoice21_17, BLMChoice21_18, BLMChoice21_19, BLMChoice21_20, BLMChoice21_21,
            BLMChoice21_22, BLMChoice21_23, BLMChoice21_24, BLMChoice21_25, BLMChoice21_26, BLMChoice21_27, BLMChoice21_28,
            BLMChoice21_29, BLMChoice21_30, BLMChoice21_31, BLMChoice21_32, BLMChoice21_33, BLMChoice21_34, BLMChoice21_35,
            BLMChoice21_36, BLMChoice21_37, BLMChoice21_38, BLMChoice21_39, BLMChoice21_40, BLMChoice21_41, BLMChoice21_42,
            BLMChoice21_43, BLMChoice21_44, BLMChoice21_45, BLMChoice21_46, BLMChoice21_47, BLMChoice21_48, BLMChoice21_49,
            BLMChoice21_50, BLMChoice21_51, BLMChoice21_52, BLMChoice21_53, BLMChoice21_54, BLMChoice21_55, BLMChoice21_56,
            BLMChoice21_57, BLMChoice21_58, BLMChoice21_59, BLMChoice21_60, BLMChoice21_61, BLMChoice21_62, BLMChoice21_63,
            BLMChoice21_64;



    int MECount19 = 0, MChoiceCount19 = 0, Freenum19 = 0;
    int MECount20 = 0, MChoiceCount20 = 0, Freenum20 = 0;
    int MECount21 = 0, MChoiceCount21 = 0, Freenum21 = 0;

    int reset = 0;
    int point19 = 0;
    int point20 = 0;
    int point21 = 0;


    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.major);
        //선언
        back = (Button) findViewById(R.id.back);

        save19 = (Button) findViewById(R.id.save19);

        reset19 = (Button) findViewById(R.id.reset19);

        save20 = (Button) findViewById(R.id.save20);

        reset20 = (Button) findViewById(R.id.reset20);

        save21 = (Button) findViewById(R.id.save21);

        reset21 = (Button) findViewById(R.id.reset21);

        textExplain = (LinearLayout) findViewById(R.id.textExplain);

        schpage19_MC = (LinearLayout) findViewById(R.id.schpage19_MC);
        schpage19_ME = (LinearLayout) findViewById(R.id.schpage19_ME);
        schpage19_MChoice = (LinearLayout) findViewById(R.id.schpage19_MChoice);

        SaveAndReset19 = (LinearLayout) findViewById(R.id.SaveAndReset19);

        SaveAndReset20 = (LinearLayout) findViewById(R.id.SaveAndReset20);

        SaveAndReset21 = (LinearLayout) findViewById(R.id.SaveAndReset21);

        scroll19_MChoice = (ScrollView)findViewById(R.id.scroll19_MChoice);

        scroll20_MChoice = (ScrollView)findViewById(R.id.scroll20_MChoice);

        scroll21_MChoice = (ScrollView)findViewById(R.id.scroll21_MChoice);


        MC19_1 = (CheckBox) findViewById(R.id.MC19_1);
        MC19_2 = (CheckBox) findViewById(R.id.MC19_2);
        MC19_3 = (CheckBox) findViewById(R.id.MC19_3);
        MC19_4 = (CheckBox) findViewById(R.id.MC19_4);
        MC19_5 = (CheckBox) findViewById(R.id.MC19_5);
        MC19_6 = (CheckBox) findViewById(R.id.MC19_6);
        MC19_7 = (CheckBox) findViewById(R.id.MC19_7);
        MC19_8 = (CheckBox) findViewById(R.id.MC19_8);
        MC19_9 = (CheckBox) findViewById(R.id.MC19_9);
        MC19_10 = (CheckBox) findViewById(R.id.MC19_10);
        MC19_11 = (CheckBox) findViewById(R.id.MC19_11);
        MC19_12 = (CheckBox) findViewById(R.id.MC19_12);

        ME19_1 = (CheckBox) findViewById(R.id.ME19_1);
        ME19_2 = (CheckBox) findViewById(R.id.ME19_2);
        ME19_3 = (CheckBox) findViewById(R.id.ME19_3);
        ME19_4 = (CheckBox) findViewById(R.id.ME19_4);
        ME19_5 = (CheckBox) findViewById(R.id.ME19_5);
        ME19_6 = (CheckBox) findViewById(R.id.ME19_6);
        ME19_7 = (CheckBox) findViewById(R.id.ME19_7);
        ME19_8 = (CheckBox) findViewById(R.id.ME19_8);
        ME19_9 = (CheckBox) findViewById(R.id.ME19_9);
        ME19_10 = (CheckBox) findViewById(R.id.ME19_10);
        ME19_11 = (CheckBox) findViewById(R.id.ME19_11);
        ME19_12 = (CheckBox) findViewById(R.id.ME19_12);
        ME19_13 = (CheckBox) findViewById(R.id.ME19_13);
        ME19_14 = (CheckBox) findViewById(R.id.ME19_14);
        ME19_15 = (CheckBox) findViewById(R.id.ME19_15);
        ME19_16 = (CheckBox) findViewById(R.id.ME19_16);
        ME19_17 = (CheckBox) findViewById(R.id.ME19_17);
        ME19_18 = (CheckBox) findViewById(R.id.ME19_18);
        ME19_19 = (CheckBox) findViewById(R.id.ME19_19);
        ME19_20 = (CheckBox) findViewById(R.id.ME19_20);
        ME19_21 = (CheckBox) findViewById(R.id.ME19_21);
        ME19_22 = (CheckBox) findViewById(R.id.ME19_22);
        ME19_23 = (CheckBox) findViewById(R.id.ME19_23);
        ME19_24 = (CheckBox) findViewById(R.id.ME19_24);
        ME19_25 = (CheckBox) findViewById(R.id.ME19_25);
        ME19_26 = (CheckBox) findViewById(R.id.ME19_26);
        ME19_27 = (CheckBox) findViewById(R.id.ME19_27);
        ME19_28 = (CheckBox) findViewById(R.id.ME19_28);
        ME19_29 = (CheckBox) findViewById(R.id.ME19_29);
        ME19_30 = (CheckBox) findViewById(R.id.ME19_30);

        MChoice19_1 = (CheckBox) findViewById(R.id.MChoice19_1);
        MChoice19_2 = (CheckBox) findViewById(R.id.MChoice19_2);
        MChoice19_3 = (CheckBox) findViewById(R.id.MChoice19_3);
        MChoice19_4 = (CheckBox) findViewById(R.id.MChoice19_4);
        MChoice19_5 = (CheckBox) findViewById(R.id.MChoice19_5);
        MChoice19_6 = (CheckBox) findViewById(R.id.MChoice19_6);
        MChoice19_7 = (CheckBox) findViewById(R.id.MChoice19_7);
        MChoice19_8 = (CheckBox) findViewById(R.id.MChoice19_8);
        MChoice19_9 = (CheckBox) findViewById(R.id.MChoice19_9);
        MChoice19_10 = (CheckBox) findViewById(R.id.MChoice19_10);
        MChoice19_11 = (CheckBox) findViewById(R.id.MChoice19_11);
        MChoice19_12 = (CheckBox) findViewById(R.id.MChoice19_12);
        MChoice19_13 = (CheckBox) findViewById(R.id.MChoice19_13);
        MChoice19_14 = (CheckBox) findViewById(R.id.MChoice19_14);
        MChoice19_15 = (CheckBox) findViewById(R.id.MChoice19_15);
        MChoice19_16 = (CheckBox) findViewById(R.id.MChoice19_16);
        MChoice19_17 = (CheckBox) findViewById(R.id.MChoice19_17);
        MChoice19_18 = (CheckBox) findViewById(R.id.MChoice19_18);
        MChoice19_19 = (CheckBox) findViewById(R.id.MChoice19_19);
        MChoice19_20 = (CheckBox) findViewById(R.id.MChoice19_20);
        MChoice19_21 = (CheckBox) findViewById(R.id.MChoice19_21);
        MChoice19_22 = (CheckBox) findViewById(R.id.MChoice19_22);
        MChoice19_23 = (CheckBox) findViewById(R.id.MChoice19_23);
        MChoice19_24 = (CheckBox) findViewById(R.id.MChoice19_24);
        MChoice19_25 = (CheckBox) findViewById(R.id.MChoice19_25);
        MChoice19_26 = (CheckBox) findViewById(R.id.MChoice19_26);
        MChoice19_27 = (CheckBox) findViewById(R.id.MChoice19_27);
        MChoice19_28 = (CheckBox) findViewById(R.id.MChoice19_28);
        MChoice19_29 = (CheckBox) findViewById(R.id.MChoice19_29);
        MChoice19_30 = (CheckBox) findViewById(R.id.MChoice19_30);
        MChoice19_31 = (CheckBox) findViewById(R.id.MChoice19_31);
        MChoice19_32 = (CheckBox) findViewById(R.id.MChoice19_32);
        MChoice19_33 = (CheckBox) findViewById(R.id.MChoice19_33);
        MChoice19_34 = (CheckBox) findViewById(R.id.MChoice19_34);
        MChoice19_35 = (CheckBox) findViewById(R.id.MChoice19_35);
        MChoice19_36 = (CheckBox) findViewById(R.id.MChoice19_36);
        MChoice19_37 = (CheckBox) findViewById(R.id.MChoice19_37);
        MChoice19_38 = (CheckBox) findViewById(R.id.MChoice19_38);
        MChoice19_39 = (CheckBox) findViewById(R.id.MChoice19_39);
        MChoice19_40 = (CheckBox) findViewById(R.id.MChoice19_40);
        MChoice19_41 = (CheckBox) findViewById(R.id.MChoice19_41);
        MChoice19_42 = (CheckBox) findViewById(R.id.MChoice19_42);
        MChoice19_43 = (CheckBox) findViewById(R.id.MChoice19_43);
        MChoice19_44 = (CheckBox) findViewById(R.id.MChoice19_44);
        MChoice19_45 = (CheckBox) findViewById(R.id.MChoice19_45);
        MChoice19_46 = (CheckBox) findViewById(R.id.MChoice19_46);
        MChoice19_47 = (CheckBox) findViewById(R.id.MChoice19_47);
        MChoice19_48 = (CheckBox) findViewById(R.id.MChoice19_48);
        MChoice19_49 = (CheckBox) findViewById(R.id.MChoice19_49);
        MChoice19_50 = (CheckBox) findViewById(R.id.MChoice19_50);
        MChoice19_51 = (CheckBox) findViewById(R.id.MChoice19_51);
        MChoice19_52 = (CheckBox) findViewById(R.id.MChoice19_52);
        MChoice19_53 = (CheckBox) findViewById(R.id.MChoice19_53);
        MChoice19_54 = (CheckBox) findViewById(R.id.MChoice19_54);
        MChoice19_55 = (CheckBox) findViewById(R.id.MChoice19_55);
        MChoice19_56 = (CheckBox) findViewById(R.id.MChoice19_56);
        MChoice19_57 = (CheckBox) findViewById(R.id.MChoice19_57);
        MChoice19_58 = (CheckBox) findViewById(R.id.MChoice19_58);
        MChoice19_59 = (CheckBox) findViewById(R.id.MChoice19_59);
        MChoice19_60 = (CheckBox) findViewById(R.id.MChoice19_60);
        MChoice19_61 = (CheckBox) findViewById(R.id.MChoice19_61);
        MChoice19_62 = (CheckBox) findViewById(R.id.MChoice19_62);
        MChoice19_63 = (CheckBox) findViewById(R.id.MChoice19_63);
        MChoice19_64 = (CheckBox) findViewById(R.id.MChoice19_64);
        MChoice19_65 = (CheckBox) findViewById(R.id.MChoice19_65);
        MChoice19_66 = (CheckBox) findViewById(R.id.MChoice19_66);




        schpage20_MC = (LinearLayout) findViewById(R.id.schpage20_MC);
        schpage20_ME = (LinearLayout) findViewById(R.id.schpage20_ME);
        schpage20_MChoice = (LinearLayout) findViewById(R.id.schpage20_MChoice);

        MC20_1 = (CheckBox) findViewById(R.id.MC20_1);
        MC20_2 = (CheckBox) findViewById(R.id.MC20_2);
        MC20_3 = (CheckBox) findViewById(R.id.MC20_3);
        MC20_4 = (CheckBox) findViewById(R.id.MC20_4);
        MC20_5 = (CheckBox) findViewById(R.id.MC20_5);
        MC20_6 = (CheckBox) findViewById(R.id.MC20_6);
        MC20_7 = (CheckBox) findViewById(R.id.MC20_7);
        MC20_8 = (CheckBox) findViewById(R.id.MC20_8);
        MC20_9 = (CheckBox) findViewById(R.id.MC20_9);
        MC20_10 = (CheckBox) findViewById(R.id.MC20_10);
        MC20_11 = (CheckBox) findViewById(R.id.MC20_11);
        MC20_12 = (CheckBox) findViewById(R.id.MC20_12);

        ME20_1 = (CheckBox) findViewById(R.id.ME20_1);
        ME20_2 = (CheckBox) findViewById(R.id.ME20_2);
        ME20_3 = (CheckBox) findViewById(R.id.ME20_3);
        ME20_4 = (CheckBox) findViewById(R.id.ME20_4);
        ME20_5 = (CheckBox) findViewById(R.id.ME20_5);
        ME20_6 = (CheckBox) findViewById(R.id.ME20_6);
        ME20_7 = (CheckBox) findViewById(R.id.ME20_7);
        ME20_8 = (CheckBox) findViewById(R.id.ME20_8);
        ME20_9 = (CheckBox) findViewById(R.id.ME20_9);
        ME20_10 = (CheckBox) findViewById(R.id.ME20_10);
        ME20_11 = (CheckBox) findViewById(R.id.ME20_11);
        ME20_12 = (CheckBox) findViewById(R.id.ME20_12);
        ME20_13 = (CheckBox) findViewById(R.id.ME20_13);
        ME20_14 = (CheckBox) findViewById(R.id.ME20_14);
        ME20_15 = (CheckBox) findViewById(R.id.ME20_15);
        ME20_16 = (CheckBox) findViewById(R.id.ME20_16);
        ME20_17 = (CheckBox) findViewById(R.id.ME20_17);
        ME20_18 = (CheckBox) findViewById(R.id.ME20_18);
        ME20_19 = (CheckBox) findViewById(R.id.ME20_19);
        ME20_20 = (CheckBox) findViewById(R.id.ME20_20);
        ME20_21 = (CheckBox) findViewById(R.id.ME20_21);
        ME20_22 = (CheckBox) findViewById(R.id.ME20_22);
        ME20_23 = (CheckBox) findViewById(R.id.ME20_23);
        ME20_24 = (CheckBox) findViewById(R.id.ME20_24);
        ME20_25 = (CheckBox) findViewById(R.id.ME20_25);
        ME20_26 = (CheckBox) findViewById(R.id.ME20_26);
        ME20_27 = (CheckBox) findViewById(R.id.ME20_27);
        ME20_28 = (CheckBox) findViewById(R.id.ME20_28);
        ME20_29 = (CheckBox) findViewById(R.id.ME20_29);
        ME20_30 = (CheckBox) findViewById(R.id.ME20_30);

        MChoice20_1 = (CheckBox) findViewById(R.id.MChoice20_1);
        MChoice20_2 = (CheckBox) findViewById(R.id.MChoice20_2);
        MChoice20_3 = (CheckBox) findViewById(R.id.MChoice20_3);
        MChoice20_4 = (CheckBox) findViewById(R.id.MChoice20_4);
        MChoice20_5 = (CheckBox) findViewById(R.id.MChoice20_5);
        MChoice20_6 = (CheckBox) findViewById(R.id.MChoice20_6);
        MChoice20_7 = (CheckBox) findViewById(R.id.MChoice20_7);
        MChoice20_8 = (CheckBox) findViewById(R.id.MChoice20_8);
        MChoice20_9 = (CheckBox) findViewById(R.id.MChoice20_9);
        MChoice20_10 = (CheckBox) findViewById(R.id.MChoice20_10);
        MChoice20_11 = (CheckBox) findViewById(R.id.MChoice20_11);
        MChoice20_12 = (CheckBox) findViewById(R.id.MChoice20_12);
        MChoice20_13 = (CheckBox) findViewById(R.id.MChoice20_13);
        MChoice20_14 = (CheckBox) findViewById(R.id.MChoice20_14);
        MChoice20_15 = (CheckBox) findViewById(R.id.MChoice20_15);
        MChoice20_16 = (CheckBox) findViewById(R.id.MChoice20_16);
        MChoice20_17 = (CheckBox) findViewById(R.id.MChoice20_17);
        MChoice20_18 = (CheckBox) findViewById(R.id.MChoice20_18);
        MChoice20_19 = (CheckBox) findViewById(R.id.MChoice20_19);
        MChoice20_20 = (CheckBox) findViewById(R.id.MChoice20_20);
        MChoice20_21 = (CheckBox) findViewById(R.id.MChoice20_21);
        MChoice20_22 = (CheckBox) findViewById(R.id.MChoice20_22);
        MChoice20_23 = (CheckBox) findViewById(R.id.MChoice20_23);
        MChoice20_24 = (CheckBox) findViewById(R.id.MChoice20_24);
        MChoice20_25 = (CheckBox) findViewById(R.id.MChoice20_25);
        MChoice20_26 = (CheckBox) findViewById(R.id.MChoice20_26);
        MChoice20_27 = (CheckBox) findViewById(R.id.MChoice20_27);
        MChoice20_28 = (CheckBox) findViewById(R.id.MChoice20_28);
        MChoice20_29 = (CheckBox) findViewById(R.id.MChoice20_29);
        MChoice20_30 = (CheckBox) findViewById(R.id.MChoice20_30);
        MChoice20_31 = (CheckBox) findViewById(R.id.MChoice20_31);
        MChoice20_32 = (CheckBox) findViewById(R.id.MChoice20_32);
        MChoice20_33 = (CheckBox) findViewById(R.id.MChoice20_33);
        MChoice20_34 = (CheckBox) findViewById(R.id.MChoice20_34);
        MChoice20_35 = (CheckBox) findViewById(R.id.MChoice20_35);
        MChoice20_36 = (CheckBox) findViewById(R.id.MChoice20_36);
        MChoice20_37 = (CheckBox) findViewById(R.id.MChoice20_37);
        MChoice20_38 = (CheckBox) findViewById(R.id.MChoice20_38);
        MChoice20_39 = (CheckBox) findViewById(R.id.MChoice20_39);
        MChoice20_40 = (CheckBox) findViewById(R.id.MChoice20_40);
        MChoice20_41 = (CheckBox) findViewById(R.id.MChoice20_41);
        MChoice20_42 = (CheckBox) findViewById(R.id.MChoice20_42);
        MChoice20_43 = (CheckBox) findViewById(R.id.MChoice20_43);
        MChoice20_44 = (CheckBox) findViewById(R.id.MChoice20_44);
        MChoice20_45 = (CheckBox) findViewById(R.id.MChoice20_45);
        MChoice20_46 = (CheckBox) findViewById(R.id.MChoice20_46);
        MChoice20_47 = (CheckBox) findViewById(R.id.MChoice20_47);
        MChoice20_48 = (CheckBox) findViewById(R.id.MChoice20_48);
        MChoice20_49 = (CheckBox) findViewById(R.id.MChoice20_49);
        MChoice20_50 = (CheckBox) findViewById(R.id.MChoice20_50);
        MChoice20_51 = (CheckBox) findViewById(R.id.MChoice20_51);
        MChoice20_52 = (CheckBox) findViewById(R.id.MChoice20_52);
        MChoice20_53 = (CheckBox) findViewById(R.id.MChoice20_53);
        MChoice20_54 = (CheckBox) findViewById(R.id.MChoice20_54);
        MChoice20_55 = (CheckBox) findViewById(R.id.MChoice20_55);
        MChoice20_56 = (CheckBox) findViewById(R.id.MChoice20_56);
        MChoice20_57 = (CheckBox) findViewById(R.id.MChoice20_57);
        MChoice20_58 = (CheckBox) findViewById(R.id.MChoice20_58);
        MChoice20_59 = (CheckBox) findViewById(R.id.MChoice20_59);
        MChoice20_60 = (CheckBox) findViewById(R.id.MChoice20_60);
        MChoice20_61 = (CheckBox) findViewById(R.id.MChoice20_61);
        MChoice20_62 = (CheckBox) findViewById(R.id.MChoice20_62);
        MChoice20_63 = (CheckBox) findViewById(R.id.MChoice20_63);
        MChoice20_64 = (CheckBox) findViewById(R.id.MChoice20_64);
        MChoice20_65 = (CheckBox) findViewById(R.id.MChoice20_65);

        schpage21_MC = (LinearLayout) findViewById(R.id.schpage21_MC);
        schpage21_ME = (LinearLayout) findViewById(R.id.schpage21_ME);
        schpage21_MChoice = (LinearLayout) findViewById(R.id.schpage21_MChoice);

        MC21_1 = (CheckBox) findViewById(R.id.MC21_1);
        MC21_2 = (CheckBox) findViewById(R.id.MC21_2);
        MC21_3 = (CheckBox) findViewById(R.id.MC21_3);
        MC21_4 = (CheckBox) findViewById(R.id.MC21_4);
        MC21_5 = (CheckBox) findViewById(R.id.MC21_5);
        MC21_6 = (CheckBox) findViewById(R.id.MC21_6);
        MC21_7 = (CheckBox) findViewById(R.id.MC21_7);
        MC21_8 = (CheckBox) findViewById(R.id.MC21_8);
        MC21_9 = (CheckBox) findViewById(R.id.MC21_9);
        MC21_10 = (CheckBox) findViewById(R.id.MC21_10);
        MC21_11 = (CheckBox) findViewById(R.id.MC21_11);
        MC21_12 = (CheckBox) findViewById(R.id.MC21_12);

        ME21_1 = (CheckBox) findViewById(R.id.ME21_1);
        ME21_2 = (CheckBox) findViewById(R.id.ME21_2);
        ME21_3 = (CheckBox) findViewById(R.id.ME21_3);
        ME21_4 = (CheckBox) findViewById(R.id.ME21_4);
        ME21_5 = (CheckBox) findViewById(R.id.ME21_5);
        ME21_6 = (CheckBox) findViewById(R.id.ME21_6);
        ME21_7 = (CheckBox) findViewById(R.id.ME21_7);
        ME21_8 = (CheckBox) findViewById(R.id.ME21_8);
        ME21_9 = (CheckBox) findViewById(R.id.ME21_9);
        ME21_10 = (CheckBox) findViewById(R.id.ME21_10);
        ME21_11 = (CheckBox) findViewById(R.id.ME21_11);
        ME21_12 = (CheckBox) findViewById(R.id.ME21_12);
        ME21_13 = (CheckBox) findViewById(R.id.ME21_13);
        ME21_14 = (CheckBox) findViewById(R.id.ME21_14);
        ME21_15 = (CheckBox) findViewById(R.id.ME21_15);
        ME21_16 = (CheckBox) findViewById(R.id.ME21_16);
        ME21_17 = (CheckBox) findViewById(R.id.ME21_17);
        ME21_18 = (CheckBox) findViewById(R.id.ME21_18);
        ME21_19 = (CheckBox) findViewById(R.id.ME21_19);
        ME21_20 = (CheckBox) findViewById(R.id.ME21_20);
        ME21_21 = (CheckBox) findViewById(R.id.ME21_21);
        ME21_22 = (CheckBox) findViewById(R.id.ME21_22);
        ME21_23 = (CheckBox) findViewById(R.id.ME21_23);
        ME21_24 = (CheckBox) findViewById(R.id.ME21_24);
        ME21_25 = (CheckBox) findViewById(R.id.ME21_25);
        ME21_26 = (CheckBox) findViewById(R.id.ME21_26);
        ME21_27 = (CheckBox) findViewById(R.id.ME21_27);
        ME21_28 = (CheckBox) findViewById(R.id.ME21_28);
        ME21_29 = (CheckBox) findViewById(R.id.ME21_29);
        ME21_30 = (CheckBox) findViewById(R.id.ME21_30);

        MChoice21_1 = (CheckBox) findViewById(R.id.MChoice21_1);
        MChoice21_2 = (CheckBox) findViewById(R.id.MChoice21_2);
        MChoice21_3 = (CheckBox) findViewById(R.id.MChoice21_3);
        MChoice21_4 = (CheckBox) findViewById(R.id.MChoice21_4);
        MChoice21_5 = (CheckBox) findViewById(R.id.MChoice21_5);
        MChoice21_6 = (CheckBox) findViewById(R.id.MChoice21_6);
        MChoice21_7 = (CheckBox) findViewById(R.id.MChoice21_7);
        MChoice21_8 = (CheckBox) findViewById(R.id.MChoice21_8);
        MChoice21_9 = (CheckBox) findViewById(R.id.MChoice21_9);
        MChoice21_10 = (CheckBox) findViewById(R.id.MChoice21_10);
        MChoice21_11 = (CheckBox) findViewById(R.id.MChoice21_11);
        MChoice21_12 = (CheckBox) findViewById(R.id.MChoice21_12);
        MChoice21_13 = (CheckBox) findViewById(R.id.MChoice21_13);
        MChoice21_14 = (CheckBox) findViewById(R.id.MChoice21_14);
        MChoice21_15 = (CheckBox) findViewById(R.id.MChoice21_15);
        MChoice21_16 = (CheckBox) findViewById(R.id.MChoice21_16);
        MChoice21_17 = (CheckBox) findViewById(R.id.MChoice21_17);
        MChoice21_18 = (CheckBox) findViewById(R.id.MChoice21_18);
        MChoice21_19 = (CheckBox) findViewById(R.id.MChoice21_19);
        MChoice21_20 = (CheckBox) findViewById(R.id.MChoice21_20);
        MChoice21_21 = (CheckBox) findViewById(R.id.MChoice21_21);
        MChoice21_22 = (CheckBox) findViewById(R.id.MChoice21_22);
        MChoice21_23 = (CheckBox) findViewById(R.id.MChoice21_23);
        MChoice21_24 = (CheckBox) findViewById(R.id.MChoice21_24);
        MChoice21_25 = (CheckBox) findViewById(R.id.MChoice21_25);
        MChoice21_26 = (CheckBox) findViewById(R.id.MChoice21_26);
        MChoice21_27 = (CheckBox) findViewById(R.id.MChoice21_27);
        MChoice21_28 = (CheckBox) findViewById(R.id.MChoice21_28);
        MChoice21_29 = (CheckBox) findViewById(R.id.MChoice21_29);
        MChoice21_30 = (CheckBox) findViewById(R.id.MChoice21_30);
        MChoice21_31 = (CheckBox) findViewById(R.id.MChoice21_31);
        MChoice21_32 = (CheckBox) findViewById(R.id.MChoice21_32);
        MChoice21_33 = (CheckBox) findViewById(R.id.MChoice21_33);
        MChoice21_34 = (CheckBox) findViewById(R.id.MChoice21_34);
        MChoice21_35 = (CheckBox) findViewById(R.id.MChoice21_35);
        MChoice21_36 = (CheckBox) findViewById(R.id.MChoice21_36);
        MChoice21_37 = (CheckBox) findViewById(R.id.MChoice21_37);
        MChoice21_38 = (CheckBox) findViewById(R.id.MChoice21_38);
        MChoice21_39 = (CheckBox) findViewById(R.id.MChoice21_39);
        MChoice21_40 = (CheckBox) findViewById(R.id.MChoice21_40);
        MChoice21_41 = (CheckBox) findViewById(R.id.MChoice21_41);
        MChoice21_42 = (CheckBox) findViewById(R.id.MChoice21_42);
        MChoice21_43 = (CheckBox) findViewById(R.id.MChoice21_43);
        MChoice21_44 = (CheckBox) findViewById(R.id.MChoice21_44);
        MChoice21_45 = (CheckBox) findViewById(R.id.MChoice21_45);
        MChoice21_46 = (CheckBox) findViewById(R.id.MChoice21_46);
        MChoice21_47 = (CheckBox) findViewById(R.id.MChoice21_47);
        MChoice21_48 = (CheckBox) findViewById(R.id.MChoice21_48);
        MChoice21_49 = (CheckBox) findViewById(R.id.MChoice21_49);
        MChoice21_50 = (CheckBox) findViewById(R.id.MChoice21_50);
        MChoice21_51 = (CheckBox) findViewById(R.id.MChoice21_51);
        MChoice21_52 = (CheckBox) findViewById(R.id.MChoice21_52);
        MChoice21_53 = (CheckBox) findViewById(R.id.MChoice21_53);
        MChoice21_54 = (CheckBox) findViewById(R.id.MChoice21_54);
        MChoice21_55 = (CheckBox) findViewById(R.id.MChoice21_55);
        MChoice21_56 = (CheckBox) findViewById(R.id.MChoice21_56);
        MChoice21_57 = (CheckBox) findViewById(R.id.MChoice21_57);
        MChoice21_58 = (CheckBox) findViewById(R.id.MChoice21_58);
        MChoice21_59 = (CheckBox) findViewById(R.id.MChoice21_59);
        MChoice21_60 = (CheckBox) findViewById(R.id.MChoice21_60);
        MChoice21_61 = (CheckBox) findViewById(R.id.MChoice21_61);
        MChoice21_62 = (CheckBox) findViewById(R.id.MChoice21_62);
        MChoice21_63 = (CheckBox) findViewById(R.id.MChoice21_63);
        MChoice21_64 = (CheckBox) findViewById(R.id.MChoice21_64);



        //데이터 저장
        pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        editor = pref.edit();
        BLMC19_1 = pref.getBoolean("BLMC19_1", false);
        MC19_1.setChecked(Boolean.valueOf(BLMC19_1));
        BLMC19_2 = pref.getBoolean("BLMC19_2", false);
        MC19_2.setChecked(Boolean.valueOf(BLMC19_2));
        BLMC19_3 = pref.getBoolean("BLMC19_3", false);
        MC19_3.setChecked(Boolean.valueOf(BLMC19_3));
        BLMC19_4 = pref.getBoolean("BLMC19_4", false);
        MC19_4.setChecked(Boolean.valueOf(BLMC19_4));
        BLMC19_5 = pref.getBoolean("BLMC19_5", false);
        MC19_5.setChecked(Boolean.valueOf(BLMC19_5));
        BLMC19_6 = pref.getBoolean("BLMC19_6", false);
        MC19_6.setChecked(Boolean.valueOf(BLMC19_6));
        BLMC19_7 = pref.getBoolean("BLMC19_7", false);
        MC19_7.setChecked(Boolean.valueOf(BLMC19_7));
        BLMC19_8 = pref.getBoolean("BLMC19_8", false);
        MC19_8.setChecked(Boolean.valueOf(BLMC19_8));
        BLMC19_9 = pref.getBoolean("BLMC19_9", false);
        MC19_9.setChecked(Boolean.valueOf(BLMC19_9));
        BLMC19_10 = pref.getBoolean("BLMC19_10", false);
        MC19_10.setChecked(Boolean.valueOf(BLMC19_10));
        BLMC19_11 = pref.getBoolean("BLMC19_11", false);
        MC19_11.setChecked(Boolean.valueOf(BLMC19_11));
        BLMC19_12 = pref.getBoolean("BLMC19_12", false);
        MC19_12.setChecked(Boolean.valueOf(BLMC19_12));

        BLME19_1 = pref.getBoolean("BLME19_1", false);
        ME19_1.setChecked(Boolean.valueOf(BLME19_1));
        BLME19_2 = pref.getBoolean("BLME19_2", false);
        ME19_2.setChecked(Boolean.valueOf(BLME19_2));
        BLME19_3 = pref.getBoolean("BLME19_3", false);
        ME19_3.setChecked(Boolean.valueOf(BLME19_3));
        BLME19_4 = pref.getBoolean("BLME19_4", false);
        ME19_4.setChecked(Boolean.valueOf(BLME19_4));
        BLME19_5 = pref.getBoolean("BLME19_5", false);
        ME19_5.setChecked(Boolean.valueOf(BLME19_5));
        BLME19_6 = pref.getBoolean("BLME19_6", false);
        ME19_6.setChecked(Boolean.valueOf(BLME19_6));
        BLME19_7 = pref.getBoolean("BLME19_7", false);
        ME19_7.setChecked(Boolean.valueOf(BLME19_7));
        BLME19_8 = pref.getBoolean("BLME19_8", false);
        ME19_8.setChecked(Boolean.valueOf(BLME19_8));
        BLME19_9 = pref.getBoolean("BLME19_9", false);
        ME19_9.setChecked(Boolean.valueOf(BLME19_9));
        BLME19_10 = pref.getBoolean("BLME19_10", false);
        ME19_10.setChecked(Boolean.valueOf(BLME19_10));
        BLME19_11 = pref.getBoolean("BLME19_11", false);
        ME19_11.setChecked(Boolean.valueOf(BLME19_11));
        BLME19_12 = pref.getBoolean("BLME19_12", false);
        ME19_12.setChecked(Boolean.valueOf(BLME19_12));
        BLME19_13 = pref.getBoolean("BLME19_13", false);
        ME19_13.setChecked(Boolean.valueOf(BLME19_13));
        BLME19_14 = pref.getBoolean("BLME19_14", false);
        ME19_14.setChecked(Boolean.valueOf(BLME19_14));
        BLME19_15 = pref.getBoolean("BLME19_15", false);
        ME19_15.setChecked(Boolean.valueOf(BLME19_15));
        BLME19_16 = pref.getBoolean("BLME19_16", false);
        ME19_16.setChecked(Boolean.valueOf(BLME19_16));
        BLME19_17 = pref.getBoolean("BLME19_17", false);
        ME19_17.setChecked(Boolean.valueOf(BLME19_17));
        BLME19_18 = pref.getBoolean("BLME19_18", false);
        ME19_18.setChecked(Boolean.valueOf(BLME19_18));
        BLME19_19 = pref.getBoolean("BLME19_19", false);
        ME19_19.setChecked(Boolean.valueOf(BLME19_19));
        BLME19_20 = pref.getBoolean("BLME19_20", false);
        ME19_20.setChecked(Boolean.valueOf(BLME19_20));
        BLME19_21 = pref.getBoolean("BLME19_21", false);
        ME19_21.setChecked(Boolean.valueOf(BLME19_21));
        BLME19_22 = pref.getBoolean("BLME19_22", false);
        ME19_22.setChecked(Boolean.valueOf(BLME19_22));
        BLME19_23 = pref.getBoolean("BLME19_23", false);
        ME19_23.setChecked(Boolean.valueOf(BLME19_23));
        BLME19_24 = pref.getBoolean("BLME19_24", false);
        ME19_24.setChecked(Boolean.valueOf(BLME19_24));
        BLME19_25 = pref.getBoolean("BLME19_25", false);
        ME19_25.setChecked(Boolean.valueOf(BLME19_25));
        BLME19_26 = pref.getBoolean("BLME19_26", false);
        ME19_26.setChecked(Boolean.valueOf(BLME19_26));
        BLME19_27 = pref.getBoolean("BLME19_27", false);
        ME19_27.setChecked(Boolean.valueOf(BLME19_27));
        BLME19_28 = pref.getBoolean("BLME19_28", false);
        ME19_28.setChecked(Boolean.valueOf(BLME19_28));
        BLME19_29 = pref.getBoolean("BLME19_29", false);
        ME19_29.setChecked(Boolean.valueOf(BLME19_29));
        BLME19_30 = pref.getBoolean("BLME19_30", false);
        ME19_30.setChecked(Boolean.valueOf(BLME19_30));

        BLMChoice19_1 = pref.getBoolean("BLMChoice19_1", false);
        MChoice19_1.setChecked(Boolean.valueOf(BLMChoice19_1));
        BLMChoice19_2 = pref.getBoolean("BLMChoice19_2", false);
        MChoice19_2.setChecked(Boolean.valueOf(BLMChoice19_2));
        BLMChoice19_3 = pref.getBoolean("BLMChoice19_3", false);
        MChoice19_3.setChecked(Boolean.valueOf(BLMChoice19_3));
        BLMChoice19_4 = pref.getBoolean("BLMChoice19_4", false);
        MChoice19_4.setChecked(Boolean.valueOf(BLMChoice19_4));
        BLMChoice19_5 = pref.getBoolean("BLMChoice19_5", false);
        MChoice19_5.setChecked(Boolean.valueOf(BLMChoice19_5));
        BLMChoice19_6 = pref.getBoolean("BLMChoice19_6", false);
        MChoice19_6.setChecked(Boolean.valueOf(BLMChoice19_6));
        BLMChoice19_7 = pref.getBoolean("BLMChoice19_7", false);
        MChoice19_7.setChecked(Boolean.valueOf(BLMChoice19_7));
        BLMChoice19_8 = pref.getBoolean("BLMChoice19_8", false);
        MChoice19_8.setChecked(Boolean.valueOf(BLMChoice19_8));
        BLMChoice19_9 = pref.getBoolean("BLMChoice19_9", false);
        MChoice19_9.setChecked(Boolean.valueOf(BLMChoice19_9));
        BLMChoice19_10 = pref.getBoolean("BLMChoice19_10", false);
        MChoice19_10.setChecked(Boolean.valueOf(BLMChoice19_10));
        BLMChoice19_11 = pref.getBoolean("BLMChoice19_11", false);
        MChoice19_11.setChecked(Boolean.valueOf(BLMChoice19_11));
        BLMChoice19_12 = pref.getBoolean("BLMChoice19_12", false);
        MChoice19_12.setChecked(Boolean.valueOf(BLMChoice19_12));
        BLMChoice19_13 = pref.getBoolean("BLMChoice19_13", false);
        MChoice19_13.setChecked(Boolean.valueOf(BLMChoice19_13));
        BLMChoice19_14 = pref.getBoolean("BLMChoice19_14", false);
        MChoice19_14.setChecked(Boolean.valueOf(BLMChoice19_14));
        BLMChoice19_15 = pref.getBoolean("BLMChoice19_15", false);
        MChoice19_15.setChecked(Boolean.valueOf(BLMChoice19_15));
        BLMChoice19_16 = pref.getBoolean("BLMChoice19_16", false);
        MChoice19_16.setChecked(Boolean.valueOf(BLMChoice19_16));
        BLMChoice19_17 = pref.getBoolean("BLMChoice19_17", false);
        MChoice19_17.setChecked(Boolean.valueOf(BLMChoice19_17));
        BLMChoice19_18 = pref.getBoolean("BLMChoice19_18", false);
        MChoice19_18.setChecked(Boolean.valueOf(BLMChoice19_18));
        BLMChoice19_19 = pref.getBoolean("BLMChoice19_19", false);
        MChoice19_19.setChecked(Boolean.valueOf(BLMChoice19_19));
        BLMChoice19_20 = pref.getBoolean("BLMChoice19_20", false);
        MChoice19_20.setChecked(Boolean.valueOf(BLMChoice19_20));
        BLMChoice19_21 = pref.getBoolean("BLMChoice19_21", false);
        MChoice19_21.setChecked(Boolean.valueOf(BLMChoice19_21));
        BLMChoice19_22 = pref.getBoolean("BLMChoice19_22", false);
        MChoice19_22.setChecked(Boolean.valueOf(BLMChoice19_22));
        BLMChoice19_23 = pref.getBoolean("BLMChoice19_23", false);
        MChoice19_23.setChecked(Boolean.valueOf(BLMChoice19_23));
        BLMChoice19_24 = pref.getBoolean("BLMChoice19_24", false);
        MChoice19_24.setChecked(Boolean.valueOf(BLMChoice19_24));
        BLMChoice19_25 = pref.getBoolean("BLMChoice19_25", false);
        MChoice19_25.setChecked(Boolean.valueOf(BLMChoice19_25));
        BLMChoice19_26 = pref.getBoolean("BLMChoice19_26", false);
        MChoice19_26.setChecked(Boolean.valueOf(BLMChoice19_26));
        BLMChoice19_27 = pref.getBoolean("BLMChoice19_27", false);
        MChoice19_27.setChecked(Boolean.valueOf(BLMChoice19_27));
        BLMChoice19_28 = pref.getBoolean("BLMChoice19_28", false);
        MChoice19_28.setChecked(Boolean.valueOf(BLMChoice19_28));
        BLMChoice19_29 = pref.getBoolean("BLMChoice19_29", false);
        MChoice19_29.setChecked(Boolean.valueOf(BLMChoice19_29));
        BLMChoice19_30 = pref.getBoolean("BLMChoice19_30", false);
        MChoice19_30.setChecked(Boolean.valueOf(BLMChoice19_30));
        BLMChoice19_31 = pref.getBoolean("BLMChoice19_31", false);
        MChoice19_31.setChecked(Boolean.valueOf(BLMChoice19_31));
        BLMChoice19_32 = pref.getBoolean("BLMChoice19_32", false);
        MChoice19_32.setChecked(Boolean.valueOf(BLMChoice19_32));
        BLMChoice19_33 = pref.getBoolean("BLMChoice19_33", false);
        MChoice19_33.setChecked(Boolean.valueOf(BLMChoice19_33));
        BLMChoice19_34 = pref.getBoolean("BLMChoice19_34", false);
        MChoice19_34.setChecked(Boolean.valueOf(BLMChoice19_34));
        BLMChoice19_35 = pref.getBoolean("BLMChoice19_35", false);
        MChoice19_35.setChecked(Boolean.valueOf(BLMChoice19_35));
        BLMChoice19_36 = pref.getBoolean("BLMChoice19_36", false);
        MChoice19_36.setChecked(Boolean.valueOf(BLMChoice19_36));
        BLMChoice19_37 = pref.getBoolean("BLMChoice19_37", false);
        MChoice19_37.setChecked(Boolean.valueOf(BLMChoice19_37));
        BLMChoice19_38 = pref.getBoolean("BLMChoice19_38", false);
        MChoice19_38.setChecked(Boolean.valueOf(BLMChoice19_38));
        BLMChoice19_39 = pref.getBoolean("BLMChoice19_39", false);
        MChoice19_39.setChecked(Boolean.valueOf(BLMChoice19_39));
        BLMChoice19_40 = pref.getBoolean("BLMChoice19_40", false);
        MChoice19_40.setChecked(Boolean.valueOf(BLMChoice19_40));
        BLMChoice19_41 = pref.getBoolean("BLMChoice19_41", false);
        MChoice19_41.setChecked(Boolean.valueOf(BLMChoice19_41));
        BLMChoice19_42 = pref.getBoolean("BLMChoice19_42", false);
        MChoice19_42.setChecked(Boolean.valueOf(BLMChoice19_42));
        BLMChoice19_43 = pref.getBoolean("BLMChoice19_43", false);
        MChoice19_43.setChecked(Boolean.valueOf(BLMChoice19_43));
        BLMChoice19_44 = pref.getBoolean("BLMChoice19_44", false);
        MChoice19_44.setChecked(Boolean.valueOf(BLMChoice19_44));
        BLMChoice19_45 = pref.getBoolean("BLMChoice19_45", false);
        MChoice19_45.setChecked(Boolean.valueOf(BLMChoice19_45));
        BLMChoice19_46 = pref.getBoolean("BLMChoice19_46", false);
        MChoice19_46.setChecked(Boolean.valueOf(BLMChoice19_46));
        BLMChoice19_47 = pref.getBoolean("BLMChoice19_47", false);
        MChoice19_47.setChecked(Boolean.valueOf(BLMChoice19_47));
        BLMChoice19_48 = pref.getBoolean("BLMChoice19_48", false);
        MChoice19_48.setChecked(Boolean.valueOf(BLMChoice19_48));
        BLMChoice19_49 = pref.getBoolean("BLMChoice19_49", false);
        MChoice19_49.setChecked(Boolean.valueOf(BLMChoice19_49));
        BLMChoice19_50 = pref.getBoolean("BLMChoice19_50", false);
        MChoice19_50.setChecked(Boolean.valueOf(BLMChoice19_50));
        BLMChoice19_51 = pref.getBoolean("BLMChoice19_51", false);
        MChoice19_51.setChecked(Boolean.valueOf(BLMChoice19_51));
        BLMChoice19_52 = pref.getBoolean("BLMChoice19_52", false);
        MChoice19_52.setChecked(Boolean.valueOf(BLMChoice19_52));
        BLMChoice19_53 = pref.getBoolean("BLMChoice19_53", false);
        MChoice19_53.setChecked(Boolean.valueOf(BLMChoice19_53));
        BLMChoice19_54 = pref.getBoolean("BLMChoice19_54", false);
        MChoice19_54.setChecked(Boolean.valueOf(BLMChoice19_54));
        BLMChoice19_55 = pref.getBoolean("BLMChoice19_55", false);
        MChoice19_55.setChecked(Boolean.valueOf(BLMChoice19_55));
        BLMChoice19_56 = pref.getBoolean("BLMChoice19_56", false);
        MChoice19_56.setChecked(Boolean.valueOf(BLMChoice19_56));
        BLMChoice19_57 = pref.getBoolean("BLMChoice19_57", false);
        MChoice19_57.setChecked(Boolean.valueOf(BLMChoice19_57));
        BLMChoice19_58 = pref.getBoolean("BLMChoice19_58", false);
        MChoice19_58.setChecked(Boolean.valueOf(BLMChoice19_58));
        BLMChoice19_59 = pref.getBoolean("BLMChoice19_59", false);
        MChoice19_59.setChecked(Boolean.valueOf(BLMChoice19_59));
        BLMChoice19_60 = pref.getBoolean("BLMChoice19_60", false);
        MChoice19_60.setChecked(Boolean.valueOf(BLMChoice19_60));
        BLMChoice19_61 = pref.getBoolean("BLMChoice19_61", false);
        MChoice19_61.setChecked(Boolean.valueOf(BLMChoice19_61));
        BLMChoice19_62 = pref.getBoolean("BLMChoice19_62", false);
        MChoice19_62.setChecked(Boolean.valueOf(BLMChoice19_62));
        BLMChoice19_63 = pref.getBoolean("BLMChoice19_63", false);
        MChoice19_63.setChecked(Boolean.valueOf(BLMChoice19_63));
        BLMChoice19_64 = pref.getBoolean("BLMChoice19_64", false);
        MChoice19_64.setChecked(Boolean.valueOf(BLMChoice19_64));
        BLMChoice19_65 = pref.getBoolean("BLMChoice19_65", false);
        MChoice19_65.setChecked(Boolean.valueOf(BLMChoice19_65));
        BLMChoice19_66 = pref.getBoolean("BLMChoice19_66", false);
        MChoice19_66.setChecked(Boolean.valueOf(BLMChoice19_66));



        Freenum19 = pref.getInt("Freenum19", Freenum19);


        BLMC20_1 = pref.getBoolean("BLMC20_1", false);
        MC20_1.setChecked(Boolean.valueOf(BLMC20_1));

        BLMC20_2 = pref.getBoolean("BLMC20_2", false);
        MC20_2.setChecked(Boolean.valueOf(BLMC20_2));
        BLMC20_3 = pref.getBoolean("BLMC20_3", false);
        MC20_3.setChecked(Boolean.valueOf(BLMC20_3));
        BLMC20_4 = pref.getBoolean("BLMC20_4", false);
        MC20_4.setChecked(Boolean.valueOf(BLMC20_4));
        BLMC20_5 = pref.getBoolean("BLMC20_5", false);
        MC20_5.setChecked(Boolean.valueOf(BLMC20_5));
        BLMC20_6 = pref.getBoolean("BLMC20_6", false);
        MC20_6.setChecked(Boolean.valueOf(BLMC20_6));
        BLMC20_7 = pref.getBoolean("BLMC20_7", false);
        MC20_7.setChecked(Boolean.valueOf(BLMC20_7));
        BLMC20_8 = pref.getBoolean("BLMC20_8", false);
        MC20_8.setChecked(Boolean.valueOf(BLMC20_8));
        BLMC20_9 = pref.getBoolean("BLMC20_9", false);
        MC20_9.setChecked(Boolean.valueOf(BLMC20_9));
        BLMC20_10 = pref.getBoolean("BLMC20_10", false);
        MC20_10.setChecked(Boolean.valueOf(BLMC20_10));
        BLMC20_11 = pref.getBoolean("BLMC20_11", false);
        MC20_11.setChecked(Boolean.valueOf(BLMC20_11));
        BLMC20_12 = pref.getBoolean("BLMC20_12", false);
        MC20_12.setChecked(Boolean.valueOf(BLMC20_12));

        BLME20_1 = pref.getBoolean("BLME20_1", false);
        ME20_1.setChecked(Boolean.valueOf(BLME20_1));
        BLME20_2 = pref.getBoolean("BLME20_2", false);
        ME20_2.setChecked(Boolean.valueOf(BLME20_2));
        BLME20_3 = pref.getBoolean("BLME20_3", false);
        ME20_3.setChecked(Boolean.valueOf(BLME20_3));
        BLME20_4 = pref.getBoolean("BLME20_4", false);
        ME20_4.setChecked(Boolean.valueOf(BLME20_4));
        BLME20_5 = pref.getBoolean("BLME20_5", false);
        ME20_5.setChecked(Boolean.valueOf(BLME20_5));
        BLME20_6 = pref.getBoolean("BLME20_6", false);
        ME20_6.setChecked(Boolean.valueOf(BLME20_6));
        BLME20_7 = pref.getBoolean("BLME20_7", false);
        ME20_7.setChecked(Boolean.valueOf(BLME20_7));
        BLME20_8 = pref.getBoolean("BLME20_8", false);
        ME20_8.setChecked(Boolean.valueOf(BLME20_8));
        BLME20_9 = pref.getBoolean("BLME20_9", false);
        ME20_9.setChecked(Boolean.valueOf(BLME20_9));
        BLME20_10 = pref.getBoolean("BLME20_10", false);
        ME20_10.setChecked(Boolean.valueOf(BLME20_10));
        BLME20_11 = pref.getBoolean("BLME20_11", false);
        ME20_11.setChecked(Boolean.valueOf(BLME20_11));
        BLME20_12 = pref.getBoolean("BLME20_12", false);
        ME20_12.setChecked(Boolean.valueOf(BLME20_12));
        BLME20_13 = pref.getBoolean("BLME20_13", false);
        ME20_13.setChecked(Boolean.valueOf(BLME20_13));
        BLME20_14 = pref.getBoolean("BLME20_14", false);
        ME20_14.setChecked(Boolean.valueOf(BLME20_14));
        BLME20_15 = pref.getBoolean("BLME20_15", false);
        ME20_15.setChecked(Boolean.valueOf(BLME20_15));
        BLME20_16 = pref.getBoolean("BLME20_16", false);
        ME20_16.setChecked(Boolean.valueOf(BLME20_16));
        BLME20_17 = pref.getBoolean("BLME20_17", false);
        ME20_17.setChecked(Boolean.valueOf(BLME20_17));
        BLME20_18 = pref.getBoolean("BLME20_18", false);
        ME20_18.setChecked(Boolean.valueOf(BLME20_18));
        BLME20_19 = pref.getBoolean("BLME20_19", false);
        ME20_19.setChecked(Boolean.valueOf(BLME20_19));
        BLME20_20 = pref.getBoolean("BLME20_20", false);
        ME20_20.setChecked(Boolean.valueOf(BLME20_20));
        BLME20_21 = pref.getBoolean("BLME20_21", false);
        ME20_21.setChecked(Boolean.valueOf(BLME20_21));
        BLME20_22 = pref.getBoolean("BLME20_22", false);
        ME20_22.setChecked(Boolean.valueOf(BLME20_22));
        BLME20_23 = pref.getBoolean("BLME20_23", false);
        ME20_23.setChecked(Boolean.valueOf(BLME20_23));
        BLME20_24 = pref.getBoolean("BLME20_24", false);
        ME20_24.setChecked(Boolean.valueOf(BLME20_24));
        BLME20_25 = pref.getBoolean("BLME20_25", false);
        ME20_25.setChecked(Boolean.valueOf(BLME20_25));
        BLME20_26 = pref.getBoolean("BLME20_26", false);
        ME20_26.setChecked(Boolean.valueOf(BLME20_26));
        BLME20_27 = pref.getBoolean("BLME20_27", false);
        ME20_27.setChecked(Boolean.valueOf(BLME20_27));
        BLME20_28 = pref.getBoolean("BLME20_28", false);
        ME20_28.setChecked(Boolean.valueOf(BLME20_28));
        BLME20_29 = pref.getBoolean("BLME20_29", false);
        ME20_29.setChecked(Boolean.valueOf(BLME20_29));
        BLME20_30 = pref.getBoolean("BLME20_30", false);
        ME20_30.setChecked(Boolean.valueOf(BLME20_30));

        BLMChoice20_1 = pref.getBoolean("BLMChoice20_1", false);
        MChoice20_1.setChecked(Boolean.valueOf(BLMChoice20_1));
        BLMChoice20_2 = pref.getBoolean("BLMChoice20_2", false);
        MChoice20_2.setChecked(Boolean.valueOf(BLMChoice20_2));
        BLMChoice20_3 = pref.getBoolean("BLMChoice20_3", false);
        MChoice20_3.setChecked(Boolean.valueOf(BLMChoice20_3));
        BLMChoice20_4 = pref.getBoolean("BLMChoice20_4", false);
        MChoice20_4.setChecked(Boolean.valueOf(BLMChoice20_4));
        BLMChoice20_5 = pref.getBoolean("BLMChoice20_5", false);
        MChoice20_5.setChecked(Boolean.valueOf(BLMChoice20_5));
        BLMChoice20_6 = pref.getBoolean("BLMChoice20_6", false);
        MChoice20_6.setChecked(Boolean.valueOf(BLMChoice20_6));
        BLMChoice20_7 = pref.getBoolean("BLMChoice20_7", false);
        MChoice20_7.setChecked(Boolean.valueOf(BLMChoice20_7));
        BLMChoice20_8 = pref.getBoolean("BLMChoice20_8", false);
        MChoice20_8.setChecked(Boolean.valueOf(BLMChoice20_8));
        BLMChoice20_9 = pref.getBoolean("BLMChoice20_9", false);
        MChoice20_9.setChecked(Boolean.valueOf(BLMChoice20_9));
        BLMChoice20_10 = pref.getBoolean("BLMChoice20_10", false);
        MChoice20_10.setChecked(Boolean.valueOf(BLMChoice20_10));
        BLMChoice20_11 = pref.getBoolean("BLMChoice20_11", false);
        MChoice20_11.setChecked(Boolean.valueOf(BLMChoice20_11));
        BLMChoice20_12 = pref.getBoolean("BLMChoice20_12", false);
        MChoice20_12.setChecked(Boolean.valueOf(BLMChoice20_12));
        BLMChoice20_13 = pref.getBoolean("BLMChoice20_13", false);
        MChoice20_13.setChecked(Boolean.valueOf(BLMChoice20_13));
        BLMChoice20_14 = pref.getBoolean("BLMChoice20_14", false);
        MChoice20_14.setChecked(Boolean.valueOf(BLMChoice20_14));
        BLMChoice20_15 = pref.getBoolean("BLMChoice20_15", false);
        MChoice20_15.setChecked(Boolean.valueOf(BLMChoice20_15));
        BLMChoice20_16 = pref.getBoolean("BLMChoice20_16", false);
        MChoice20_16.setChecked(Boolean.valueOf(BLMChoice20_16));
        BLMChoice20_17 = pref.getBoolean("BLMChoice20_17", false);
        MChoice20_17.setChecked(Boolean.valueOf(BLMChoice20_17));
        BLMChoice20_18 = pref.getBoolean("BLMChoice20_18", false);
        MChoice20_18.setChecked(Boolean.valueOf(BLMChoice20_18));
        BLMChoice20_19 = pref.getBoolean("BLMChoice20_19", false);
        MChoice20_19.setChecked(Boolean.valueOf(BLMChoice20_19));
        BLMChoice20_20 = pref.getBoolean("BLMChoice20_20", false);
        MChoice20_20.setChecked(Boolean.valueOf(BLMChoice20_20));
        BLMChoice20_21 = pref.getBoolean("BLMChoice20_21", false);
        MChoice20_21.setChecked(Boolean.valueOf(BLMChoice20_21));
        BLMChoice20_22 = pref.getBoolean("BLMChoice20_22", false);
        MChoice20_22.setChecked(Boolean.valueOf(BLMChoice20_22));
        BLMChoice20_23 = pref.getBoolean("BLMChoice20_23", false);
        MChoice20_23.setChecked(Boolean.valueOf(BLMChoice20_23));
        BLMChoice20_24 = pref.getBoolean("BLMChoice20_24", false);
        MChoice20_24.setChecked(Boolean.valueOf(BLMChoice20_24));
        BLMChoice20_25 = pref.getBoolean("BLMChoice20_25", false);
        MChoice20_25.setChecked(Boolean.valueOf(BLMChoice20_25));
        BLMChoice20_26 = pref.getBoolean("BLMChoice20_26", false);
        MChoice20_26.setChecked(Boolean.valueOf(BLMChoice20_26));
        BLMChoice20_27 = pref.getBoolean("BLMChoice20_27", false);
        MChoice20_27.setChecked(Boolean.valueOf(BLMChoice20_27));
        BLMChoice20_28 = pref.getBoolean("BLMChoice20_28", false);
        MChoice20_28.setChecked(Boolean.valueOf(BLMChoice20_28));
        BLMChoice20_29 = pref.getBoolean("BLMChoice20_29", false);
        MChoice20_29.setChecked(Boolean.valueOf(BLMChoice20_29));
        BLMChoice20_30 = pref.getBoolean("BLMChoice20_30", false);
        MChoice20_30.setChecked(Boolean.valueOf(BLMChoice20_30));
        BLMChoice20_31 = pref.getBoolean("BLMChoice20_31", false);
        MChoice20_31.setChecked(Boolean.valueOf(BLMChoice20_31));
        BLMChoice20_32 = pref.getBoolean("BLMChoice20_32", false);
        MChoice20_32.setChecked(Boolean.valueOf(BLMChoice20_32));
        BLMChoice20_33 = pref.getBoolean("BLMChoice20_33", false);
        MChoice20_33.setChecked(Boolean.valueOf(BLMChoice20_33));
        BLMChoice20_34 = pref.getBoolean("BLMChoice20_34", false);
        MChoice20_34.setChecked(Boolean.valueOf(BLMChoice20_34));
        BLMChoice20_35 = pref.getBoolean("BLMChoice20_35", false);
        MChoice20_35.setChecked(Boolean.valueOf(BLMChoice20_35));
        BLMChoice20_36 = pref.getBoolean("BLMChoice20_36", false);
        MChoice20_36.setChecked(Boolean.valueOf(BLMChoice20_36));
        BLMChoice20_37 = pref.getBoolean("BLMChoice20_37", false);
        MChoice20_37.setChecked(Boolean.valueOf(BLMChoice20_37));
        BLMChoice20_38 = pref.getBoolean("BLMChoice20_38", false);
        MChoice20_38.setChecked(Boolean.valueOf(BLMChoice20_38));
        BLMChoice20_39 = pref.getBoolean("BLMChoice20_39", false);
        MChoice20_39.setChecked(Boolean.valueOf(BLMChoice20_39));
        BLMChoice20_40 = pref.getBoolean("BLMChoice20_40", false);
        MChoice20_40.setChecked(Boolean.valueOf(BLMChoice20_40));
        BLMChoice20_41 = pref.getBoolean("BLMChoice20_41", false);
        MChoice20_41.setChecked(Boolean.valueOf(BLMChoice20_41));
        BLMChoice20_42 = pref.getBoolean("BLMChoice20_42", false);
        MChoice20_42.setChecked(Boolean.valueOf(BLMChoice20_42));
        BLMChoice20_43 = pref.getBoolean("BLMChoice20_43", false);
        MChoice20_43.setChecked(Boolean.valueOf(BLMChoice20_43));
        BLMChoice20_44 = pref.getBoolean("BLMChoice20_44", false);
        MChoice20_44.setChecked(Boolean.valueOf(BLMChoice20_44));
        BLMChoice20_45 = pref.getBoolean("BLMChoice20_45", false);
        MChoice20_45.setChecked(Boolean.valueOf(BLMChoice20_45));
        BLMChoice20_46 = pref.getBoolean("BLMChoice20_46", false);
        MChoice20_46.setChecked(Boolean.valueOf(BLMChoice20_46));
        BLMChoice20_47 = pref.getBoolean("BLMChoice20_47", false);
        MChoice20_47.setChecked(Boolean.valueOf(BLMChoice20_47));
        BLMChoice20_48 = pref.getBoolean("BLMChoice20_48", false);
        MChoice20_48.setChecked(Boolean.valueOf(BLMChoice20_48));
        BLMChoice20_49 = pref.getBoolean("BLMChoice20_49", false);
        MChoice20_49.setChecked(Boolean.valueOf(BLMChoice20_49));
        BLMChoice20_50 = pref.getBoolean("BLMChoice20_50", false);
        MChoice20_50.setChecked(Boolean.valueOf(BLMChoice20_50));
        BLMChoice20_51 = pref.getBoolean("BLMChoice20_51", false);
        MChoice20_51.setChecked(Boolean.valueOf(BLMChoice20_51));
        BLMChoice20_52 = pref.getBoolean("BLMChoice20_52", false);
        MChoice20_52.setChecked(Boolean.valueOf(BLMChoice20_52));
        BLMChoice20_53 = pref.getBoolean("BLMChoice20_53", false);
        MChoice20_53.setChecked(Boolean.valueOf(BLMChoice20_53));
        BLMChoice20_54 = pref.getBoolean("BLMChoice20_54", false);
        MChoice20_54.setChecked(Boolean.valueOf(BLMChoice20_54));
        BLMChoice20_55 = pref.getBoolean("BLMChoice20_55", false);
        MChoice20_55.setChecked(Boolean.valueOf(BLMChoice20_55));
        BLMChoice20_56 = pref.getBoolean("BLMChoice20_56", false);
        MChoice20_56.setChecked(Boolean.valueOf(BLMChoice20_56));
        BLMChoice20_57 = pref.getBoolean("BLMChoice20_57", false);
        MChoice20_57.setChecked(Boolean.valueOf(BLMChoice20_57));
        BLMChoice20_58 = pref.getBoolean("BLMChoice20_58", false);
        MChoice20_58.setChecked(Boolean.valueOf(BLMChoice20_58));
        BLMChoice20_59 = pref.getBoolean("BLMChoice20_59", false);
        MChoice20_59.setChecked(Boolean.valueOf(BLMChoice20_59));
        BLMChoice20_60 = pref.getBoolean("BLMChoice20_60", false);
        MChoice20_60.setChecked(Boolean.valueOf(BLMChoice20_60));
        BLMChoice20_61 = pref.getBoolean("BLMChoice20_61", false);
        MChoice20_61.setChecked(Boolean.valueOf(BLMChoice20_61));
        BLMChoice20_62 = pref.getBoolean("BLMChoice20_62", false);
        MChoice20_62.setChecked(Boolean.valueOf(BLMChoice20_62));
        BLMChoice20_63 = pref.getBoolean("BLMChoice20_63", false);
        MChoice20_63.setChecked(Boolean.valueOf(BLMChoice20_63));
        BLMChoice20_64 = pref.getBoolean("BLMChoice20_64", false);
        MChoice20_64.setChecked(Boolean.valueOf(BLMChoice20_64));
        BLMChoice20_65 = pref.getBoolean("BLMChoice20_65", false);
        MChoice20_65.setChecked(Boolean.valueOf(BLMChoice20_65));


        Freenum20 = pref.getInt("Freenum20", Freenum20);


        BLMC21_1 = pref.getBoolean("BLMC21_1", false);
        MC21_1.setChecked(Boolean.valueOf(BLMC21_1));
        BLMC21_2 = pref.getBoolean("BLMC21_2", false);
        MC21_2.setChecked(Boolean.valueOf(BLMC21_2));
        BLMC21_3 = pref.getBoolean("BLMC21_3", false);
        MC21_3.setChecked(Boolean.valueOf(BLMC21_3));
        BLMC21_4 = pref.getBoolean("BLMC21_4", false);
        MC21_4.setChecked(Boolean.valueOf(BLMC21_4));
        BLMC21_5 = pref.getBoolean("BLMC21_5", false);
        MC21_5.setChecked(Boolean.valueOf(BLMC21_5));
        BLMC21_6 = pref.getBoolean("BLMC21_6", false);
        MC21_6.setChecked(Boolean.valueOf(BLMC21_6));
        BLMC21_7 = pref.getBoolean("BLMC21_7", false);
        MC21_7.setChecked(Boolean.valueOf(BLMC21_7));
        BLMC21_8 = pref.getBoolean("BLMC21_8", false);
        MC21_8.setChecked(Boolean.valueOf(BLMC21_8));
        BLMC21_9 = pref.getBoolean("BLMC21_9", false);
        MC21_9.setChecked(Boolean.valueOf(BLMC21_9));
        BLMC21_10 = pref.getBoolean("BLMC21_10", false);
        MC21_10.setChecked(Boolean.valueOf(BLMC21_10));
        BLMC21_11 = pref.getBoolean("BLMC21_11", false);
        MC21_11.setChecked(Boolean.valueOf(BLMC21_11));
        BLMC21_12 = pref.getBoolean("BLMC21_12", false);
        MC21_12.setChecked(Boolean.valueOf(BLMC21_12));

        BLME21_1 = pref.getBoolean("BLME21_1", false);
        ME21_1.setChecked(Boolean.valueOf(BLME21_1));
        BLME21_2 = pref.getBoolean("BLME21_2", false);
        ME21_2.setChecked(Boolean.valueOf(BLME21_2));
        BLME21_3 = pref.getBoolean("BLME21_3", false);
        ME21_3.setChecked(Boolean.valueOf(BLME21_3));
        BLME21_4 = pref.getBoolean("BLME21_4", false);
        ME21_4.setChecked(Boolean.valueOf(BLME21_4));
        BLME21_5 = pref.getBoolean("BLME21_5", false);
        ME21_5.setChecked(Boolean.valueOf(BLME21_5));
        BLME21_6 = pref.getBoolean("BLME21_6", false);
        ME21_6.setChecked(Boolean.valueOf(BLME21_6));
        BLME21_7 = pref.getBoolean("BLME21_7", false);
        ME21_7.setChecked(Boolean.valueOf(BLME21_7));
        BLME21_8 = pref.getBoolean("BLME21_8", false);
        ME21_8.setChecked(Boolean.valueOf(BLME21_8));
        BLME21_9 = pref.getBoolean("BLME21_9", false);
        ME21_9.setChecked(Boolean.valueOf(BLME21_9));
        BLME21_10 = pref.getBoolean("BLME21_10", false);
        ME21_10.setChecked(Boolean.valueOf(BLME21_10));
        BLME21_11 = pref.getBoolean("BLME21_11", false);
        ME21_11.setChecked(Boolean.valueOf(BLME21_11));
        BLME21_12 = pref.getBoolean("BLME21_12", false);
        ME21_12.setChecked(Boolean.valueOf(BLME21_12));
        BLME21_13 = pref.getBoolean("BLME21_13", false);
        ME21_13.setChecked(Boolean.valueOf(BLME21_13));
        BLME21_14 = pref.getBoolean("BLME21_14", false);
        ME21_14.setChecked(Boolean.valueOf(BLME21_14));
        BLME21_15 = pref.getBoolean("BLME21_15", false);
        ME21_15.setChecked(Boolean.valueOf(BLME21_15));
        BLME21_16 = pref.getBoolean("BLME21_16", false);
        ME21_16.setChecked(Boolean.valueOf(BLME21_16));
        BLME21_17 = pref.getBoolean("BLME21_17", false);
        ME21_17.setChecked(Boolean.valueOf(BLME21_17));
        BLME21_18 = pref.getBoolean("BLME21_18", false);
        ME21_18.setChecked(Boolean.valueOf(BLME21_18));
        BLME21_19 = pref.getBoolean("BLME21_19", false);
        ME21_19.setChecked(Boolean.valueOf(BLME21_19));
        BLME21_20 = pref.getBoolean("BLME21_20", false);
        ME21_20.setChecked(Boolean.valueOf(BLME21_20));
        BLME21_21 = pref.getBoolean("BLME21_21", false);
        ME21_21.setChecked(Boolean.valueOf(BLME21_21));
        BLME21_22 = pref.getBoolean("BLME21_22", false);
        ME21_22.setChecked(Boolean.valueOf(BLME21_22));
        BLME21_23 = pref.getBoolean("BLME21_23", false);
        ME21_23.setChecked(Boolean.valueOf(BLME21_23));
        BLME21_24 = pref.getBoolean("BLME21_24", false);
        ME21_24.setChecked(Boolean.valueOf(BLME21_24));
        BLME21_25 = pref.getBoolean("BLME21_25", false);
        ME21_25.setChecked(Boolean.valueOf(BLME21_25));
        BLME21_26 = pref.getBoolean("BLME21_26", false);
        ME21_26.setChecked(Boolean.valueOf(BLME21_26));
        BLME21_27 = pref.getBoolean("BLME21_27", false);
        ME21_27.setChecked(Boolean.valueOf(BLME21_27));
        BLME21_28 = pref.getBoolean("BLME21_28", false);
        ME21_28.setChecked(Boolean.valueOf(BLME21_28));
        BLME21_29 = pref.getBoolean("BLME21_29", false);
        ME21_29.setChecked(Boolean.valueOf(BLME21_29));
        BLME21_30 = pref.getBoolean("BLME21_30", false);
        ME21_30.setChecked(Boolean.valueOf(BLME21_30));

        BLMChoice21_1 = pref.getBoolean("BLMChoice21_1", false);
        MChoice21_1.setChecked(Boolean.valueOf(BLMChoice21_1));
        BLMChoice21_2 = pref.getBoolean("BLMChoice21_2", false);
        MChoice21_2.setChecked(Boolean.valueOf(BLMChoice21_2));
        BLMChoice21_3 = pref.getBoolean("BLMChoice21_3", false);
        MChoice21_3.setChecked(Boolean.valueOf(BLMChoice21_3));
        BLMChoice21_4 = pref.getBoolean("BLMChoice21_4", false);
        MChoice21_4.setChecked(Boolean.valueOf(BLMChoice21_4));
        BLMChoice21_5 = pref.getBoolean("BLMChoice21_5", false);
        MChoice21_5.setChecked(Boolean.valueOf(BLMChoice21_5));
        BLMChoice21_6 = pref.getBoolean("BLMChoice21_6", false);
        MChoice21_6.setChecked(Boolean.valueOf(BLMChoice21_6));
        BLMChoice21_7 = pref.getBoolean("BLMChoice21_7", false);
        MChoice21_7.setChecked(Boolean.valueOf(BLMChoice21_7));
        BLMChoice21_8 = pref.getBoolean("BLMChoice21_8", false);
        MChoice21_8.setChecked(Boolean.valueOf(BLMChoice21_8));
        BLMChoice21_9 = pref.getBoolean("BLMChoice21_9", false);
        MChoice21_9.setChecked(Boolean.valueOf(BLMChoice21_9));
        BLMChoice21_10 = pref.getBoolean("BLMChoice21_10", false);
        MChoice21_10.setChecked(Boolean.valueOf(BLMChoice21_10));
        BLMChoice21_11 = pref.getBoolean("BLMChoice21_11", false);
        MChoice21_11.setChecked(Boolean.valueOf(BLMChoice21_11));
        BLMChoice21_12 = pref.getBoolean("BLMChoice21_12", false);
        MChoice21_12.setChecked(Boolean.valueOf(BLMChoice21_12));
        BLMChoice21_13 = pref.getBoolean("BLMChoice21_13", false);
        MChoice21_13.setChecked(Boolean.valueOf(BLMChoice21_13));
        BLMChoice21_14 = pref.getBoolean("BLMChoice21_14", false);
        MChoice21_14.setChecked(Boolean.valueOf(BLMChoice21_14));
        BLMChoice21_15 = pref.getBoolean("BLMChoice21_15", false);
        MChoice21_15.setChecked(Boolean.valueOf(BLMChoice21_15));
        BLMChoice21_16 = pref.getBoolean("BLMChoice21_16", false);
        MChoice21_16.setChecked(Boolean.valueOf(BLMChoice21_16));
        BLMChoice21_17 = pref.getBoolean("BLMChoice21_17", false);
        MChoice21_17.setChecked(Boolean.valueOf(BLMChoice21_17));
        BLMChoice21_18 = pref.getBoolean("BLMChoice21_18", false);
        MChoice21_18.setChecked(Boolean.valueOf(BLMChoice21_18));
        BLMChoice21_19 = pref.getBoolean("BLMChoice21_19", false);
        MChoice21_19.setChecked(Boolean.valueOf(BLMChoice21_19));
        BLMChoice21_20 = pref.getBoolean("BLMChoice21_20", false);
        MChoice21_20.setChecked(Boolean.valueOf(BLMChoice21_20));
        BLMChoice21_21 = pref.getBoolean("BLMChoice21_21", false);
        MChoice21_21.setChecked(Boolean.valueOf(BLMChoice21_21));
        BLMChoice21_22 = pref.getBoolean("BLMChoice21_22", false);
        MChoice21_22.setChecked(Boolean.valueOf(BLMChoice21_22));
        BLMChoice21_23 = pref.getBoolean("BLMChoice21_23", false);
        MChoice21_23.setChecked(Boolean.valueOf(BLMChoice21_23));
        BLMChoice21_24 = pref.getBoolean("BLMChoice21_24", false);
        MChoice21_24.setChecked(Boolean.valueOf(BLMChoice21_24));
        BLMChoice21_25 = pref.getBoolean("BLMChoice21_25", false);
        MChoice21_25.setChecked(Boolean.valueOf(BLMChoice21_25));
        BLMChoice21_26 = pref.getBoolean("BLMChoice21_26", false);
        MChoice21_26.setChecked(Boolean.valueOf(BLMChoice21_26));
        BLMChoice21_27 = pref.getBoolean("BLMChoice21_27", false);
        MChoice21_27.setChecked(Boolean.valueOf(BLMChoice21_27));
        BLMChoice21_28 = pref.getBoolean("BLMChoice21_28", false);
        MChoice21_28.setChecked(Boolean.valueOf(BLMChoice21_28));
        BLMChoice21_29 = pref.getBoolean("BLMChoice21_29", false);
        MChoice21_29.setChecked(Boolean.valueOf(BLMChoice21_29));
        BLMChoice21_30 = pref.getBoolean("BLMChoice21_30", false);
        MChoice21_30.setChecked(Boolean.valueOf(BLMChoice21_30));
        BLMChoice21_31 = pref.getBoolean("BLMChoice21_31", false);
        MChoice21_31.setChecked(Boolean.valueOf(BLMChoice21_31));
        BLMChoice21_32 = pref.getBoolean("BLMChoice21_32", false);
        MChoice21_32.setChecked(Boolean.valueOf(BLMChoice21_32));
        BLMChoice21_33 = pref.getBoolean("BLMChoice21_33", false);
        MChoice21_33.setChecked(Boolean.valueOf(BLMChoice21_33));
        BLMChoice21_34 = pref.getBoolean("BLMChoice21_34", false);
        MChoice21_34.setChecked(Boolean.valueOf(BLMChoice21_34));
        BLMChoice21_35 = pref.getBoolean("BLMChoice21_35", false);
        MChoice21_35.setChecked(Boolean.valueOf(BLMChoice21_35));
        BLMChoice21_36 = pref.getBoolean("BLMChoice21_36", false);
        MChoice21_36.setChecked(Boolean.valueOf(BLMChoice21_36));
        BLMChoice21_37 = pref.getBoolean("BLMChoice21_37", false);
        MChoice21_37.setChecked(Boolean.valueOf(BLMChoice21_37));
        BLMChoice21_38 = pref.getBoolean("BLMChoice21_38", false);
        MChoice21_38.setChecked(Boolean.valueOf(BLMChoice21_38));
        BLMChoice21_39 = pref.getBoolean("BLMChoice21_39", false);
        MChoice21_39.setChecked(Boolean.valueOf(BLMChoice21_39));
        BLMChoice21_40 = pref.getBoolean("BLMChoice21_40", false);
        MChoice21_40.setChecked(Boolean.valueOf(BLMChoice21_40));
        BLMChoice21_41 = pref.getBoolean("BLMChoice21_41", false);
        MChoice21_41.setChecked(Boolean.valueOf(BLMChoice21_41));
        BLMChoice21_42 = pref.getBoolean("BLMChoice21_42", false);
        MChoice21_42.setChecked(Boolean.valueOf(BLMChoice21_42));
        BLMChoice21_43 = pref.getBoolean("BLMChoice21_43", false);
        MChoice21_43.setChecked(Boolean.valueOf(BLMChoice21_43));
        BLMChoice21_44 = pref.getBoolean("BLMChoice21_44", false);
        MChoice21_44.setChecked(Boolean.valueOf(BLMChoice21_44));
        BLMChoice21_45 = pref.getBoolean("BLMChoice21_45", false);
        MChoice21_45.setChecked(Boolean.valueOf(BLMChoice21_45));
        BLMChoice21_46 = pref.getBoolean("BLMChoice21_46", false);
        MChoice21_46.setChecked(Boolean.valueOf(BLMChoice21_46));
        BLMChoice21_47 = pref.getBoolean("BLMChoice21_47", false);
        MChoice21_47.setChecked(Boolean.valueOf(BLMChoice21_47));
        BLMChoice21_48 = pref.getBoolean("BLMChoice21_48", false);
        MChoice21_48.setChecked(Boolean.valueOf(BLMChoice21_48));
        BLMChoice21_49 = pref.getBoolean("BLMChoice21_49", false);
        MChoice21_49.setChecked(Boolean.valueOf(BLMChoice21_49));
        BLMChoice21_50 = pref.getBoolean("BLMChoice21_50", false);
        MChoice21_50.setChecked(Boolean.valueOf(BLMChoice21_50));
        BLMChoice21_51 = pref.getBoolean("BLMChoice21_51", false);
        MChoice21_51.setChecked(Boolean.valueOf(BLMChoice21_51));
        BLMChoice21_52 = pref.getBoolean("BLMChoice21_52", false);
        MChoice21_52.setChecked(Boolean.valueOf(BLMChoice21_52));
        BLMChoice21_53 = pref.getBoolean("BLMChoice21_53", false);
        MChoice21_53.setChecked(Boolean.valueOf(BLMChoice21_53));
        BLMChoice21_54 = pref.getBoolean("BLMChoice21_54", false);
        MChoice21_54.setChecked(Boolean.valueOf(BLMChoice21_54));
        BLMChoice21_55 = pref.getBoolean("BLMChoice21_55", false);
        MChoice21_55.setChecked(Boolean.valueOf(BLMChoice21_55));
        BLMChoice21_56 = pref.getBoolean("BLMChoice21_56", false);
        MChoice21_56.setChecked(Boolean.valueOf(BLMChoice21_56));
        BLMChoice21_57 = pref.getBoolean("BLMChoice21_57", false);
        MChoice21_57.setChecked(Boolean.valueOf(BLMChoice21_57));
        BLMChoice21_58 = pref.getBoolean("BLMChoice21_58", false);
        MChoice21_58.setChecked(Boolean.valueOf(BLMChoice21_58));
        BLMChoice21_59 = pref.getBoolean("BLMChoice21_59", false);
        MChoice21_59.setChecked(Boolean.valueOf(BLMChoice21_59));
        BLMChoice21_60 = pref.getBoolean("BLMChoice21_60", false);
        MChoice21_60.setChecked(Boolean.valueOf(BLMChoice21_60));
        BLMChoice21_61 = pref.getBoolean("BLMChoice21_61", false);
        MChoice21_61.setChecked(Boolean.valueOf(BLMChoice21_61));
        BLMChoice21_62 = pref.getBoolean("BLMChoice21_62", false);
        MChoice21_62.setChecked(Boolean.valueOf(BLMChoice21_62));
        BLMChoice21_63 = pref.getBoolean("BLMChoice21_63", false);
        MChoice21_63.setChecked(Boolean.valueOf(BLMChoice21_63));
        BLMChoice21_64 = pref.getBoolean("BLMChoice21_64", false);
        MChoice21_64.setChecked(Boolean.valueOf(BLMChoice21_64));

        Freenum21 = pref.getInt("Freenum21", Freenum21);



//19학번 체크 이벤트 이벤트 시작======================================================================================================================================================================================================

//19학번 학부 공통 체크시 이벤트 시작(전필 카운트)=================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================


        save19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point19 = 19;

                MC19_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_1.isChecked() == true) {

                            editor.putBoolean("BLMC19_1", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_1.isChecked() == false) {
                            editor.putBoolean("BLMC19_1", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_2.isChecked() == true) {
                            editor.putBoolean("BLMC19_2", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_2.isChecked() == false) {
                            editor.putBoolean("BLMC19_2", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_3.isChecked() == true) {
                            editor.putBoolean("BLMC19_3", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_3.isChecked() == false) {
                            editor.putBoolean("BLMC19_3", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_4.isChecked() == true) {
                            editor.putBoolean("BLMC19_4", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_4.isChecked() == false) {
                            editor.putBoolean("BLMC19_4", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_5.isChecked() == true) {
                            editor.putBoolean("BLMC19_5", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_5.isChecked() == false) {
                            editor.putBoolean("BLMC19_5", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_6.isChecked() == true) {
                            editor.putBoolean("BLMC19_6", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_6.isChecked() == false) {
                            editor.putBoolean("BLMC19_6", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_7.isChecked() == true) {
                            editor.putBoolean("BLMC19_7", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_7.isChecked() == false) {
                            editor.putBoolean("BLMC19_7", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_8.isChecked() == true) {
                            editor.putBoolean("BLMC19_8", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_8.isChecked() == false) {
                            editor.putBoolean("BLMC19_8", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_9.isChecked() == true) {
                            editor.putBoolean("BLMC19_9", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_9.isChecked() == false) {
                            editor.putBoolean("BLMC19_9", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_10.isChecked() == true) {
                            editor.putBoolean("BLMC19_10", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_10.isChecked() == false) {
                            editor.putBoolean("BLMC19_10", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_11.isChecked() == true) {
                            editor.putBoolean("BLMC19_11", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_11.isChecked() == false) {
                            editor.putBoolean("BLMC19_11", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                MC19_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC19_12.isChecked() == true) {
                            editor.putBoolean("BLMC19_12", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (MC19_12.isChecked() == false) {
                            editor.putBoolean("BLMC19_12", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });
//19학번 학부 공통 이벤트 끝======================================================================================================================================================================================================

//19학년 전공 필수 체크시 이벤트 시작(전필 카운트)=========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
                ME19_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_1.isChecked() == true) {
                            editor.putBoolean("BLME19_1", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_1.isChecked() == false) {
                            editor.putBoolean("BLME19_1", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_2.isChecked() == true) {
                            editor.putBoolean("BLME19_2", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_2.isChecked() == false) {
                            editor.putBoolean("BLME19_2", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_3.isChecked() == true) {
                            editor.putBoolean("BLME19_3", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_3.isChecked() == false) {
                            editor.putBoolean("BLME19_3", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_4.isChecked() == true) {
                            editor.putBoolean("BLME19_4", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_4.isChecked() == false) {
                            editor.putBoolean("BLME19_4", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_5.isChecked() == true) {
                            editor.putBoolean("BLME19_5", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_5.isChecked() == false) {
                            editor.putBoolean("BLME19_5", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_6.isChecked() == true) {
                            editor.putBoolean("BLME19_6", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_6.isChecked() == false) {
                            editor.putBoolean("BLME19_6", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_7.isChecked() == true) {
                            editor.putBoolean("BLME19_7", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_7.isChecked() == false) {
                            editor.putBoolean("BLME19_7", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_8.isChecked() == true) {
                            editor.putBoolean("BLME19_8", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_8.isChecked() == false) {
                            editor.putBoolean("BLME19_8", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_9.isChecked() == true) {
                            editor.putBoolean("BLME19_9", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_9.isChecked() == false) {
                            editor.putBoolean("BLME19_9", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_10.isChecked() == true) {
                            editor.putBoolean("BLME19_10", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_10.isChecked() == false) {
                            editor.putBoolean("BLME19_10", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_11.isChecked() == true) {
                            editor.putBoolean("BLME19_11", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_11.isChecked() == false) {
                            editor.putBoolean("BLME19_11", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_12.isChecked() == true) {
                            editor.putBoolean("BLME19_12", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_12.isChecked() == false) {
                            editor.putBoolean("BLME19_12", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_13.isChecked() == true) {
                            editor.putBoolean("BLME19_13", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_13.isChecked() == false) {
                            editor.putBoolean("BLME19_13", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_14.isChecked() == true) {
                            editor.putBoolean("BLME19_14", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_14.isChecked() == false) {
                            editor.putBoolean("BLME19_14", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_15.isChecked() == true) {
                            editor.putBoolean("BLME19_15", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_15.isChecked() == false) {
                            editor.putBoolean("BLME19_15", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });


                ME19_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_16.isChecked() == true) {
                            editor.putBoolean("BLME19_16", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_16.isChecked() == false) {
                            editor.putBoolean("BLME19_16", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_17.isChecked() == true) {
                            editor.putBoolean("BLME19_17", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_17.isChecked() == false) {
                            editor.putBoolean("BLME19_17", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_18.isChecked() == true) {
                            editor.putBoolean("BLME19_18", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_18.isChecked() == false) {
                            editor.putBoolean("BLME19_18", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_19.isChecked() == true) {
                            editor.putBoolean("BLME19_19", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_19.isChecked() == false) {
                            editor.putBoolean("BLME19_19", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_20.isChecked() == true) {
                            editor.putBoolean("BLME19_20", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_20.isChecked() == false) {
                            editor.putBoolean("BLME19_20", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_21.isChecked() == true) {
                            editor.putBoolean("BLME19_21", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_21.isChecked() == false) {
                            editor.putBoolean("BLME19_21", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_22.isChecked() == true) {
                            editor.putBoolean("BLME19_22", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_22.isChecked() == false) {
                            editor.putBoolean("BLME19_22", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_23.isChecked() == true) {
                            editor.putBoolean("BLME19_23", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_23.isChecked() == false) {
                            editor.putBoolean("BLME19_23", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_24.isChecked() == true) {
                            editor.putBoolean("BLME19_24", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_24.isChecked() == false) {
                            editor.putBoolean("BLME19_24", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_25.isChecked() == true) {
                            editor.putBoolean("BLME19_25", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_25.isChecked() == false) {
                            editor.putBoolean("BLME19_25", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_26.isChecked() == true) {
                            editor.putBoolean("BLME19_26", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_26.isChecked() == false) {
                            editor.putBoolean("BLME19_26", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_27.isChecked() == true) {
                            editor.putBoolean("BLME19_27", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_27.isChecked() == false) {
                            editor.putBoolean("BLME19_27", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_28.isChecked() == true) {
                            editor.putBoolean("BLME19_28", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_28.isChecked() == false) {
                            editor.putBoolean("BLME19_28", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_29.isChecked() == true) {
                            editor.putBoolean("BLME19_29", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_29.isChecked() == false) {
                            editor.putBoolean("BLME19_29", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });

                ME19_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME19_30.isChecked() == true) {
                            editor.putBoolean("BLME19_30", b);
                            editor.apply();
                            MECount19 += 3;

                        }
                        if (ME19_30.isChecked() == false) {
                            editor.putBoolean("BLME19_30", b);
                            editor.apply();
                            MECount19 -= 3;

                        }
                    }
                });
//19학번 전공 필수 이벤트 끝======================================================================================================================================================================================================

//19 학년 전공 선택 체크시 이벤트 시작(전선 카운트)==================================================================================================================================================================================================================================================
                MChoice19_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_1.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_1", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_1.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_1", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_2.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_2", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_2.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_2", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_3.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_3", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_3.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_3", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_4.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_4", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_4.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_4", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_5.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_5", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_5.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_5", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_6.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_6", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_6.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_6", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_7.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_7", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_7.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_7", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_8.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_8", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_8.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_8", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_9.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_9", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_9.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_9", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_10.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_10", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_10.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_10", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_11.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_11", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_11.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_11", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_12.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_12", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_12.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_12", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_13.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_13", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_13.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_13", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_14.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_14", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_14.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_14", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_15.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_15", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_15.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_15", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_16.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_16", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_16.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_16", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_17.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_17", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_17.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_17", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_18.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_18", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_18.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_18", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_19.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_19", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_19.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_19", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_20.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_20", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_20.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_20", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_21.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_21", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_21.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_21", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_22.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_22", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_22.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_22", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_23.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_23", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_23.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_23", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_24.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_24", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_24.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_24", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_25.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_25", b);
                            editor.apply();
                            MChoiceCount19 += 12;

                        }
                        if (MChoice19_25.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_25", b);
                            editor.apply();
                            MChoiceCount19 -= 12;

                        }
                    }
                });

                MChoice19_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_26.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_26", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_26.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_26", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_27.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_27", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_27.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_27", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_28.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_28", b);
                            editor.apply();
                            MChoiceCount19 += 12;

                        }
                        if (MChoice19_28.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_28", b);
                            editor.apply();
                            MChoiceCount19 -= 12;

                        }
                    }
                });

                MChoice19_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_29.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_29", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_29.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_29", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_30.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_30", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_30.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_30", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_31.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_31", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_31.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_31", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_32.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_32", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_32.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_32", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_33.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_33", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_33.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_33", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_34.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_34", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_34.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_34", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_35.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_35", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_35.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_35", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_36.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_36", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_36.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_36", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_37.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_37", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_37.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_37", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_38.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_38", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_38.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_38", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_39.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_39", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_39.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_39", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_40.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_40", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_40.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_40", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_41.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_41", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_41.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_41", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_42.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_42", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_42.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_42", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_43.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_43", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_43.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_43", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_44.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_44", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_44.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_44", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_45.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_45", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_45.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_45", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_46.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_46", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_46.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_46", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_47.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_47", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_47.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_47", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_48.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_48.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_48", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_48.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_48", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_49.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_49.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_49", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_49.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_49", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_50.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_50", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_50.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_50", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_51.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_51", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_51.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_51", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_52.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_52", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_52.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_52", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_53.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_53", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_53.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_53", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_54.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_54", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_54.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_54", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_55.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_55", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_55.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_55", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_56.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_56", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_56.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_56", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_57.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_57", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_57.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_57", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_58.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_58", b);
                            editor.apply();
                            MChoiceCount19 += 3;

                        }
                        if (MChoice19_58.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_58", b);
                            editor.apply();
                            MChoiceCount19 -= 3;

                        }
                    }
                });

                MChoice19_59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_59.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_59", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_59.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_59", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_60.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_60", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_60.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_60", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_61.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_61.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_61", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_61.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_61", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_62.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_62", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_62.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_62", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_63.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_63.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_63", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_63.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_63", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_64.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_64.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_64", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_64.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_64", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_65.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_65.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_65", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_65.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_65", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

                MChoice19_66.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice19_66.isChecked() == true) {
                            editor.putBoolean("BLMChoice19_66", b);
                            editor.apply();
                            MChoiceCount19 += 1;

                        }
                        if (MChoice19_66.isChecked() == false) {
                            editor.putBoolean("BLMChoice19_66", b);
                            editor.apply();
                            MChoiceCount19 -= 1;

                        }
                    }
                });

            }
        });
        reset19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MC19_1.setChecked(false);
                MC19_2.setChecked(false);
                MC19_3.setChecked(false);
                MC19_4.setChecked(false);
                MC19_5.setChecked(false);
                MC19_6.setChecked(false);
                MC19_7.setChecked(false);
                MC19_8.setChecked(false);
                MC19_9.setChecked(false);
                MC19_10.setChecked(false);
                MC19_11.setChecked(false);
                MC19_12.setChecked(false);

                ME19_1.setChecked(false);
                ME19_2.setChecked(false);
                ME19_3.setChecked(false);
                ME19_4.setChecked(false);
                ME19_5.setChecked(false);
                ME19_6.setChecked(false);
                ME19_7.setChecked(false);
                ME19_8.setChecked(false);
                ME19_9.setChecked(false);
                ME19_10.setChecked(false);
                ME19_11.setChecked(false);
                ME19_12.setChecked(false);
                ME19_13.setChecked(false);
                ME19_14.setChecked(false);
                ME19_15.setChecked(false);
                ME19_16.setChecked(false);
                ME19_17.setChecked(false);
                ME19_18.setChecked(false);
                ME19_19.setChecked(false);
                ME19_20.setChecked(false);
                ME19_21.setChecked(false);
                ME19_22.setChecked(false);
                ME19_23.setChecked(false);
                ME19_24.setChecked(false);
                ME19_25.setChecked(false);
                ME19_26.setChecked(false);
                ME19_27.setChecked(false);
                ME19_28.setChecked(false);
                ME19_29.setChecked(false);
                ME19_30.setChecked(false);

                MChoice19_1.setChecked(false);
                MChoice19_2.setChecked(false);
                MChoice19_3.setChecked(false);
                MChoice19_4.setChecked(false);
                MChoice19_5.setChecked(false);
                MChoice19_6.setChecked(false);
                MChoice19_7.setChecked(false);
                MChoice19_8.setChecked(false);
                MChoice19_9.setChecked(false);
                MChoice19_10.setChecked(false);
                MChoice19_11.setChecked(false);
                MChoice19_12.setChecked(false);
                MChoice19_13.setChecked(false);
                MChoice19_14.setChecked(false);
                MChoice19_15.setChecked(false);
                MChoice19_16.setChecked(false);
                MChoice19_17.setChecked(false);
                MChoice19_18.setChecked(false);
                MChoice19_19.setChecked(false);
                MChoice19_20.setChecked(false);
                MChoice19_21.setChecked(false);
                MChoice19_22.setChecked(false);
                MChoice19_23.setChecked(false);
                MChoice19_24.setChecked(false);
                MChoice19_25.setChecked(false);
                MChoice19_26.setChecked(false);
                MChoice19_27.setChecked(false);
                MChoice19_28.setChecked(false);
                MChoice19_29.setChecked(false);
                MChoice19_30.setChecked(false);
                MChoice19_31.setChecked(false);
                MChoice19_32.setChecked(false);
                MChoice19_33.setChecked(false);
                MChoice19_34.setChecked(false);
                MChoice19_35.setChecked(false);
                MChoice19_36.setChecked(false);
                MChoice19_37.setChecked(false);
                MChoice19_38.setChecked(false);
                MChoice19_39.setChecked(false);
                MChoice19_40.setChecked(false);
                MChoice19_41.setChecked(false);
                MChoice19_42.setChecked(false);
                MChoice19_43.setChecked(false);
                MChoice19_44.setChecked(false);
                MChoice19_45.setChecked(false);
                MChoice19_46.setChecked(false);
                MChoice19_47.setChecked(false);
                MChoice19_48.setChecked(false);
                MChoice19_49.setChecked(false);
                MChoice19_50.setChecked(false);
                MChoice19_51.setChecked(false);
                MChoice19_52.setChecked(false);
                MChoice19_53.setChecked(false);
                MChoice19_54.setChecked(false);
                MChoice19_55.setChecked(false);
                MChoice19_56.setChecked(false);
                MChoice19_57.setChecked(false);
                MChoice19_58.setChecked(false);
                MChoice19_59.setChecked(false);
                MChoice19_60.setChecked(false);
                MChoice19_61.setChecked(false);
                MChoice19_62.setChecked(false);
                MChoice19_63.setChecked(false);
                MChoice19_64.setChecked(false);
                MChoice19_65.setChecked(false);
                MChoice19_66.setChecked(false);




                MECount19 = 0;
                MChoiceCount19 = 0;
                reset = 19;

                editor.putBoolean("BLMC19_1", false);
                editor.putBoolean("BLMC19_2", false);
                editor.putBoolean("BLMC19_3", false);
                editor.putBoolean("BLMC19_4", false);
                editor.putBoolean("BLMC19_5", false);
                editor.putBoolean("BLMC19_6", false);
                editor.putBoolean("BLMC19_7", false);
                editor.putBoolean("BLMC19_8", false);
                editor.putBoolean("BLMC19_9", false);
                editor.putBoolean("BLMC19_10", false);
                editor.putBoolean("BLMC19_11", false);
                editor.putBoolean("BLMC19_12", false);

                editor.putBoolean("BLME19_1", false);
                editor.putBoolean("BLME19_2", false);
                editor.putBoolean("BLME19_3", false);
                editor.putBoolean("BLME19_4", false);
                editor.putBoolean("BLME19_5", false);
                editor.putBoolean("BLME19_6", false);
                editor.putBoolean("BLME19_7", false);
                editor.putBoolean("BLME19_8", false);
                editor.putBoolean("BLME19_9", false);
                editor.putBoolean("BLME19_10", false);
                editor.putBoolean("BLME19_11", false);
                editor.putBoolean("BLME19_12", false);
                editor.putBoolean("BLME19_13", false);
                editor.putBoolean("BLME19_14", false);
                editor.putBoolean("BLME19_15", false);
                editor.putBoolean("BLME19_16", false);
                editor.putBoolean("BLME19_17", false);
                editor.putBoolean("BLME19_18", false);
                editor.putBoolean("BLME19_19", false);
                editor.putBoolean("BLME19_20", false);
                editor.putBoolean("BLME19_21", false);
                editor.putBoolean("BLME19_22", false);
                editor.putBoolean("BLME19_23", false);
                editor.putBoolean("BLME19_24", false);
                editor.putBoolean("BLME19_25", false);
                editor.putBoolean("BLME19_26", false);
                editor.putBoolean("BLME19_27", false);
                editor.putBoolean("BLME19_28", false);
                editor.putBoolean("BLME19_29", false);
                editor.putBoolean("BLME19_30 ", false);

                editor.putBoolean("BLMChoice19_1", false);
                editor.putBoolean("BLMChoice19_2", false);
                editor.putBoolean("BLMChoice19_3", false);
                editor.putBoolean("BLMChoice19_4", false);
                editor.putBoolean("BLMChoice19_5", false);
                editor.putBoolean("BLMChoice19_6", false);
                editor.putBoolean("BLMChoice19_7", false);
                editor.putBoolean("BLMChoice19_8", false);
                editor.putBoolean("BLMChoice19_9", false);
                editor.putBoolean("BLMChoice19_10", false);
                editor.putBoolean("BLMChoice19_11", false);
                editor.putBoolean("BLMChoice19_12", false);
                editor.putBoolean("BLMChoice19_13", false);
                editor.putBoolean("BLMChoice19_14", false);
                editor.putBoolean("BLMChoice19_15", false);
                editor.putBoolean("BLMChoice19_16", false);
                editor.putBoolean("BLMChoice19_17", false);
                editor.putBoolean("BLMChoice19_18", false);
                editor.putBoolean("BLMChoice19_19", false);
                editor.putBoolean("BLMChoice19_20", false);
                editor.putBoolean("BLMChoice19_21", false);
                editor.putBoolean("BLMChoice19_22", false);
                editor.putBoolean("BLMChoice19_23", false);
                editor.putBoolean("BLMChoice19_24", false);
                editor.putBoolean("BLMChoice19_25", false);
                editor.putBoolean("BLMChoice19_26", false);
                editor.putBoolean("BLMChoice19_27", false);
                editor.putBoolean("BLMChoice19_28", false);
                editor.putBoolean("BLMChoice19_29", false);
                editor.putBoolean("BLMChoice19_30", false);
                editor.putBoolean("BLMChoice19_31", false);
                editor.putBoolean("BLMChoice19_32", false);
                editor.putBoolean("BLMChoice19_33", false);
                editor.putBoolean("BLMChoice19_34", false);
                editor.putBoolean("BLMChoice19_35", false);
                editor.putBoolean("BLMChoice19_36", false);
                editor.putBoolean("BLMChoice19_37", false);
                editor.putBoolean("BLMChoice19_38", false);
                editor.putBoolean("BLMChoice19_39", false);
                editor.putBoolean("BLMChoice19_40", false);
                editor.putBoolean("BLMChoice19_41", false);
                editor.putBoolean("BLMChoice19_42", false);
                editor.putBoolean("BLMChoice19_43", false);
                editor.putBoolean("BLMChoice19_44", false);
                editor.putBoolean("BLMChoice19_45", false);
                editor.putBoolean("BLMChoice19_46", false);
                editor.putBoolean("BLMChoice19_47", false);
                editor.putBoolean("BLMChoice19_48", false);
                editor.putBoolean("BLMChoice19_49", false);
                editor.putBoolean("BLMChoice19_50", false);
                editor.putBoolean("BLMChoice19_51", false);
                editor.putBoolean("BLMChoice19_52", false);
                editor.putBoolean("BLMChoice19_53", false);
                editor.putBoolean("BLMChoice19_54", false);
                editor.putBoolean("BLMChoice19_55", false);
                editor.putBoolean("BLMChoice19_56", false);
                editor.putBoolean("BLMChoice19_57", false);
                editor.putBoolean("BLMChoice19_58", false);
                editor.putBoolean("BLMChoice19_59", false);
                editor.putBoolean("BLMChoice19_60", false);
                editor.putBoolean("BLMChoice19_61", false);
                editor.putBoolean("BLMChoice19_62", false);
                editor.putBoolean("BLMChoice19_63", false);
                editor.putBoolean("BLMChoice19_64", false);
                editor.putBoolean("BLMChoice19_65", false);
                editor.putBoolean("BLMChoice19_66", false);
                editor.apply();
            }
        });

//19학번 전공 선택 이벤트 끝======================================================================================================================================================================================================

//19학번 체크 이벤트 끝==================================================================================================================================================================================================================================================


//20학번 체크 이벤트 이벤트 시작======================================================================================================================================================================================================

//20학번 학부 공통 체크시 이벤트 시작(전필 카운트)=================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================


        save20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point20 = 20;

                MC20_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_1.isChecked() == true) {

                            editor.putBoolean("BLMC20_1", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_1.isChecked() == false) {
                            editor.putBoolean("BLMC20_1", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_2.isChecked() == true) {
                            editor.putBoolean("BLMC20_2", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_2.isChecked() == false) {
                            editor.putBoolean("BLMC20_2", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_3.isChecked() == true) {
                            editor.putBoolean("BLMC20_3", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_3.isChecked() == false) {
                            editor.putBoolean("BLMC20_3", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_4.isChecked() == true) {
                            editor.putBoolean("BLMC20_4", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_4.isChecked() == false) {
                            editor.putBoolean("BLMC20_4", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_5.isChecked() == true) {
                            editor.putBoolean("BLMC20_5", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_5.isChecked() == false) {
                            editor.putBoolean("BLMC20_5", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_6.isChecked() == true) {
                            editor.putBoolean("BLMC20_6", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_6.isChecked() == false) {
                            editor.putBoolean("BLMC20_6", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_7.isChecked() == true) {
                            editor.putBoolean("BLMC20_7", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_7.isChecked() == false) {
                            editor.putBoolean("BLMC20_7", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_8.isChecked() == true) {
                            editor.putBoolean("BLMC20_8", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_8.isChecked() == false) {
                            editor.putBoolean("BLMC20_8", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_9.isChecked() == true) {
                            editor.putBoolean("BLMC20_9", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_9.isChecked() == false) {
                            editor.putBoolean("BLMC20_9", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_10.isChecked() == true) {
                            editor.putBoolean("BLMC20_10", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_10.isChecked() == false) {
                            editor.putBoolean("BLMC20_10", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_11.isChecked() == true) {
                            editor.putBoolean("BLMC20_11", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_11.isChecked() == false) {
                            editor.putBoolean("BLMC20_11", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                MC20_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC20_12.isChecked() == true) {
                            editor.putBoolean("BLMC20_12", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (MC20_12.isChecked() == false) {
                            editor.putBoolean("BLMC20_12", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });
//20학번 학부 공통 이벤트 끝======================================================================================================================================================================================================

//20학년 전공 필수 체크시 이벤트 시작(전필 카운트)=========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
                ME20_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_1.isChecked() == true) {
                            editor.putBoolean("BLME20_1", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_1.isChecked() == false) {
                            editor.putBoolean("BLME20_1", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_2.isChecked() == true) {
                            editor.putBoolean("BLME20_2", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_2.isChecked() == false) {
                            editor.putBoolean("BLME20_2", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_3.isChecked() == true) {
                            editor.putBoolean("BLME20_3", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_3.isChecked() == false) {
                            editor.putBoolean("BLME20_3", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_4.isChecked() == true) {
                            editor.putBoolean("BLME20_4", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_4.isChecked() == false) {
                            editor.putBoolean("BLME20_4", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_5.isChecked() == true) {
                            editor.putBoolean("BLME20_5", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_5.isChecked() == false) {
                            editor.putBoolean("BLME20_5", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_6.isChecked() == true) {
                            editor.putBoolean("BLME20_6", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_6.isChecked() == false) {
                            editor.putBoolean("BLME20_6", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_7.isChecked() == true) {
                            editor.putBoolean("BLME20_7", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_7.isChecked() == false) {
                            editor.putBoolean("BLME20_7", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_8.isChecked() == true) {
                            editor.putBoolean("BLME20_8", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_8.isChecked() == false) {
                            editor.putBoolean("BLME20_8", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_9.isChecked() == true) {
                            editor.putBoolean("BLME20_9", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_9.isChecked() == false) {
                            editor.putBoolean("BLME20_9", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_10.isChecked() == true) {
                            editor.putBoolean("BLME20_10", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_10.isChecked() == false) {
                            editor.putBoolean("BLME20_10", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_11.isChecked() == true) {
                            editor.putBoolean("BLME20_11", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_11.isChecked() == false) {
                            editor.putBoolean("BLME20_11", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_12.isChecked() == true) {
                            editor.putBoolean("BLME20_12", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_12.isChecked() == false) {
                            editor.putBoolean("BLME20_12", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_13.isChecked() == true) {
                            editor.putBoolean("BLME20_13", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_13.isChecked() == false) {
                            editor.putBoolean("BLME20_13", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_14.isChecked() == true) {
                            editor.putBoolean("BLME20_14", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_14.isChecked() == false) {
                            editor.putBoolean("BLME20_14", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_15.isChecked() == true) {
                            editor.putBoolean("BLME20_15", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_15.isChecked() == false) {
                            editor.putBoolean("BLME20_15", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });


                ME20_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_16.isChecked() == true) {
                            editor.putBoolean("BLME20_16", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_16.isChecked() == false) {
                            editor.putBoolean("BLME20_16", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_17.isChecked() == true) {
                            editor.putBoolean("BLME20_17", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_17.isChecked() == false) {
                            editor.putBoolean("BLME20_17", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_18.isChecked() == true) {
                            editor.putBoolean("BLME20_18", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_18.isChecked() == false) {
                            editor.putBoolean("BLME20_18", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_19.isChecked() == true) {
                            editor.putBoolean("BLME20_19", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_19.isChecked() == false) {
                            editor.putBoolean("BLME20_19", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_20.isChecked() == true) {
                            editor.putBoolean("BLME20_20", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_20.isChecked() == false) {
                            editor.putBoolean("BLME20_20", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_21.isChecked() == true) {
                            editor.putBoolean("BLME20_21", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_21.isChecked() == false) {
                            editor.putBoolean("BLME20_21", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_22.isChecked() == true) {
                            editor.putBoolean("BLME20_22", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_22.isChecked() == false) {
                            editor.putBoolean("BLME20_22", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_23.isChecked() == true) {
                            editor.putBoolean("BLME20_23", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_23.isChecked() == false) {
                            editor.putBoolean("BLME20_23", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_24.isChecked() == true) {
                            editor.putBoolean("BLME20_24", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_24.isChecked() == false) {
                            editor.putBoolean("BLME20_24", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_25.isChecked() == true) {
                            editor.putBoolean("BLME20_25", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_25.isChecked() == false) {
                            editor.putBoolean("BLME20_25", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_26.isChecked() == true) {
                            editor.putBoolean("BLME20_26", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_26.isChecked() == false) {
                            editor.putBoolean("BLME20_26", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_27.isChecked() == true) {
                            editor.putBoolean("BLME20_27", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_27.isChecked() == false) {
                            editor.putBoolean("BLME20_27", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_28.isChecked() == true) {
                            editor.putBoolean("BLME20_28", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_28.isChecked() == false) {
                            editor.putBoolean("BLME20_28", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_29.isChecked() == true) {
                            editor.putBoolean("BLME20_29", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_29.isChecked() == false) {
                            editor.putBoolean("BLME20_29", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });

                ME20_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME20_30.isChecked() == true) {
                            editor.putBoolean("BLME20_30", b);
                            editor.apply();
                            MECount20 += 3;

                        }
                        if (ME20_30.isChecked() == false) {
                            editor.putBoolean("BLME20_30", b);
                            editor.apply();
                            MECount20 -= 3;

                        }
                    }
                });
//20학번 전공 필수 이벤트 끝======================================================================================================================================================================================================

//20 학년 전공 선택 체크시 이벤트 시작(전선 카운트)==================================================================================================================================================================================================================================================
                MChoice20_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_1.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_1", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_1.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_1", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_2.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_2", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_2.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_2", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_3.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_3", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_3.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_3", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_4.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_4", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_4.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_4", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_5.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_5", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_5.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_5", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_6.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_6", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_6.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_6", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_7.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_7", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_7.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_7", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_8.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_8", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_8.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_8", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_9.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_9", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_9.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_9", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_10.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_10", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_10.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_10", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_11.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_11", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_11.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_11", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_12.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_12", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_12.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_12", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_13.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_13", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_13.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_13", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_14.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_14", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_14.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_14", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_15.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_15", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_15.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_15", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_16.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_16", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_16.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_16", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_17.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_17", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_17.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_17", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_18.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_18", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_18.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_18", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_19.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_19", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_19.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_19", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_20.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_20", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_20.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_20", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_21.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_21", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_21.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_21", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_22.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_22", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_22.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_22", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_23.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_23", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_23.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_23", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_24.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_24", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_24.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_24", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_25.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_25", b);
                            editor.apply();
                            MChoiceCount20 += 12;

                        }
                        if (MChoice20_25.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_25", b);
                            editor.apply();
                            MChoiceCount20 -= 12;

                        }
                    }
                });

                MChoice20_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_26.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_26", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_26.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_26", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_27.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_27", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_27.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_27", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_28.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_28", b);
                            editor.apply();
                            MChoiceCount20 += 12;

                        }
                        if (MChoice20_28.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_28", b);
                            editor.apply();
                            MChoiceCount20 -= 12;

                        }
                    }
                });

                MChoice20_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_29.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_29", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_29.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_29", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_30.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_30", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_30.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_30", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_31.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_31", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_31.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_31", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_32.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_32", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_32.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_32", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_33.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_33", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_33.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_33", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_34.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_34", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_34.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_34", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_35.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_35", b);
                            editor.apply();
                            MChoiceCount20 += 1;

                        }
                        if (MChoice20_35.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_35", b);
                            editor.apply();
                            MChoiceCount20 -= 1;

                        }
                    }
                });

                MChoice20_36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_36.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_36", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_36.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_36", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_37.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_37", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_37.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_37", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_38.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_38", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_38.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_38", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_39.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_39", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_39.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_39", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_40.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_40", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_40.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_40", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_41.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_41", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_41.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_41", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_42.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_42", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_42.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_42", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_43.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_43", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_43.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_43", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_44.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_44", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_44.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_44", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_45.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_45", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_45.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_45", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_46.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_46", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_46.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_46", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_47.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_47", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_47.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_47", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_48.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_48.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_48", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_48.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_48", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_49.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_49.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_49", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_49.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_49", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_50.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_50", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_50.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_50", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_51.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_51", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_51.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_51", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_52.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_52", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_52.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_52", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_53.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_53", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_53.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_53", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_54.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_54", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_54.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_54", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_55.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_55", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_55.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_55", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_56.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_56", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_56.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_56", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_57.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_57", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_57.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_57", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_58.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_58", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_58.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_58", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_59.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_59", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_59.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_59", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_60.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_60", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_60.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_60", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_61.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_61.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_61", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_61.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_61", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_62.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_62", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_62.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_62", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_63.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_63.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_63", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_63.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_63", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_64.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_64.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_64", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_64.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_64", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });

                MChoice20_65.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice20_65.isChecked() == true) {
                            editor.putBoolean("BLMChoice20_65", b);
                            editor.apply();
                            MChoiceCount20 += 3;

                        }
                        if (MChoice20_65.isChecked() == false) {
                            editor.putBoolean("BLMChoice20_65", b);
                            editor.apply();
                            MChoiceCount20 -= 3;

                        }
                    }
                });



            }
        });
        reset20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MC20_1.setChecked(false);
                MC20_2.setChecked(false);
                MC20_3.setChecked(false);
                MC20_4.setChecked(false);
                MC20_5.setChecked(false);
                MC20_6.setChecked(false);
                MC20_7.setChecked(false);
                MC20_8.setChecked(false);
                MC20_9.setChecked(false);
                MC20_10.setChecked(false);
                MC20_11.setChecked(false);
                MC20_12.setChecked(false);

                ME20_1.setChecked(false);
                ME20_2.setChecked(false);
                ME20_3.setChecked(false);
                ME20_4.setChecked(false);
                ME20_5.setChecked(false);
                ME20_6.setChecked(false);
                ME20_7.setChecked(false);
                ME20_8.setChecked(false);
                ME20_9.setChecked(false);
                ME20_10.setChecked(false);
                ME20_11.setChecked(false);
                ME20_12.setChecked(false);
                ME20_13.setChecked(false);
                ME20_14.setChecked(false);
                ME20_15.setChecked(false);
                ME20_16.setChecked(false);
                ME20_17.setChecked(false);
                ME20_18.setChecked(false);
                ME20_19.setChecked(false);
                ME20_20.setChecked(false);
                ME20_21.setChecked(false);
                ME20_22.setChecked(false);
                ME20_23.setChecked(false);
                ME20_24.setChecked(false);
                ME20_25.setChecked(false);
                ME20_26.setChecked(false);
                ME20_27.setChecked(false);
                ME20_28.setChecked(false);
                ME20_29.setChecked(false);
                ME20_30.setChecked(false);

                MChoice20_1.setChecked(false);
                MChoice20_2.setChecked(false);
                MChoice20_3.setChecked(false);
                MChoice20_4.setChecked(false);
                MChoice20_5.setChecked(false);
                MChoice20_6.setChecked(false);
                MChoice20_7.setChecked(false);
                MChoice20_8.setChecked(false);
                MChoice20_9.setChecked(false);
                MChoice20_10.setChecked(false);
                MChoice20_11.setChecked(false);
                MChoice20_12.setChecked(false);
                MChoice20_13.setChecked(false);
                MChoice20_14.setChecked(false);
                MChoice20_15.setChecked(false);
                MChoice20_16.setChecked(false);
                MChoice20_17.setChecked(false);
                MChoice20_18.setChecked(false);
                MChoice20_19.setChecked(false);
                MChoice20_20.setChecked(false);
                MChoice20_21.setChecked(false);
                MChoice20_22.setChecked(false);
                MChoice20_23.setChecked(false);
                MChoice20_24.setChecked(false);
                MChoice20_25.setChecked(false);
                MChoice20_26.setChecked(false);
                MChoice20_27.setChecked(false);
                MChoice20_28.setChecked(false);
                MChoice20_29.setChecked(false);
                MChoice20_30.setChecked(false);
                MChoice20_31.setChecked(false);
                MChoice20_32.setChecked(false);
                MChoice20_33.setChecked(false);
                MChoice20_34.setChecked(false);
                MChoice20_35.setChecked(false);
                MChoice20_36.setChecked(false);
                MChoice20_37.setChecked(false);
                MChoice20_38.setChecked(false);
                MChoice20_39.setChecked(false);
                MChoice20_40.setChecked(false);
                MChoice20_41.setChecked(false);
                MChoice20_42.setChecked(false);
                MChoice20_43.setChecked(false);
                MChoice20_44.setChecked(false);
                MChoice20_45.setChecked(false);
                MChoice20_46.setChecked(false);
                MChoice20_47.setChecked(false);
                MChoice20_48.setChecked(false);
                MChoice20_49.setChecked(false);
                MChoice20_50.setChecked(false);
                MChoice20_51.setChecked(false);
                MChoice20_52.setChecked(false);
                MChoice20_53.setChecked(false);
                MChoice20_54.setChecked(false);
                MChoice20_55.setChecked(false);
                MChoice20_56.setChecked(false);
                MChoice20_57.setChecked(false);
                MChoice20_58.setChecked(false);
                MChoice20_59.setChecked(false);
                MChoice20_60.setChecked(false);
                MChoice20_61.setChecked(false);
                MChoice20_62.setChecked(false);
                MChoice20_63.setChecked(false);
                MChoice20_64.setChecked(false);
                MChoice20_65.setChecked(false);

                MECount20 = 0;
                MChoiceCount20 = 0;
                reset = 20;

                editor.putBoolean("BLMC20_1", false);
                editor.putBoolean("BLMC20_2", false);
                editor.putBoolean("BLMC20_3", false);
                editor.putBoolean("BLMC20_4", false);
                editor.putBoolean("BLMC20_5", false);
                editor.putBoolean("BLMC20_6", false);
                editor.putBoolean("BLMC20_7", false);
                editor.putBoolean("BLMC20_8", false);
                editor.putBoolean("BLMC20_9", false);
                editor.putBoolean("BLMC20_10", false);
                editor.putBoolean("BLMC20_11", false);
                editor.putBoolean("BLMC20_12", false);

                editor.putBoolean("BLME20_1", false);
                editor.putBoolean("BLME20_2", false);
                editor.putBoolean("BLME20_3", false);
                editor.putBoolean("BLME20_4", false);
                editor.putBoolean("BLME20_5", false);
                editor.putBoolean("BLME20_6", false);
                editor.putBoolean("BLME20_7", false);
                editor.putBoolean("BLME20_8", false);
                editor.putBoolean("BLME20_9", false);
                editor.putBoolean("BLME20_10", false);
                editor.putBoolean("BLME20_11", false);
                editor.putBoolean("BLME20_12", false);
                editor.putBoolean("BLME20_13", false);
                editor.putBoolean("BLME20_14", false);
                editor.putBoolean("BLME20_15", false);
                editor.putBoolean("BLME20_16", false);
                editor.putBoolean("BLME20_17", false);
                editor.putBoolean("BLME20_18", false);
                editor.putBoolean("BLME20_19", false);
                editor.putBoolean("BLME20_20", false);
                editor.putBoolean("BLME20_21", false);
                editor.putBoolean("BLME20_22", false);
                editor.putBoolean("BLME20_23", false);
                editor.putBoolean("BLME20_24", false);
                editor.putBoolean("BLME20_25", false);
                editor.putBoolean("BLME20_26", false);
                editor.putBoolean("BLME20_27", false);
                editor.putBoolean("BLME20_28", false);
                editor.putBoolean("BLME20_29", false);
                editor.putBoolean("BLME20_30 ", false);

                editor.putBoolean("BLMChoice20_1", false);
                editor.putBoolean("BLMChoice20_2", false);
                editor.putBoolean("BLMChoice20_3", false);
                editor.putBoolean("BLMChoice20_4", false);
                editor.putBoolean("BLMChoice20_5", false);
                editor.putBoolean("BLMChoice20_6", false);
                editor.putBoolean("BLMChoice20_7", false);
                editor.putBoolean("BLMChoice20_8", false);
                editor.putBoolean("BLMChoice20_9", false);
                editor.putBoolean("BLMChoice20_10", false);
                editor.putBoolean("BLMChoice20_11", false);
                editor.putBoolean("BLMChoice20_12", false);
                editor.putBoolean("BLMChoice20_13", false);
                editor.putBoolean("BLMChoice20_14", false);
                editor.putBoolean("BLMChoice20_15", false);
                editor.putBoolean("BLMChoice20_16", false);
                editor.putBoolean("BLMChoice20_17", false);
                editor.putBoolean("BLMChoice20_18", false);
                editor.putBoolean("BLMChoice20_19", false);
                editor.putBoolean("BLMChoice20_20", false);
                editor.putBoolean("BLMChoice20_21", false);
                editor.putBoolean("BLMChoice20_22", false);
                editor.putBoolean("BLMChoice20_23", false);
                editor.putBoolean("BLMChoice20_24", false);
                editor.putBoolean("BLMChoice20_25", false);
                editor.putBoolean("BLMChoice20_26", false);
                editor.putBoolean("BLMChoice20_27", false);
                editor.putBoolean("BLMChoice20_28", false);
                editor.putBoolean("BLMChoice20_29", false);
                editor.putBoolean("BLMChoice20_30", false);
                editor.putBoolean("BLMChoice20_31", false);
                editor.putBoolean("BLMChoice20_32", false);
                editor.putBoolean("BLMChoice20_33", false);
                editor.putBoolean("BLMChoice20_34", false);
                editor.putBoolean("BLMChoice20_35", false);
                editor.putBoolean("BLMChoice20_36", false);
                editor.putBoolean("BLMChoice20_37", false);
                editor.putBoolean("BLMChoice20_38", false);
                editor.putBoolean("BLMChoice20_39", false);
                editor.putBoolean("BLMChoice20_40", false);
                editor.putBoolean("BLMChoice20_41", false);
                editor.putBoolean("BLMChoice20_42", false);
                editor.putBoolean("BLMChoice20_43", false);
                editor.putBoolean("BLMChoice20_44", false);
                editor.putBoolean("BLMChoice20_45", false);
                editor.putBoolean("BLMChoice20_46", false);
                editor.putBoolean("BLMChoice20_47", false);
                editor.putBoolean("BLMChoice20_48", false);
                editor.putBoolean("BLMChoice20_49", false);
                editor.putBoolean("BLMChoice20_50", false);
                editor.putBoolean("BLMChoice20_51", false);
                editor.putBoolean("BLMChoice20_52", false);
                editor.putBoolean("BLMChoice20_53", false);
                editor.putBoolean("BLMChoice20_54", false);
                editor.putBoolean("BLMChoice20_55", false);
                editor.putBoolean("BLMChoice20_56", false);
                editor.putBoolean("BLMChoice20_57", false);
                editor.putBoolean("BLMChoice20_58", false);
                editor.putBoolean("BLMChoice20_59", false);
                editor.putBoolean("BLMChoice20_60", false);
                editor.putBoolean("BLMChoice20_61", false);
                editor.putBoolean("BLMChoice20_62", false);
                editor.putBoolean("BLMChoice20_63", false);
                editor.putBoolean("BLMChoice20_64", false);
                editor.putBoolean("BLMChoice20_65", false);
                editor.apply();
            }
        });

//20학번 전공 선택 이벤트 끝======================================================================================================================================================================================================

//20학번 체크 이벤트 끝==================================================================================================================================================================================================================================================

// 21학번 체크 이벤트 이벤트 시작======================================================================================================================================================================================================

//21학번 학부 공통 체크시 이벤트 시작(전필 카운트)=================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================


        save21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point21 = 21;

                MC21_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_1.isChecked() == true) {

                            editor.putBoolean("BLMC21_1", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_1.isChecked() == false) {
                            editor.putBoolean("BLMC21_1", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_2.isChecked() == true) {
                            editor.putBoolean("BLMC21_2", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_2.isChecked() == false) {
                            editor.putBoolean("BLMC21_2", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_3.isChecked() == true) {
                            editor.putBoolean("BLMC21_3", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_3.isChecked() == false) {
                            editor.putBoolean("BLMC21_3", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_4.isChecked() == true) {
                            editor.putBoolean("BLMC21_4", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_4.isChecked() == false) {
                            editor.putBoolean("BLMC21_4", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_5.isChecked() == true) {
                            editor.putBoolean("BLMC21_5", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_5.isChecked() == false) {
                            editor.putBoolean("BLMC21_5", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_6.isChecked() == true) {
                            editor.putBoolean("BLMC21_6", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_6.isChecked() == false) {
                            editor.putBoolean("BLMC21_6", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_7.isChecked() == true) {
                            editor.putBoolean("BLMC21_7", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_7.isChecked() == false) {
                            editor.putBoolean("BLMC21_7", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_8.isChecked() == true) {
                            editor.putBoolean("BLMC21_8", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_8.isChecked() == false) {
                            editor.putBoolean("BLMC21_8", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_9.isChecked() == true) {
                            editor.putBoolean("BLMC21_9", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_9.isChecked() == false) {
                            editor.putBoolean("BLMC21_9", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_10.isChecked() == true) {
                            editor.putBoolean("BLMC21_10", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_10.isChecked() == false) {
                            editor.putBoolean("BLMC21_10", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_11.isChecked() == true) {
                            editor.putBoolean("BLMC21_11", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_11.isChecked() == false) {
                            editor.putBoolean("BLMC21_11", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                MC21_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MC21_12.isChecked() == true) {
                            editor.putBoolean("BLMC21_12", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (MC21_12.isChecked() == false) {
                            editor.putBoolean("BLMC21_12", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });
//21학번 학부 공통 이벤트 끝======================================================================================================================================================================================================

//21학년 전공 필수 체크시 이벤트 시작(전필 카운트)=========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
                ME21_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_1.isChecked() == true) {
                            editor.putBoolean("BLME21_1", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_1.isChecked() == false) {
                            editor.putBoolean("BLME21_1", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_2.isChecked() == true) {
                            editor.putBoolean("BLME21_2", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_2.isChecked() == false) {
                            editor.putBoolean("BLME21_2", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_3.isChecked() == true) {
                            editor.putBoolean("BLME21_3", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_3.isChecked() == false) {
                            editor.putBoolean("BLME21_3", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_4.isChecked() == true) {
                            editor.putBoolean("BLME21_4", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_4.isChecked() == false) {
                            editor.putBoolean("BLME21_4", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_5.isChecked() == true) {
                            editor.putBoolean("BLME21_5", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_5.isChecked() == false) {
                            editor.putBoolean("BLME21_5", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_6.isChecked() == true) {
                            editor.putBoolean("BLME21_6", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_6.isChecked() == false) {
                            editor.putBoolean("BLME21_6", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_7.isChecked() == true) {
                            editor.putBoolean("BLME21_7", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_7.isChecked() == false) {
                            editor.putBoolean("BLME21_7", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_8.isChecked() == true) {
                            editor.putBoolean("BLME21_8", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_8.isChecked() == false) {
                            editor.putBoolean("BLME21_8", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_9.isChecked() == true) {
                            editor.putBoolean("BLME21_9", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_9.isChecked() == false) {
                            editor.putBoolean("BLME21_9", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_10.isChecked() == true) {
                            editor.putBoolean("BLME21_10", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_10.isChecked() == false) {
                            editor.putBoolean("BLME21_10", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_11.isChecked() == true) {
                            editor.putBoolean("BLME21_11", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_11.isChecked() == false) {
                            editor.putBoolean("BLME21_11", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_12.isChecked() == true) {
                            editor.putBoolean("BLME21_12", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_12.isChecked() == false) {
                            editor.putBoolean("BLME21_12", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_13.isChecked() == true) {
                            editor.putBoolean("BLME21_13", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_13.isChecked() == false) {
                            editor.putBoolean("BLME21_13", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_14.isChecked() == true) {
                            editor.putBoolean("BLME21_14", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_14.isChecked() == false) {
                            editor.putBoolean("BLME21_14", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_15.isChecked() == true) {
                            editor.putBoolean("BLME21_15", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_15.isChecked() == false) {
                            editor.putBoolean("BLME21_15", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });


                ME21_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_16.isChecked() == true) {
                            editor.putBoolean("BLME21_16", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_16.isChecked() == false) {
                            editor.putBoolean("BLME21_16", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_17.isChecked() == true) {
                            editor.putBoolean("BLME21_17", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_17.isChecked() == false) {
                            editor.putBoolean("BLME21_17", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_18.isChecked() == true) {
                            editor.putBoolean("BLME21_18", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_18.isChecked() == false) {
                            editor.putBoolean("BLME21_18", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_19.isChecked() == true) {
                            editor.putBoolean("BLME21_19", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_19.isChecked() == false) {
                            editor.putBoolean("BLME21_19", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_20.isChecked() == true) {
                            editor.putBoolean("BLME21_20", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_20.isChecked() == false) {
                            editor.putBoolean("BLME21_20", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_21.isChecked() == true) {
                            editor.putBoolean("BLME21_21", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_21.isChecked() == false) {
                            editor.putBoolean("BLME21_21", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_22.isChecked() == true) {
                            editor.putBoolean("BLME21_22", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_22.isChecked() == false) {
                            editor.putBoolean("BLME21_22", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_23.isChecked() == true) {
                            editor.putBoolean("BLME21_23", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_23.isChecked() == false) {
                            editor.putBoolean("BLME21_23", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_24.isChecked() == true) {
                            editor.putBoolean("BLME21_24", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_24.isChecked() == false) {
                            editor.putBoolean("BLME21_24", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_25.isChecked() == true) {
                            editor.putBoolean("BLME21_25", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_25.isChecked() == false) {
                            editor.putBoolean("BLME21_25", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_26.isChecked() == true) {
                            editor.putBoolean("BLME21_26", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_26.isChecked() == false) {
                            editor.putBoolean("BLME21_26", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_27.isChecked() == true) {
                            editor.putBoolean("BLME21_27", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_27.isChecked() == false) {
                            editor.putBoolean("BLME21_27", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_28.isChecked() == true) {
                            editor.putBoolean("BLME21_28", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_28.isChecked() == false) {
                            editor.putBoolean("BLME21_28", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_29.isChecked() == true) {
                            editor.putBoolean("BLME21_29", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_29.isChecked() == false) {
                            editor.putBoolean("BLME21_29", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });

                ME21_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (ME21_30.isChecked() == true) {
                            editor.putBoolean("BLME21_30", b);
                            editor.apply();
                            MECount21 += 3;

                        }
                        if (ME21_30.isChecked() == false) {
                            editor.putBoolean("BLME21_30", b);
                            editor.apply();
                            MECount21 -= 3;

                        }
                    }
                });
//21학번 전공 필수 이벤트 끝======================================================================================================================================================================================================

//21 학년 전공 선택 체크시 이벤트 시작(전선 카운트)==================================================================================================================================================================================================================================================
                MChoice21_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_1.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_1", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_1.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_1", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_2.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_2", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_2.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_2", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_3.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_3", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_3.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_3", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_4.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_4", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_4.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_4", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_5.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_5", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_5.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_5", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_6.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_6", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_6.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_6", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_7.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_7", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_7.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_7", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_8.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_8", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_8.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_8", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_9.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_9", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_9.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_9", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_10.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_10", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_10.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_10", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_11.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_11", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_11.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_11", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_12.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_12", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_12.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_12", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_13.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_13", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_13.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_13", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_14.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_14", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_14.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_14", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_15.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_15", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_15.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_15", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_16.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_16", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_16.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_16", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_17.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_17", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_17.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_17", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_18.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_18", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_18.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_18", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_19.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_19", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_19.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_19", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_20.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_20", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_20.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_20", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_21.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_21", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_21.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_21", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_22.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_22", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_22.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_22", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_23.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_23", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_23.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_23", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_24.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_24", b);
                            editor.apply();
                            MChoiceCount21 += 12;

                        }
                        if (MChoice21_24.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_24", b);
                            editor.apply();
                            MChoiceCount21 -= 12;

                        }
                    }
                });

                MChoice21_25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_25.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_25", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_25.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_25", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_26.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_26", b);
                            editor.apply();
                            MChoiceCount21 += 12;

                        }
                        if (MChoice21_26.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_26", b);
                            editor.apply();
                            MChoiceCount21 -= 12;

                        }
                    }
                });

                MChoice21_27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_27.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_27", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_27.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_27", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_28.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_28", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_28.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_28", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_29.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_29", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_29.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_29", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_30.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_30", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_30.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_30", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_31.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_31", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_31.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_31", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_32.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_32", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_32.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_32", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_33.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_33", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_33.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_33", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_34.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_34", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_34.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_34", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_35.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_35", b);
                            editor.apply();
                            MChoiceCount21 += 1;

                        }
                        if (MChoice21_35.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_35", b);
                            editor.apply();
                            MChoiceCount21 -= 1;

                        }
                    }
                });

                MChoice21_36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_36.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_36", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_36.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_36", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_37.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_37", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_37.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_37", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_38.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_38", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_38.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_38", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_39.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_39", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_39.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_39", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_40.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_40", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_40.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_40", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_41.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_41", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_41.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_41", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_42.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_42", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_42.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_42", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_43.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_43", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_43.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_43", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_44.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_44", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_44.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_44", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_45.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_45", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_45.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_45", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_46.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_46", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_46.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_46", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_47.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_47", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_47.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_47", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_48.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_48.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_48", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_48.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_48", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_49.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_49.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_49", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_49.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_49", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_50.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_50", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_50.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_50", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_51.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_51", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_51.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_51", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_52.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_52", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_52.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_52", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_53.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_53", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_53.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_53", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_54.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_54", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_54.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_54", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_55.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_55", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_55.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_55", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_56.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_56", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_56.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_56", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_57.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_57", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_57.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_57", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_58.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_58", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_58.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_58", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_59.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_59", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_59.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_59", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_60.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_60", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_60.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_60", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_61.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_61.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_61", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_61.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_61", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_62.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_62", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_62.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_62", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_63.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_63.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_63", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_63.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_63", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });

                MChoice21_64.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (MChoice21_64.isChecked() == true) {
                            editor.putBoolean("BLMChoice21_64", b);
                            editor.apply();
                            MChoiceCount21 += 3;

                        }
                        if (MChoice21_64.isChecked() == false) {
                            editor.putBoolean("BLMChoice21_64", b);
                            editor.apply();
                            MChoiceCount21 -= 3;

                        }
                    }
                });


            }
        });
        reset21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MC21_1.setChecked(false);
                MC21_2.setChecked(false);
                MC21_3.setChecked(false);
                MC21_4.setChecked(false);
                MC21_5.setChecked(false);
                MC21_6.setChecked(false);
                MC21_7.setChecked(false);
                MC21_8.setChecked(false);
                MC21_9.setChecked(false);
                MC21_10.setChecked(false);
                MC21_11.setChecked(false);
                MC21_12.setChecked(false);

                ME21_1.setChecked(false);
                ME21_2.setChecked(false);
                ME21_3.setChecked(false);
                ME21_4.setChecked(false);
                ME21_5.setChecked(false);
                ME21_6.setChecked(false);
                ME21_7.setChecked(false);
                ME21_8.setChecked(false);
                ME21_9.setChecked(false);
                ME21_10.setChecked(false);
                ME21_11.setChecked(false);
                ME21_12.setChecked(false);
                ME21_13.setChecked(false);
                ME21_14.setChecked(false);
                ME21_15.setChecked(false);
                ME21_16.setChecked(false);
                ME21_17.setChecked(false);
                ME21_18.setChecked(false);
                ME21_19.setChecked(false);
                ME21_20.setChecked(false);
                ME21_21.setChecked(false);
                ME21_22.setChecked(false);
                ME21_23.setChecked(false);
                ME21_24.setChecked(false);
                ME21_25.setChecked(false);
                ME21_26.setChecked(false);
                ME21_27.setChecked(false);
                ME21_28.setChecked(false);
                ME21_29.setChecked(false);
                ME21_30.setChecked(false);

                MChoice21_1.setChecked(false);
                MChoice21_2.setChecked(false);
                MChoice21_3.setChecked(false);
                MChoice21_4.setChecked(false);
                MChoice21_5.setChecked(false);
                MChoice21_6.setChecked(false);
                MChoice21_7.setChecked(false);
                MChoice21_8.setChecked(false);
                MChoice21_9.setChecked(false);
                MChoice21_10.setChecked(false);
                MChoice21_11.setChecked(false);
                MChoice21_12.setChecked(false);
                MChoice21_13.setChecked(false);
                MChoice21_14.setChecked(false);
                MChoice21_15.setChecked(false);
                MChoice21_16.setChecked(false);
                MChoice21_17.setChecked(false);
                MChoice21_18.setChecked(false);
                MChoice21_19.setChecked(false);
                MChoice21_20.setChecked(false);
                MChoice21_21.setChecked(false);
                MChoice21_22.setChecked(false);
                MChoice21_23.setChecked(false);
                MChoice21_24.setChecked(false);
                MChoice21_25.setChecked(false);
                MChoice21_26.setChecked(false);
                MChoice21_27.setChecked(false);
                MChoice21_28.setChecked(false);
                MChoice21_29.setChecked(false);
                MChoice21_30.setChecked(false);
                MChoice21_31.setChecked(false);
                MChoice21_32.setChecked(false);
                MChoice21_33.setChecked(false);
                MChoice21_34.setChecked(false);
                MChoice21_35.setChecked(false);
                MChoice21_36.setChecked(false);
                MChoice21_37.setChecked(false);
                MChoice21_38.setChecked(false);
                MChoice21_39.setChecked(false);
                MChoice21_40.setChecked(false);
                MChoice21_41.setChecked(false);
                MChoice21_42.setChecked(false);
                MChoice21_43.setChecked(false);
                MChoice21_44.setChecked(false);
                MChoice21_45.setChecked(false);
                MChoice21_46.setChecked(false);
                MChoice21_47.setChecked(false);
                MChoice21_48.setChecked(false);
                MChoice21_49.setChecked(false);
                MChoice21_50.setChecked(false);
                MChoice21_51.setChecked(false);
                MChoice21_52.setChecked(false);
                MChoice21_53.setChecked(false);
                MChoice21_54.setChecked(false);
                MChoice21_55.setChecked(false);
                MChoice21_56.setChecked(false);
                MChoice21_57.setChecked(false);
                MChoice21_58.setChecked(false);
                MChoice21_59.setChecked(false);
                MChoice21_60.setChecked(false);
                MChoice21_61.setChecked(false);
                MChoice21_62.setChecked(false);
                MChoice21_63.setChecked(false);
                MChoice21_64.setChecked(false);

                MECount21 = 0;
                MChoiceCount21 = 0;
                reset = 21;

                editor.putBoolean("BLMC21_1", false);
                editor.putBoolean("BLMC21_2", false);
                editor.putBoolean("BLMC21_3", false);
                editor.putBoolean("BLMC21_4", false);
                editor.putBoolean("BLMC21_5", false);
                editor.putBoolean("BLMC21_6", false);
                editor.putBoolean("BLMC21_7", false);
                editor.putBoolean("BLMC21_8", false);
                editor.putBoolean("BLMC21_9", false);
                editor.putBoolean("BLMC21_10", false);
                editor.putBoolean("BLMC21_11", false);
                editor.putBoolean("BLMC21_12", false);

                editor.putBoolean("BLME21_1", false);
                editor.putBoolean("BLME21_2", false);
                editor.putBoolean("BLME21_3", false);
                editor.putBoolean("BLME21_4", false);
                editor.putBoolean("BLME21_5", false);
                editor.putBoolean("BLME21_6", false);
                editor.putBoolean("BLME21_7", false);
                editor.putBoolean("BLME21_8", false);
                editor.putBoolean("BLME21_9", false);
                editor.putBoolean("BLME21_10", false);
                editor.putBoolean("BLME21_11", false);
                editor.putBoolean("BLME21_12", false);
                editor.putBoolean("BLME21_13", false);
                editor.putBoolean("BLME21_14", false);
                editor.putBoolean("BLME21_15", false);
                editor.putBoolean("BLME21_16", false);
                editor.putBoolean("BLME21_17", false);
                editor.putBoolean("BLME21_18", false);
                editor.putBoolean("BLME21_19", false);
                editor.putBoolean("BLME21_20", false);
                editor.putBoolean("BLME21_21", false);
                editor.putBoolean("BLME21_22", false);
                editor.putBoolean("BLME21_23", false);
                editor.putBoolean("BLME21_24", false);
                editor.putBoolean("BLME21_25", false);
                editor.putBoolean("BLME21_26", false);
                editor.putBoolean("BLME21_27", false);
                editor.putBoolean("BLME21_28", false);
                editor.putBoolean("BLME21_29", false);
                editor.putBoolean("BLME21_30 ", false);

                editor.putBoolean("BLMChoice21_1", false);
                editor.putBoolean("BLMChoice21_2", false);
                editor.putBoolean("BLMChoice21_3", false);
                editor.putBoolean("BLMChoice21_4", false);
                editor.putBoolean("BLMChoice21_5", false);
                editor.putBoolean("BLMChoice21_6", false);
                editor.putBoolean("BLMChoice21_7", false);
                editor.putBoolean("BLMChoice21_8", false);
                editor.putBoolean("BLMChoice21_9", false);
                editor.putBoolean("BLMChoice21_10", false);
                editor.putBoolean("BLMChoice21_11", false);
                editor.putBoolean("BLMChoice21_12", false);
                editor.putBoolean("BLMChoice21_13", false);
                editor.putBoolean("BLMChoice21_14", false);
                editor.putBoolean("BLMChoice21_15", false);
                editor.putBoolean("BLMChoice21_16", false);
                editor.putBoolean("BLMChoice21_17", false);
                editor.putBoolean("BLMChoice21_18", false);
                editor.putBoolean("BLMChoice21_19", false);
                editor.putBoolean("BLMChoice21_20", false);
                editor.putBoolean("BLMChoice21_21", false);
                editor.putBoolean("BLMChoice21_22", false);
                editor.putBoolean("BLMChoice21_23", false);
                editor.putBoolean("BLMChoice21_24", false);
                editor.putBoolean("BLMChoice21_25", false);
                editor.putBoolean("BLMChoice21_26", false);
                editor.putBoolean("BLMChoice21_27", false);
                editor.putBoolean("BLMChoice21_28", false);
                editor.putBoolean("BLMChoice21_29", false);
                editor.putBoolean("BLMChoice21_30", false);
                editor.putBoolean("BLMChoice21_31", false);
                editor.putBoolean("BLMChoice21_32", false);
                editor.putBoolean("BLMChoice21_33", false);
                editor.putBoolean("BLMChoice21_34", false);
                editor.putBoolean("BLMChoice21_35", false);
                editor.putBoolean("BLMChoice21_36", false);
                editor.putBoolean("BLMChoice21_37", false);
                editor.putBoolean("BLMChoice21_38", false);
                editor.putBoolean("BLMChoice21_39", false);
                editor.putBoolean("BLMChoice21_40", false);
                editor.putBoolean("BLMChoice21_41", false);
                editor.putBoolean("BLMChoice21_42", false);
                editor.putBoolean("BLMChoice21_43", false);
                editor.putBoolean("BLMChoice21_44", false);
                editor.putBoolean("BLMChoice21_45", false);
                editor.putBoolean("BLMChoice21_46", false);
                editor.putBoolean("BLMChoice21_47", false);
                editor.putBoolean("BLMChoice21_48", false);
                editor.putBoolean("BLMChoice21_49", false);
                editor.putBoolean("BLMChoice21_50", false);
                editor.putBoolean("BLMChoice21_51", false);
                editor.putBoolean("BLMChoice21_52", false);
                editor.putBoolean("BLMChoice21_53", false);
                editor.putBoolean("BLMChoice21_54", false);
                editor.putBoolean("BLMChoice21_55", false);
                editor.putBoolean("BLMChoice21_56", false);
                editor.putBoolean("BLMChoice21_57", false);
                editor.putBoolean("BLMChoice21_58", false);
                editor.putBoolean("BLMChoice21_59", false);
                editor.putBoolean("BLMChoice21_60", false);
                editor.putBoolean("BLMChoice21_61", false);
                editor.putBoolean("BLMChoice21_62", false);
                editor.putBoolean("BLMChoice21_63", false);
                editor.putBoolean("BLMChoice21_64", false);
                editor.apply();
            }
        });

//21학번 전공 선택 이벤트 끝======================================================================================================================================================================================================

//21학번 체크 이벤트 끝==================================================================================================================================================================================================================================================



        Intent inIntent = getIntent();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //19학번 데이터 보내기
                if(point19==19){

                    int MEgetnum19 = inIntent.getIntExtra("MEputPercent", 0) + MECount19;
                    int MEgetGauge19 = inIntent.getIntExtra("MEputGraph", 0) + MECount19;

                    int MChoicegetnum19 = inIntent.getIntExtra("MChoiceputPercent", 0) + MChoiceCount19;
                    int MChoicegetGauge19 = inIntent.getIntExtra("MChoiceputGraph", 0) + MChoiceCount19;




                    if (reset == 19) {
                        MEgetnum19 = 0;
                        MEgetGauge19 = 0;
                        MChoicegetnum19 = 0;
                        MChoicegetGauge19 = 0;
                    }

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    intent.putExtra("MEputNum", MEgetnum19);
                    intent.putExtra("MEputGauge", MEgetGauge19);


                    intent.putExtra("MChoiceputNum", MChoicegetnum19);
                    intent.putExtra("MChoiceputGauge", MChoicegetGauge19);

                    setResult(RESULT_OK, intent);
                    finish();
                }

                //20학번 데이터 보내기
                if(point20 == 20){

                    int MEgetnum20 = inIntent.getIntExtra("MEputPercent", 0) + MECount20;
                    int MEgetGauge20 = inIntent.getIntExtra("MEputGraph", 0) + MECount20;

                    int MChoicegetnum20 = inIntent.getIntExtra("MChoiceputPercent", 0) + MChoiceCount20;
                    int MChoicegetGauge20 = inIntent.getIntExtra("MChoiceputGraph", 0) + MChoiceCount20;


                    if (reset == 20) {
                        MEgetnum20 = 0;
                        MEgetGauge20 = 0;
                        MChoicegetnum20 = 0;
                        MChoicegetGauge20 = 0;
                    }



                    Intent intent20 = new Intent(getApplicationContext(), MainActivity.class);

                    intent20.putExtra("MEputNum", MEgetnum20);
                    intent20.putExtra("MEputGauge", MEgetGauge20);


                    intent20.putExtra("MChoiceputNum", MChoicegetnum20);
                    intent20.putExtra("MChoiceputGauge", MChoicegetGauge20);



                    setResult(RESULT_OK, intent20);
                    finish();
                }

                //21학번 데이터 보내기
                if(point21 == 21){

                    int MEgetnum21 = inIntent.getIntExtra("MEputPercent", 0) + MECount21;
                    int MEgetGauge21 = inIntent.getIntExtra("MEputGraph", 0) + MECount21;

                    int MChoicegetnum21 = inIntent.getIntExtra("MChoiceputPercent", 0) + MChoiceCount21;
                    int MChoicegetGauge21 = inIntent.getIntExtra("MChoiceputGraph", 0) + MChoiceCount21;




                    if (reset == 21) {
                        MEgetnum21 = 0;
                        MEgetGauge21 = 0;
                        MChoicegetnum21 = 0;
                        MChoicegetGauge21 = 0;

                    }


                    Intent intent21 = new Intent(getApplicationContext(), MainActivity.class);

                    intent21.putExtra("MEputNum", MEgetnum21);
                    intent21.putExtra("MEputGauge", MEgetGauge21);


                    intent21.putExtra("MChoiceputNum", MChoicegetnum21);
                    intent21.putExtra("MChoiceputGauge", MChoicegetGauge21);



                    setResult(RESULT_OK, intent21);
                    finish();
                }


            }
        });
    }

    //학년 메뉴
    public void majorMenu(View view) {
        PopupMenu MajorMenu = new PopupMenu(this, view);
        MajorMenu.setOnMenuItemClickListener(this);
        MajorMenu.inflate(R.menu.major_menu);
        MajorMenu.show();
    }

    //메뉴================================================================================================================================================================================
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu19_MC) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.VISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.VISIBLE);

            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);

            return true;
        } else if (itemId == R.id.menu19_ME) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.VISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.VISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);


            return true;
        } else if (itemId == R.id.menu19_MChoice) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.VISIBLE);
            SaveAndReset19.setVisibility(View.VISIBLE);
            scroll19_MChoice.setVisibility(View.VISIBLE);

            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);
            scroll20_MChoice.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);
            scroll21_MChoice.setVisibility(View.INVISIBLE);


            return true;
        } else if (itemId == R.id.menu20_MC) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.VISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.VISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);


            return true;
        } else if (itemId == R.id.menu20_ME) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.VISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.VISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);


            return true;
        } else if (itemId == R.id.menu20_MChoice) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);
            scroll19_MChoice.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.VISIBLE);
            SaveAndReset20.setVisibility(View.VISIBLE);
            scroll20_MChoice.setVisibility(View.VISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.INVISIBLE);
            scroll21_MChoice.setVisibility(View.INVISIBLE);


            return true;
        } else if (itemId == R.id.menu21_MC) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.VISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.VISIBLE);


            return true;
        } else if (itemId == R.id.menu21_ME) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.VISIBLE);
            schpage21_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset21.setVisibility(View.VISIBLE);


            return true;
        } else if (itemId == R.id.menu21_MChoice) {
            textExplain.setVisibility(View.INVISIBLE);
            schpage19_MC.setVisibility(View.INVISIBLE);
            schpage19_ME.setVisibility(View.INVISIBLE);
            schpage19_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset19.setVisibility(View.INVISIBLE);
            scroll19_MChoice.setVisibility(View.INVISIBLE);


            schpage20_MC.setVisibility(View.INVISIBLE);
            schpage20_ME.setVisibility(View.INVISIBLE);
            schpage20_MChoice.setVisibility(View.INVISIBLE);
            SaveAndReset20.setVisibility(View.INVISIBLE);
            scroll20_MChoice.setVisibility(View.INVISIBLE);

            schpage21_MC.setVisibility(View.INVISIBLE);
            schpage21_ME.setVisibility(View.INVISIBLE);
            schpage21_MChoice.setVisibility(View.VISIBLE);
            SaveAndReset21.setVisibility(View.VISIBLE);
            scroll21_MChoice.setVisibility(View.VISIBLE);


            return true;
        }
        return false;
    }


}