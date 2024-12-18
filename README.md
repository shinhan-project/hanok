# hanok : 신한 DS 1차 프로젝트
한옥 예약 결제 사이트

# 브랜치 소개
## 1. main branch
   - 배포 가능한 상태를 유지하는 브랜치
   - 안정적인 코드만 병합됨
## 2. develop branch
   - 모든 개발 작업이 통합되는 폴더
   - 각 기능 브랜치(feature branches)는 develop를 기준으로 생성하고, 작업 완료 후 다시 develop로 병합
## 3. feature/기능명#이슈번호 branch
   - 이슈 번호에 해당하는 기능별 작업을 위한 브랜치
   - develop checkout 후 branch
## 4. infra#16 branch
   - DB 코드, pom.xml, MvcConfig, Mapper.xml, Mapper.java, VO 등 기능 구현 이외의 작업
   - develop checkout 후 branch

# 주요 기능 브랜치
1. feature/enroll-hanok#1 : 한옥 등록 기능
2. feature/header#2 : 손님, 고객, 관리자, 사장 헤더
3. feature/join#3 : 회원가입 기능
4. feature/login#4 : 로그인 기능
5. feature/reservation-payment#5 : 한옥 예약 및 결제 기능
6. feature/review#6 : 고객이 한옥 리뷰 다는 기능

# 부가 기능 브랜치
1. feature/qna#7 : 문의게시판 기능
2. feature/reservation-check#8 : 예약정보 확인 기능
3. feature/mypage#9 : 고객, 사장 마이페이지 확인 기능
4. feature/reservation-management#10 : 사장 : 예약 관리 기능
5. feature/review-management#11 : 사장 : 리뷰 관리
6. feature/calculation#12 : 사장 : 정산 관리
7. feature/customer-check#13 : 관리자 : 고객 정보 확인 기능
8. feature/ceo-check#14 : 관리자 : 사장 정보 확인 기능
9. feature/mainpage#15 : 손님, 고객, 사장, 관리자 메인페이지

# 진행하기
## 레포지토리 클론
- 원격 저장소를 지역 저장소 외에 다른 지역 저장소에서 사용하려면, 원격 저장소에 담긴 내용 전체를 지역 저장소로 가져와야 함
- git clone https://github.com/조직이름/프로젝트이름.git : 원격 저장소를 지역 저장소로 똑같이 가져오는 작업을 하는 명령어
### 1. 터미널(Git Bash)에서 원하는 디렉토리로 이동
   ```bash
   cd /path/to/your/workspace # 원하는 경로로 이동(change directory -> cd)
   git clone https://github.com/shinhan-project/hanok.git
   cd hanok
   git remote -v # 원격 저장소가 제대로 연결되었는지 확인
   git branch # 브랜치 확인
   ```

## 작업 브랜치 생성 및 이슈 확인 (팀원 역할)
### 1. 팀장이 만든 이슈 확인
   - GitHub 레포지토리에서 팀장이 할당한 **Issue**를 확인
   - 각 이슈에는 **작업 내용**, **담당자**, **마감 기한**이 명시됨
### 2. 팀원들은 각 이슈를 확인하여 브랜치를 생성해야 하지만 팀장이 이미 했음

## 각 팀원은 자신이 맡은 기능에 해당하는 브랜치에서 코드 작성 및 커밋
### 1. 작업할 브랜치로 이동
   원격 브랜치를 로컬로 가져옴
   ```bash
   git checkout dev
   git pull origin dev
   git checkout feature/<브랜치명>
   git pull origin feature/<브랜치명>
   ```
### 2. 각자 작업 진행
#### 깃 작업 흐름과 역할
##### 1. 작업 디렉토리 : 실제 파일이 있는 곳으로 변경 작업이 이루어져있는 공간
##### 2. 스테이징 영역 : 커밋을 위한 준비 공간
   - 개별 작업 후 스테이징할 때 (예시)
   ```bash
   # 모든 수정사항을 스테이징
   git add .
   # 절대 경로나 깃 저장소 기준으로 상대 경로로 사용 가능
   git add 파일명
   ```
   ```bash
   touch example.txt    # example.txt 파일 생성 (예시)
   git add example.txt  # example.txt를 스테이징에 추가
   ```
   - 작업 완료 후 스테이징 변경 전후사항 확인
   ```bash
   git status
   ```
##### 3. 저장소 영역(레포 영역) : 최종 커밋된 파일이 저장된 공간
   - git add로 먼저 스테이징된 파일만을 커밋
   ```bash
   git commit -m "이슈번호: 작업 내용 요약" # -m : 커밋 메시지 작성용
   git commit -am "모든 수정 파일을 커밋" # -am : 수정된 파일 모두 자동 스테이징 후 커밋 (git add . 과정 생략)
   ```
   
## 맡은 기능 작업이 모두 완료되었을 때
### 1. 로컬 브랜치의 변경 사항을 원격 저장소에 올림
   - 원격 저장소에 푸시되면 다른 팀원들도 해당 브랜치를 확인할 수 있음
   ```bash
   git push
   git push origin feature/#이슈번호-간단설명
   ```
### 2. Pull Request(PR) 생성
   - GitHub 레포지토리에서 **New Pull Request**를 클릭
   - base : 병합할 기준 브랜치 -> feature 하위의 경우 develop, inrfa인 경우 main
   - compare : 작업 브랜치 -> infra 혹은 feature/#이슈번호-간단설명으로 설정
   - PR 제목과 설명을 작성 (설명은 작업 내용, 변경 사항, 검토 요청 등등 매우 상세하게 작성 권장)
   - 리뷰어(Reviewers) 지정
   - Create Pull Request 버튼을 클릭하여 PR을 생성
### 3. PR에 대한 코드 리뷰를 진행
1. 팀장 : 코드 리뷰 진행
   - GitHub에서 PR 페이지로 이동
   - "Files changed" 클릭
   - Request changes : 수정이 필요하다는 피드백
   - Approve : 코드가 적합하다고 승인
   - 리뷰가 승인되면 팀장이 PR을 병합하고 브랜치를 삭제
2. 팀원
   ```bash
   git checkout feature/작업명 # 로컬에서 PR 브랜치로 이동
   ```
   - 피드백이 있으면 작업 브랜치에서 수정하고 다시 commit → push
   ```bash
   git add .
   git commit -m "피드백 반영: 수정 내용 설명"
   git push origin <해당 브랜치>
   ```
   - PR이 열린 상태에서는 push된 내용이 자동으로 업데이트됨 **(PR은 커밋 기준이 아니고 브랜치 기준)**
   - 팀장이 재리뷰
   - git commit 메시지 명명 팁 : https://blog.ull.im/engineering/2019/03/10/logs-on-git.html
### 4. PR Merge (팀장)
   - 머지는 GitHub에서 진행
   - 코드 리뷰가 끝나고 승인되면, PR 페이지에서 "Merge pull request" 버튼을 클릭하여 작업 브랜치의 코드를 기준 브랜치(main 또는 dev)에 병합
   - 병합 후 원격 저장소에는 최신 코드가 반영
   - 로컬 환경에 업데이트
   ```bash
   git checkout develop  # 기준 브랜치로 이동 (or main)
   git pull origin develop  # 최신 코드 가져오기 (or main)
   ```
### 5. 브랜치 삭제 (팀장)
   - 작업이 끝난 브랜치는 정리
   ```bash
   git branch -d feature/브랜치명  # 로컬 브랜치 삭제
   git push origin --delete feature/브랜치명  # 원격 브랜치 삭제
   ```

## 외부 컴퓨터에서 내려받아 작업하기
   - 집에 있는 컴퓨터에서 커밋을 푸시해서 원격 저장소의 커밋 상황이 달라짐
   - 그래서 같은 원격 저장소와 연결되어 있는 외부 컴퓨터에서 작업하려면 먼저 원격 저장소에 새로 올라온 커밋을 가져와야함
   - 하나의 원격 저장소에 지역 저장소가 2개 이상 연결되어 있을 때, 지역 저장소에서 작업하려면 원격 저장소의 변경 사항을 먼저 가져와야 함
   ```bash
   git pull # 원격 저장소에 새로 올라온 커밋을 가져옴
   ```

## fetch, pull, merge 차이
### 1. git fetch
   - 원격 저장소의 변경 사항을 로컬 저장소로 가져옴
   - 현재 작업 중인 브랜치는 영향 X
   - 원격 브랜치의 상태를 확인하고, 로컬 브랜치를 직접 업데이트하기 전에 변경 사항을 점검하고 싶을 때 사용

### 2. git pull
   - 원격 저장소의 변경 사항을 가져오고, 현재 체크아웃된 로컬 브랜치와 merge
   - git fetch + git merge
   - 현재 작업 중인 브랜치를 원격 브랜치와 즉시 동기화하고 싶을 때 사용
     
### 3. git merge
   - 다른 브랜치의 변경 사항을 현재 브랜치에 병합
   - 병합 대상은 로컬 브랜치일 수도 있고, fetch로 가져온 원격 브랜치일 수도 있음
   - 로컬 브랜치를 직접 업데이트하거나, 다른 브랜치와 변경 사항을 통합하고 싶을 때 사용

## 충돌 해결 절차
   - 브랜치 병합시 충돌이 발생할 수 있음
### 1. 충돌 확인
   ```bash
   git pull origin dev
   ```
   - 충돌이 발생하면 메시지 발생
### 2. 충돌 수정
   - 충돌된 파일 열어서 수정
   - 충돌된 코드: <<<<<<<, =======, >>>>>>> 사이의 내용을 수정
### 3. 수정, 스테이징, 커밋, 푸시
   ```bash
   git add .
   git commit -m "충돌 해결: 수정 내용 설명"
   git push origin feature/<브랜치명>
   ```

## 주의사항
### 1. 로컬 변경사항을 항상 최신화 후 작업 시작
   ```bash
   git checkout dev
   git pull origin dev
   git checkout feature/<브랜치명>
   ```
### 2. 커밋 메시지 작성
   - 한 줄 요약 (작업 내용) → 세부 설명
   ```bash
   git commit -m "로그인 페이지 UI 구현

   - 로그인 폼 추가
   - CSS 스타일링 수정"
   ```
