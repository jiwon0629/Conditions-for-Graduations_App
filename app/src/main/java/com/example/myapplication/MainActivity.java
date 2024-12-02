package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //상단 가로 메뉴바
    TextView major, refinement, free, poom, schnum, knu, na, IT, one365, vms, others;

    //원형 수치 퍼센트
    TextView ME_Percent, MChoice_Percent, Refinement_Percent, RefinementChoice_Percent, Free_Percent;

    //원형 프로그레스 바
    ProgressBar progress_bar_ME, progress_bar_MChoice, progress_bar_Refinement,
            progress_bar_RefinementChoice, progress_bar_Free;

    //원형 프로그레스 바 수치
    int MEGraph = 0, MChoiceGraph = 0, FreeGraph = 0, REGraph = 0, REChoiceGraph = 0;

    //종합정보시스템, 수강신청, IT인스타그램 아이콘
    Button IconSubscription, IconInformation, IconInstagram;
    //캘린더, 메모, 계산기, 그림판
    Button editBtn, calBtn, culBtn, drawBtn;

    //데이터 저장
    SharedPreferences pref;          // 프리퍼런스
    SharedPreferences.Editor editor; // 에디터

    int MENum = 0, MChoiceNum = 0, MFreeNum = 0, RFreeNum = 0, RENum = 0, REChoiceNum = 0, FreeResultNum = 0, FreeNum=0;

    int FreeHap=0;
    int MFreeputNum=0;
    int RCFreeputNum=0;

    //공지사항
    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //공지사항 리스트
        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다.", "IT1", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT2", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT3", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT4", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT5", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT6", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT7", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT8", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT9", "2023-05-05"));
        noticeList.add(new Notice("공지사항입니다.", "IT10", "2023-05-05"));

        //공지사항
        adapter = new NoticeListAdapter(getApplicationContext(), noticeList);
        noticeListView.setAdapter(adapter);

        //변수
        major = (TextView) findViewById(R.id.major);
        refinement = (TextView) findViewById(R.id.refinement);
        free = (TextView) findViewById(R.id.free);
        poom = (TextView) findViewById(R.id.poom);
        schnum = (TextView) findViewById(R.id.schnum);
        knu = (TextView) findViewById(R.id.knu);
        na = (TextView) findViewById(R.id.na);
        IT = (TextView) findViewById(R.id.IT);
        one365 = (TextView) findViewById(R.id.one365);
        vms = (TextView) findViewById(R.id.vms);
        others = (TextView) findViewById(R.id.others);

        //원형 수치 퍼센트
        ME_Percent = (TextView) findViewById(R.id.ME_Percent);
        MChoice_Percent = (TextView) findViewById(R.id.MChoice_Percent);
        Refinement_Percent = (TextView) findViewById(R.id.Refinement_Percent);
        RefinementChoice_Percent = (TextView) findViewById(R.id.RefinementChoice_Percent);
        Free_Percent = (TextView) findViewById(R.id.Free_Percent);

        //원형 프로그레스 바
        progress_bar_ME = (ProgressBar) findViewById(R.id.progress_bar_ME);
        progress_bar_MChoice = (ProgressBar) findViewById(R.id.progress_bar_MChoice);
        progress_bar_Refinement = (ProgressBar) findViewById(R.id.progress_bar_Refinement);
        progress_bar_RefinementChoice = (ProgressBar) findViewById(R.id.progress_bar_RefinementChoice);
        progress_bar_Free = (ProgressBar) findViewById(R.id.progress_bar_Free);

        //종합정보시스템, 수강신청, IT인스타그램 아이콘
        IconSubscription = (Button) findViewById(R.id.IconSubsription);
        IconInformation = (Button) findViewById(R.id.IconInformation);
        IconInstagram = (Button) findViewById(R.id.IconInstagram);

        //캘린더, 메모, 계산기, 그림판
        editBtn = (Button)findViewById(R.id.editBtn);
        calBtn = (Button)findViewById(R.id.calBtn);
        culBtn = (Button)findViewById(R.id.culBtn);
        drawBtn = (Button)findViewById(R.id.drawBtn);

        //데이터 저장
        pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        editor = pref.edit();

        //전필 데이터 불러오기
        MENum = pref.getInt("MENum", 0);
        ME_Percent.setText(String.valueOf(MENum));
        progress_bar_ME.setProgress(MENum);

        //전선 데이터 불러오기
        MChoiceNum = pref.getInt("MChoiceNum", 0);
        MChoice_Percent.setText(String.valueOf(MChoiceNum));
        progress_bar_MChoice.setProgress(MChoiceNum);

        //교필 데이터 불러오기
        RENum = pref.getInt("RENum", 0);
        Refinement_Percent.setText(String.valueOf(RENum));
        progress_bar_Refinement.setProgress(RENum);

        //전공 자율 데이터 불러오기
        MFreeNum = pref.getInt("MFreeNum", 0);

        //교선 데이터 불러오기
        REChoiceNum = pref.getInt("REChoiceNum",0);
        RefinementChoice_Percent.setText(String.valueOf(REChoiceNum));
        progress_bar_RefinementChoice.setProgress(REChoiceNum);

        //교양 자율 데이터 불러오기
        RFreeNum = pref.getInt("RFreeNum", 0);

        //자율 데이터 불러오기
        FreeNum = pref.getInt("FreeNum",0);

        //자율 전체 데이터 불러오기
        FreeResultNum = pref.getInt("FreeResultNum", 0);
        Free_Percent.setText(String.valueOf(FreeResultNum));
        progress_bar_Free.setProgress(FreeResultNum);

        //뷰플리퍼 슬라이드 사진 설정
        ViewFlipper vFlipper;
        vFlipper = (ViewFlipper) findViewById(R.id.vFlipper);
        vFlipper.setFlipInterval(2000);//(밀리초) 800밀리초 = 1초
        vFlipper.startFlipping();

        //액티비티 이동
        major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent majorintent = new Intent(getApplicationContext(), Major.class);
                //전필 데이터 이동
                majorintent.putExtra("MEputPercent", MENum);
                majorintent.putExtra("MEputGraph", MEGraph);

                //전선 데이터 이동
                majorintent.putExtra("MChoiceputPercent", MChoiceNum);
                majorintent.putExtra("MChoiceputGraph", MChoiceGraph);
                startActivityForResult(majorintent, 10);
            }
        });

        refinement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refinementintent = new Intent(getApplicationContext(), Refinement.class);

                //교필 데이터 보내기
                refinementintent.putExtra("REputPercent", Integer.parseInt(Refinement_Percent.getText().toString()));
                refinementintent.putExtra("REputGraph", REGraph);
                startActivityForResult(refinementintent, 20);
            }
        });

        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent freeintent = new Intent(getApplicationContext(), Free.class);
                freeintent.putExtra("Free", FreeNum);
                startActivityForResult(freeintent, 30);
            }
        });

        poom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Poom.class);
                startActivity(intent);
            }
        });

        schnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SchoolNumber.class);
                startActivity(intent);
            }
        });

        knu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kornu.ac.kr/mbs/kornukr/intro.html"));
                startActivity(urlintent);
            }
        });

        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nabest.kornu.ac.kr/Career/"));
                startActivity(urlintent);
            }
        });

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cms.kornu.ac.kr/it/index.do"));
                startActivity(urlintent);
            }
        });

        one365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.1365.go.kr/vols/main.do"));
                startActivity(urlintent);
            }
        });

        vms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vms.or.kr/main.do"));
                startActivity(urlintent);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Others.class);
                startActivity(intent);
            }
        });

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calendar.class);
                startActivity(intent);
            }
        });

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Edit.class);
                startActivity(intent);
            }
        });

        culBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
            }
        });

        drawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Draw.class);
                startActivity(intent);
            }
        });

        IconSubscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.kornu.ac.kr/sso/unitylogin_web.jsp"));
                startActivity(urlintent);
            }
        });

        IconInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://was2.kornu.ac.kr/sugang/"));
                startActivity(urlintent);
            }
        });

        IconInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/knu_it_ai/?igshid=MzRlODBiNWFlZA%3D%3D"));
                startActivity(urlintent);
            }
        });
    }

    //액티비티 반환
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //전공 페이지에서 데이터 받기
        if (requestCode == 10) {
            if (resultCode == RESULT_OK) {

                //전필 데이터 받음
                int MEputNum = data.getIntExtra("MEputNum", 0);
                int MEputGauge = data.getIntExtra("MEputGauge", 0);
                progress_bar_ME.setProgress(MEputNum);
                ME_Percent.setText("" + MEputNum);

                //전필 데이터 저장
                MENum = Integer.parseInt(ME_Percent.getText().toString()); // int Max값 넘게 입력하면 오류 주의.
                editor.putInt("MENum", MENum);
                editor.apply(); // 저장

                //전선 데이터 받음
                int MChoiceputNum = data.getIntExtra("MChoiceputNum", 0);
                int MChoiceputGauge = data.getIntExtra("MChoiceputGauge", 0);

                MFreeNum=0;
                if(MChoiceputNum>21){
                    MFreeNum = MChoiceputNum - 21;
                    editor.putInt("MFreeNum", MFreeNum);
                    editor.apply(); // 저장
                }else{
                    MFreeNum=0;
                    editor.putInt("MFreeNum", MFreeNum);
                    editor.apply(); // 저장
                }
                progress_bar_MChoice.setProgress(MChoiceputNum);
                MChoice_Percent.setText("" + MChoiceputNum);
                MChoiceNum = Integer.parseInt(MChoice_Percent.getText().toString()); // int Max값 넘게 입력하면 오류 주의.
                editor.putInt("MChoiceNum", MChoiceNum);
                editor.apply(); // 저장
            }
        }


        //교양 페이지에서 데이터 받기
        if (requestCode == 20) {
            if (resultCode == RESULT_OK) {
                //교필 데이터 받음
                int REputNum = data.getIntExtra("REputNum", 0);
                int REputGauge = data.getIntExtra("REputGauge", 0);
                progress_bar_Refinement.setProgress(REputNum);
                Refinement_Percent.setText("" + REputNum);

                //교필 데이터 저장
                RENum = Integer.parseInt(Refinement_Percent.getText().toString()); // int Max값 넘게 입력하면 오류 주의.
                editor.putInt("RENum", RENum);
                editor.apply(); // 저장

                //교선 데이터 받음
                int RCputNum = data.getIntExtra("RCputNum", 0);
                progress_bar_RefinementChoice.setProgress(RCputNum);
                RefinementChoice_Percent.setText("" + RCputNum);

                RFreeNum=0;
                if(RCputNum>18){
                    RFreeNum = RCputNum - 18;
                    editor.putInt("RFreeNum", RFreeNum);
                    editor.apply(); // 저장
                }
                else{
                    RFreeNum =0;
                    editor.putInt("RFreeNum", RFreeNum);
                    editor.apply(); // 저장
                }

                //교선 데이터 저장
                REChoiceNum = Integer.parseInt(RefinementChoice_Percent.getText().toString());
                editor.putInt("REChoiceNum", REChoiceNum);
                editor.apply(); // 저장
            }
        }

        //자율 페이지에서 데이터 받기
        if (requestCode == 30) {
            if (resultCode == RESULT_OK) {
                //자율 데이터 받음
                FreeNum = data.getIntExtra("FputNum", 0);
                editor.putInt("FreeeNum", FreeNum);
                editor.apply();
            }
        }

        //자율 합
        FreeHap=0;
        FreeHap = MFreeNum+RFreeNum+FreeNum;
        progress_bar_Free.setProgress(FreeHap);
        Free_Percent.setText("" + FreeHap);
        editor.putInt("FreeResultNum", FreeHap);
        editor.apply();
    }
}
