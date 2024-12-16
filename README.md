# hanok : 신한 DS 1차 프로젝트
한옥 예약 결제 사이트

# 브랜치 소개
1. main branch
   - 배포 가능한 상태를 유지하는 브랜치
   - 안정적인 코드만 병합됨
2. dev branch
   - 모든 개발 작업이 통합되는 브랜치
   - 각 기능 브랜치(feature branches)는 dev를 기준으로 생성하고, 작업 완료 후 다시 dev로 병합
3. feature/기능명 branch
   - 각 기능별 작업을 위한 브랜치
   - dev checkout 후 branch
4. infra branch
   - dev checkout 후 branch
   - DB 코드, pom.xml, MvcConfig, Mapper.xml, Mapper.java, VO 등 기능 구현 이외의 작업

# 주요 기능 브랜치
1. feature/enroll-hanok : 한옥 등록 기능
2. feature/header : 손님, 고객, 관리자, 사장 헤더
3. feature/join : 회원가입 기능
4. feature/login : 로그인 기능
5. feature/reservation-payment : 한옥 예약 및 결제 기능
6. feature/review : 고객이 한옥 리뷰 다는 기능

# 부가 기능 브랜치
1. feature/qna : 문의게시판 기능
2. feature/reservation-check : 예약정보 확인 기능
3. feature/mypage : 고객, 사장 마이페이지 확인 기능
4. feature/reservation-management : 사장 : 예약 관리 기능
5. feature/review-management : 사장 : 리뷰 관리
6. feature/calculation : 사장 : 정산 관리
7. feature/customer-check : 관리자 : 고객 정보 확인 기능
8. feature/ceo-check : 관리자 : 사장 정보 확인 기능
9. feature/mainpage : 손님, 고객, 사장, 관리자 메인페이지

# 진행하기
### 레포 클론
- 원격 저장소를 지역 저장소 외에 다른 지역 저장소에서 사용하려면, 원격 저장소에 담긴 내용 전체를 지역 저장소로 가져와야 함
- 원격 저장소를 지역 저장소로 똑같이 가져오는 작업을 복제 혹은 클론(clone)한다고 함
1. 터미널(Git Bash)에서 원하는 디렉토리로 이동
   ```bash
   cd /path/to/your/workspace # 원하는 경로로 이동(change directory -> cd)
   git clone https://github.com/shinhan-project/hanok.git
   cd hanok
   git branch # 브랜치 확인
   ```
### 각 팀원은 자신이 맡은 기능에 해당하는 브랜치에서 작업
1. 작업할 브랜치로 이동
   원격 브랜를 로컬로 가져옴
   ```bash
   git checkout dev
   git pull origin dev
   git checkout feature/<브랜치명>
   git pull origin feature/<브랜치명>
   ```
### 깃 작업 흐름과 역할
1. 작업 디렉토리 : 실제 파일이 있는 곳으로 변경 작업이 이루어져있는 공간
2. 스테이징 영역 : 커밋을 위한 준비 공간
   ```bash
   git add <파일 이름>
   ```
   ```bash
   touch example.txt    # example.txt 파일 생성
   git add example.txt  # example.txt를 스테이징에 추가
   ```
   ```bash
   git add . # 여러 파일을 한꺼번에 스테이징에 추가
   git status # 스테이징 변경 전후사항 확
   ```
3. 저장소 영역(레포 영역) : 최종 커밋된 파일이 저장된 공간
   ```bash
   git add file1.txt # 파일 경로가 될 수도 있음
   git commit -m "file1.txt에 대한 변경 사항 커밋" # git add로 먼저 스테이징된 파일만을 커밋, -m은 커밋 메시지 작성용

   git commit -am "모든 수정 파일을 커밋" # 수정된 파일 모두 자동 스테이징 후 커밋
   ```
4. 커밋을 원격 저장소에 올림
   ```bash
   git push
   ```
5. 외부 컴퓨터에서 내려받아 작업하기
   - 집에 있는 컴퓨터에서 커밋을 푸시해서 원격 저장소의 커밋 상황이 달라짐
   - 그래서 같은 원격 저장소와 연결되어 있는 외부 컴퓨터에서 작업하려면 먼저 원격 저장소에 새로 올라온 커밋을 가져와야함
   - 하나의 원격 저장소에 지역 저장소가 2개 이상 연결되어 있을 때, 지역 저장소에서 작업하려면 원격 저장소의 변경 사항을 먼저 가져와야 함
   ```bash
   git pull # 원격 저장소에 새로 올라온 커밋을 가져옴
   ```
   - 수정 후 다시 원격 저장소로 푸시

### fetch, pull, merge 차이
1. git fetch
  - 원격 저장소의 변경 사항을 로컬 저장소로 가져옴
  - 현재 작업 중인 브랜치는 영향 X
  - 원격 브랜치의 상태를 확인하고, 로컬 브랜치를 직접 업데이트하기 전에 변경 사항을 점검하고 싶을 때 사용

2. git pull
   - 원격 저장소의 변경 사항을 가져오고, 현재 체크아웃된 로컬 브랜치와 merge
   - git fetch + git merge
   - 현재 작업 중인 브랜치를 원격 브랜치와 즉시 동기화하고 싶을 때 사용
     
3. git merge
   - 다른 브랜치의 변경 사항을 현재 브랜치에 병합
   - 병합 대상은 로컬 브랜치일 수도 있고, fetch로 가져온 원격 브랜치일 수도 있음
   - 로컬 브랜치를 직접 업데이트하거나, 다른 브랜치와 변경 사항을 통합하고 싶을 때 사용
     
