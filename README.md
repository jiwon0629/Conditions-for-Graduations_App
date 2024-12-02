# Conditions-for-Graduations_App

나사렛대학교 졸업작품으로 IT융합학부 학생들의 졸업조건을 확인할 수 있는 앱  
여러 홈페이지를 오가며 확인해야했던 졸업조건을 한번에 확인할 수 있게 만들었다.  
전공필수, 전공선택, 교양필수, 교양선택, 자율과목들을 체크하면 메인화면에  
원형그래프로 현황을 알 수 있고 디바이스가 꺼져도 체크한 목록과 그래프 현황은  
sqlDB로 저장이 되어 항상 확인할 수 있다.  

## Language  
 - <img src="https://img.shields.io/badge/android-34A853?style=flat-square&logo=android&logoColor=white"/>
 - <div style="display: flex; align-items: flex-start;"><img src="https://techstack-generator.vercel.app/java-icon.svg" alt="icon" width="57" height="57" /></div>  


# 구성
  1. 메인 페이지
  2. 전공 페이지
  3. 교양 페이지
  4. 품 마일리지 페이지
  5. 학번 페이지
  6. 나사렛대학교 홈페이지
  7. IT학부 페이지
  8. 1365 페이지  
  9. VMS 페이지  
  10. Na-Best 페이지
  11. 캘린더 페이지
  12. 메모장 페이지
  13. 계산기
  14. 그림판
  15. 결과화면


# 1. 메인 페이지  
 - 먼저 앱을 실행시키면 아래에 보이는 화면처럼
졸업 조건을 확인할 수 있는 앱 화면이 나옵니다.

- 전공, 교양, 자율, 품 마일리지, 학번 페이지와
나사렛대학교, IT 융합학부, 1365, VMS, Na-Best의
홈페이지를 들어갈 수 있는 Bar를 만들었습니다.  

- View Flipper를 이용하여 2초 정도 후에 이미지가
넘어가게 설정하여 이미지 슬라이드를 표현하였습니다.  

- ListView를 이용하여 공지사항을 만들어
학생들에게 학과 공지사항을 확인할 수 있게 합니다.

- 화면 우측에는 캘린더, 메모장, 계산기, 그림판 기능이 있습니다.  

- 졸업 조건에 맞게 전공필수, 전공선택, 교양필수, 
교양선택, 자율선택 항목을 Progress Bar를 이용해 
그래프 형식으로 나타내어 한 눈에 확인할 수 있게  
나타내어 학점이 얼마나 채워졌는지 알 수 있습니다.

- Icon을 삽입하여 Icon을 클릭하면 
종합정보시스템, 수강 신청, IT 학과 인스타그램
페이지로 이동하게 합니다.  

![main](https://github.com/user-attachments/assets/fd786b35-57a8-4f06-a5c1-06e4455642fa)

# 2. 전공 페이지  
 - 메뉴를 이용해서 자신에 맞는 학번별로 선택하여 학부공통, 전공필수, 전공선택을 선택할 수 있습니다.
 - 체크박스를 이용해 과목들을 체크하면 체크여부를 SharedPreferense를 이용해 boolean값으로 저장하여  
화면을 나가더라도 체크상태를 유지시킵니다.
 - 저장 버튼을 누르고 난 후에 체크를 끝내고 메인화면 버튼을 누르면 과목에 맞는 학점의 총합이  
Intent를 이용하여 총합 데이터를 메인화면으로 이동시킵니다.

 - 만약 체크와 총합을 초기화 시키고 싶다면 저장버튼을 누른 후 초기화 버튼을 누르면 초기화됩니다.

![major1](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/9e52b309-3793-445b-8537-8cb2c3e7b87a)
![major2](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/ebbcf67d-bb32-4b55-a3d0-2cc04ac60584)
![major3](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/116345f6-c2ca-495b-bb81-c77a8ac9e758)
![major4](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/00401f45-055e-48e8-8a9e-54644b8624e3)
![major5](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/f446c07c-a1a6-411f-9341-0e4077cfc90b)

# 3. 교양 페이지  
 - 메뉴를 이용해서 자신이 수강한 교양 과목을 선택할 수 있습니다.
 - 교양선택은 과목이 많기 때문에 체크박스를 사용하기에는 한계가 있다고 판단하여 역량, 과목, 학점을 작성하고  
초기화, 입력, 조회, 수정, 삭제할 수 있게 했습니다.

 - sqlDB를 이용하여 테이블을 만든 후에 각 데이터를 넣고 저장할 수 있게 했습니다.

 - 교양 페이지도 저장 버튼을 누르고 체크를 마치고 메인화면 버튼을 누르면 Intent를 이용하여 메인화면의  
교양 그래프가 변화할 수 있게 했습니다.

![refinement1](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/531e1286-95ca-4abf-bc09-b1bdba6800c6)
![refinement2](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/511315da-95b3-4fe1-9a9c-2ce94dd10d47)
![refinement3](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/e4793777-19f0-4042-8e51-d3e7f7fda11d)

# 4. 품 마일리지 페이지  
 - 품 마일리지도 종류가 많기 때문에 등록할 항목, 인증점수를 작성하고 초기화, 입력, 조회, 수정, 삭제할 수 있게 했습니다.  
  
 - 하단에 총합이 나오게 되고 교양 선택 페이지와 같이 sqlDB를 이용하여 테이블을 만든 후에 각 데이터를 넣고 저장할 수 있게 했습니다.
  
![poom](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/d7dad0da-8caf-4cb7-9504-76814ef06efb)

# 5. 학번 페이지  
 - 학번 페이지는 학년별 교육과정표가 있는 페이지입니다.  
 - 상단에 버튼을 누르면 각 교육과정표가 나오게 됩니다.

![schnum](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/883436ed-7a67-42fd-be25-93e8c1332498)

# 6. 나사렛대학교 홈페이지  
 - urlIntent를 이용하여 각 url로 바로 이동하게 합니다.
  
![kornu](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/06304796-04dc-401e-b772-9f4eaaa9e6ef)

# 7. IT학부 페이지  
 - urlIntent를 이용하여 각 url로 바로 이동하게 합니다.
  
![IT](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/dca4813e-c90d-4dc8-8656-b91f98c11d92)

# 8. 1365 페이지  
 - urlIntent를 이용하여 각 url로 바로 이동하게 합니다.
  
![1365](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/88a7baee-d7eb-43c6-885f-16df01380ec5)

# 9. VMS 페이지  
 - urlIntent를 이용하여 각 url로 바로 이동하게 합니다.
  
![vms](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/ada2945a-48a3-46fd-842f-4701d8d96840)

# 10. Na-Best 페이지  
 - urlIntent를 이용하여 각 url로 바로 이동하게 합니다.
  
![nabest](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/74ac2dd0-7b14-44a5-bb56-bbe916ef73fe)

# 11. 결과화면  
 - 전공필수, 전공선택, 교양필수, 교양선택, 자율선택의 그래프가 채워지고 수치가 넘어간 데이터가 자율로 채워지게 구성하게 했습니다.  
  
![result](https://github.com/jiwon0629/Conditions-for-Graduations-App/assets/149983498/d530d586-02de-4495-baff-e4f9c94d4bf2)


