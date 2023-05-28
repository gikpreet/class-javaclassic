# Install and Configure Java Programming Environment
## Utuntu에 Java 설치
이 연습에서는 Ubuntu에 Java 프로그래밍 환경을 설치합니다. 아래 절차에 따릅니다.

1. 터미널을 실행합니다.
2. 아래 명령을 실행하여 패키지를 업데이트 합니다.
```bash
$ sudo apt update
```
3. 아래 명령을 실행하여 패키지 리포지토리 정보를 다운로드합니다.
```bash
$ wget -O - https://packages.adoptium.net/artifactory/api/gpg/key/public | sudo apt-key add -
```
4. 아래 명령을 실행하여 패키지 정보를 업데이트 합니다.
```bash
$ echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | sudo tee /etc/apt/sources.list.d/adoptium.list
```
5. 아래 명령을 실행하여 패키지를 업데이트합니다.
```bash
$ sudo apt update
```
6. 아래 명령을 실행하여 Temurin Java 11 버전을 설치합니다.
```bash
$ sudo apt install temurin-11-jdk
```
7. 아래 명령을 실행하여 설치된 Java를 확인합니다.
```bash
$ java --version
openjdk 11.0.19 2023-04-18
OpenJDK Runtime Environment Temurin-11.0.19+7 (build 11.0.19+7)
OpenJDK 64-Bit Server VM Temurin-11.0.19+7 (build 11.0.19+7, mixed mode)
$ javac -version
javac 11.0.19
```

## Visual Studio Code 설치
이 연습에서는 Ubuntu에 Visual Studio Code를 설치합니다. 아래 절차에 따릅니다.

1. 웹 브라우저를 실행하고 아래 웹 사이트로 이동합니다.
```
https://code.visualstudio.com/download
```
2. 웹 사이트에서 컴퓨터의 아키텍처에 맞는 .deb 파일을 클릭하여 다운로드 합니다.
<img src="images/image01.png" width="500">
3. Downloads 디렉토리로 이동하고, 아래 명령을 실행하여 Visual Studio Code를 설치합니다.
```bash
$ sudo apt install ./code-<filename>
```

## Visual Studio Code에서 Java extension 설치
이 연습에서는 Visual Studio Code에 Java 확장을 설치합니다. 아래 절차에 따릅니다.

1. Visual Studio Code를 실행합니다.
2. 왼쪽 패널에서 Extensions를 클릭하고 검색 텍스트 상자에 Java를 입력합니다.
<img src="images/image02.png" width="200">
3. Extension Pack for Java를 설치합니다.





