# DB 준비

## 1. Docker 설치 (일회성)

- **Rancher Desktop** 설치

  https://rancherdesktop.io/

- Container Engine : dockerd (moby) 선택
  - Rancher Desktop 실행 후 > File > Preferences > Container Engine 탭 선택해서 수정 가능

## 2. docker 띄우기

```bash
# docker-compose.yml 있는 경로에서 아래 명령어 실행
$ docker compose up -d

# 아래 명령어로 띄워져 있는 container 확인하기
$ docker ps

# cli에서 접속하기
docker exec -it tct-db bash
```

### 3. 기준 데이터 추가

- src\main\resources\db\migration 경로 아래에 DDL, DML 쿼리 작성
- 기존에 작성되어 있는 script 수정 시, local db (tct-db) 내의 tgs_tct 스키마를 삭제하고 다시 spring boot 서버 기동
-

### 3. DB 툴을 통해 접속

- DBeaver
  - https://dbeaver.io/
  - Edit Connection (F4) → Connection settings → Driver properties
  - allowPublicKeyRetrieval 설정을 True로 변경
