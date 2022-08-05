# RaffleProject

## Raffle이란
> 한정판 제품을 발매하고 선착순으로 판매하는 판매방식의 공정성에 대한 소비자들의 불만으로 인해 인기를 얻고 있는 판매 방법입니다.
> 응모에 참여한 사람들에게 공정하게 추첨을 통해 구매기회를 부여하는 제도입니다.

## 기획 의도
> 중고거래 플랫폼의 관례 상 상품을 거래할 때 "네고"라는 수단을 통해 판매가를 깎는 일이 생기곤 합니다.
> 이로 인해 Collector의 소장품의 가치가 온전히 보장받지 못한다는 문제점을 해결하고자 기획한 프로젝트입니다.

## 사용 기술
<div> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> 
  <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
  <img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
  <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  <br>
</div>

---
# Raffle Project 기능 설명
### [Main Controller]
---
1. 메인 페이지
  - 조회수가 높은 상품 조회 기능
  - 최근 등록된 상품 조회 기능
  
### [Member Controller]
---
1. 회원가입
  - 아이디 중복확인, 비밀번호 6글자 이상 (특수문자 포함), 비밀번호 일치여부 확인
2. 로그인 / 로그아웃
  - 아이디 또는 패스워드 오류 시 에러메세지 출력 후 에러페이지로 이동
3. 회원정보 수정

### [Raffle Controller]
---
1. Sell / Resell 상품 등록
  - 이미지 파일 업로드, 상품 정보 입력 후 상품목록에 추가하는 기능
2. Sell / Resell 상품 목록
  - 등록한 상품 목록, soldout된 상품 표시 기능
3. Sell / Resell 상품 상세페이지
  - 상세페이지 클릭시 상품 별 조회수 증가 기능, 최근 등록된 상품을 기준으로 상품 추천하는 기능
4. Sell / Resell 상품 정보 수정 및 삭제
  - 판매자가 등록한 상품에 대해서만 상품 정보 수정 및 삭제 가능

### [Attend Controller]
---
1. Sell / Resell 상품 응모
    - 상품 상세페이지에서 응모버튼 누른 후 결제완료하면 응모되는 기능
2. Sell / Resell 응모한 상품 수량 변경
    - 수량 변경시 재결제
3. Sell / Resell 응모 취소
    - 응모 취소시 결제 취소
    
### [Random Controller]
---
1. 응모자 중에서 당첨자 추첨
    - 이미 추첨 완료된 상품이면 당첨자 정보 확인가능
    - 응모자가 없으면 메인페이지로 이동
2. 당첨자 개인정보 확인
    - 판매자만 당첨자 정보 확인 가능
    
### [Supervising Controller]
---
1. 판매중인 상품 확인
    - 내가 등록한 상품 정보 확인 및 수정, 삭제 가능
2. 응모한 상품 및 당첨 결과 확인
    - 응모한 상품 수량 변경 및 응모취소, 당첨 결과 확인 가능
    
### [Board Controller]
---
1. 자유게시판
    - 사용자 아무나 자유롭게 글 작성 가능
    - 작성자만 게시글 수정 및 삭제 가능
2. 공지사항
    - 관리자가 아닌 사용자는 조회만 가능
    
### [Admin Controller]
---
1. 관리자 기능
    - 관리자는 일반 사용자는 접근 할 수 없는 관리자 전용 페이지로 로그인
    - 전체 상품 관리 (삭제가능)
    - 회원 탈퇴처리 가능
    - 자유게시판 글 삭제 가능
    - 공지사항 작성 및 수정
