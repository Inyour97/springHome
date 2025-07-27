# 📘 Account Book - 개인 가계부 웹 애플리케이션

> Spring 기반의 RESTful 아키텍처와 JWT 인증, 통계 시각화 기능을 포함한 웹 기반 가계부 프로젝트입니다.  
> 실무 중심의 기능 구현과 유지보수 가능한 구조 설계에 중점을 두었습니다.

---

## 🛠 사용 기술 스택

| 분류       | 기술명                                        |
|------------|-----------------------------------------------|
| Language   | Java 11, JavaScript, HTML                     |
| Framework  | Spring Boot, Spring Security (JWT)           |
| DB         | SQL Server                                    |
| View       | JSP, Chart.js                                 |
| Build Tool | Maven                                         |
| 기타       | Git, GitHub, IntelliJ, Apache POI, Postman    |

---

## 📌 프로젝트 개요

- **목표**: 수입/지출 내역 등록, 자동 반복 입력, 월별/카테고리별 통계 제공
- **주요 기능**:
  - CRUD 기능 (입력/수정/삭제)
  - 정기 수입·지출 자동 반영
  - JWT 기반 로그인 및 인증 처리
  - Excel 다운로드 (Apache POI)
  - 차트 기반 통계 시각화

---

## 📁 프로젝트 구조

```
com.accountbook
 ├── controller    // API 요청 처리
 ├── service       // 비즈니스 로직
 ├── repository    // JPA 기반 DB 접근
 ├── entity        // 테이블 매핑 객체
 ├── dto           // 데이터 전달 객체
 └── config        // 시큐리티 및 설정
```

---

## 🗃 데이터베이스 설계

| 필드명   | 타입        | 설명              |
|----------|-------------|-------------------|
| id       | Long (PK)   | 고유 ID           |
| title    | String      | 내역 제목         |
| amount   | int         | 금액              |
| type     | String      | 수입 / 지출 구분 |
| category | String      | 카테고리 (식비 등)|
| date     | LocalDate   | 사용 날짜         |
| memo     | String      | 비고              |

---

## 🔗 API 명세

| Method | Endpoint        | 설명              |
|--------|------------------|-------------------|
| GET    | `/records`       | 전체 내역 조회   |
| POST   | `/records`       | 내역 추가        |
| GET    | `/records/{id}`  | 단건 조회        |
| PUT    | `/records/{id}`  | 내역 수정        |
| DELETE | `/records/{id}`  | 내역 삭제        |

---

## 📊 통계 시각화

- 월별 수입/지출 합계 차트
- 카테고리별 원형 차트
- 잔여 예산 대비 사용률

> (차트 캡처 예정)

---

## 🔐 로그인 보안

- Spring Security + JWT 토큰 방식
- 사용자 인증/인가 기능 구현
- 인증된 사용자만 CRUD 가능

---

## ⏱ 진행 현황

| 구분     | 내용                            |
|----------|---------------------------------|
| 학습 기간 | 2025년 07월 ~ 미정              |
| 현재 상황 | 주요 기능 개발 및 테스트 중     |
| 향후 계획 | 모바일 반응형, OAuth, 배포 자동화 예정 |

---

## 🙋‍♂️ 개발자 정보

| 이름     | 김인열 |
|----------|--------|
| GitHub   | [github.com/Inyour97](https://github.com/Inyour97) |
| Email    | pg11031@naver.com |
| Blog     | 없음 |

---

## 📄 라이선스

본 프로젝트는 개인 학습 및 포트폴리오 용도로 사용되며, 상업적 목적의 활용은 제한됩니다.

