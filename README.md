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
1. 각 팀원은 자신이 맡은 기능에 해당하는 브랜치에서 작업
2. 병합 전에 Pull Request를 통해 코드 리뷰를 진행
3. dev 브랜치에서 최신 코드를 가져와 충돌을 확인
4. 완료된 코드는 dev 브랜치로 병합

1. 레포지토리 클론
```bash
git clone https://github.com/shinhan-project/hanok.git
