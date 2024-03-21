# Team_MungNolZa_Gti_Practice

## 👩‍💻 Git 기본 명령어<br>
#### 변경사항 확인
  ```
  git status
  ```
![image](https://github.com/chanho0908/Team_MungNolZa_Git_Practice/assets/84930748/351b280f-8e8c-465d-8319-e50a098f3ad2)

>+ 추적하지 않는(untracked) 파일: Git의 관리에 들어간 적 없는 파일<br>
>+ new file : 새로 생성된 파일<br>
>+ modified : 수정된 파일<br>

#### 파일 하나 담기
```
git add [파일 이름]
```

#### 모든 파일 담기
```
git add .
```

#### 변경사항 커밋하기
```
git commit
```

#### 변경사항 메시지와 함께 커밋하기
```
git commit -m "커밋 메시지"
```
#### 💡 TIP add와 commit 한꺼번에(새로 추가된(untracked) 파일이 없을 때 한정)
```
git commit -am "(메시지)"
```

<hr>

### Git에서 과거로 돌아가는 두 방식
+ reset : 원하는 시점으로 돌아간 뒤 이후 내역들을 지웁니다.
+ revert : 되돌리기 원하는 시점의 커밋을 거꾸로 실행합니다.

#### reset
```
git log <- 돌아가고 싶은 커밋 해쉬 복사
git reset --hard (돌아갈 커밋 해시)
```
![image](https://github.com/chanho0908/Team_MungNolZa_Git_Practice/assets/84930748/9f1330c3-175e-4f1a-a966-7d199d280faf)

#### revert
```
git revert (되돌릴 커밋 해시)
```
#### 💡 커밋해버리지 않고 revert하기
```
git revert --no-commit (되돌릴  커밋 해시)
```
## Branch: 분기된 가지 (다른 차원)
프로젝트를 하나 이상의 모습으로 관리해야 할 때

예) 실배포용, 테스트서버용, 새로운 시도용
여러 작업들이 각각 독립되어 진행될 때

예) 신기능 1, 신기능 2, 코드개선, 긴급수정...
각각의 차원에서 작업한 뒤 확정된 것을 메인 차원에 통합
![image](https://github.com/chanho0908/Team_MungNolZa_Git_Practice/assets/84930748/af7a678b-d18a-4e19-8b88-2e82aae0cb1e)

#### 브랜치 생성
```
git branch add-coach
```
#### 브랜치 목록 확인
```
git branch 
```
#### 브랜치로 이동
```
git switch add-coach
```
#### 💡 브랜치 생성과 동시에 이동하기
```
git switch -c new-teams
```
#### 🗑 브랜치 삭제하기
```
git branch -d (삭제할 브랜치명)
```
##### 지워질 브랜치에만 있는 내용의 커밋이 있을 경우즉 다른 브랜치로 가져오지 않은 내용이 있는 브랜치를 지울 때는 -d 대신 -D(대문자)로 강제 삭제해야 합니다.
```
git branch -D (강제삭제할 브랜치명)
```

### 서로 다른 브랜치를 합치는 두 방식
+ merge : 두 브랜치를 한 커밋에 이어붙입니다.
브랜치 사용내역을 남길 필요가 있을 때 적합한 방식입니다.


+ rebase : 브랜치를 다른 브랜치에 이어붙입니다.
한 줄로 깔끔히 정리된 내역을 유지하기 원할 때 적합합니다. 
이미 팀원과 공유된 커밋들에 대해서는 사용하지 않는 것이 좋습니다.

#### merge로 합치기
```
git merge 브랜치명
```
