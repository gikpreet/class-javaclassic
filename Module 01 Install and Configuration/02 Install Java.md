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

1. sudo 권한이 있는 사용자로, 다음 명령을 실행하여 패키지 인덱스를 업데이트하고 종속성을 설치합니다.
```bash
$ sudo apt update
$ sudo apt install software-properties-common apt-transport-https wget
```
2. 아래 wget 명령을 실행하여 Microsoft GPG 키를 가져옵니다.
```bash
$ wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
```
3. 아래 명령을 실행하여 Visual Studio Code 리포지토리를 활성화 합니다.
```bash
$ sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
```
4. 아래 명령을 실행하여 Visual Studio Code를 설치합니다.
```
$ sudo apt install code
```

## Visual Studio Code에서 Java extension 설치
이 연습에서는 Visual Studio Code에 Java 확장을 설치합니다. 아래 절차에 따릅니다.

1. Visual Studio Code를 실행합니다.
2. 왼쪽 패널에서 Extensions를 클릭하고 검색 텍스트 상자에 Java를 입력합니다.  
<img src="images/image02.png" width="400">  
3. Extension Pack for Java를 설치합니다.

## Visual Studio Code path 설정
이 연습에서는 Visual Studio Code의 원활한 사용을 위해 path를 설정합니다. Windows와 Linux 운영체제에서는 Visual Studio Code를 설치하면 path가 지정되므로, 작업이 필요하지 않습니다.

> 이 작업은 macOS 운영체제에서만 실행합니다.

1. Visual Studio Code를 실행합니다.
2. Ctrl + Shift + P 키를 눌러 명령 팔레트를 열고, path로 검색한 후 아래 명령을 실행합니다.
```
Shell Command: Install ‘code’ command in PATH
(한글) 셸 명령: PATH에 'code' 명령 설치
```

<img src="images/image04.png" width="700">  

3. 지문 인식 또는 패스워드를 입력하여 인증을 제공합니다.
4. 터미널을 열고, 아래 명령을 실행하여 path를 확인합니다. 
```
% code -v
```

## wsl 설치 (Windows 운영체제에만 해당)
이 연습에서는 Windows 운영체제에 WSL(Windows Subsystem on Linux)를 설치하고 개발 환경을 구성합나디. 아래 절차에 따릅니다.

1. Windows 터미널을 실행합니다.
2. 아래 명령을 실행하여 wsl을 설치합니다.
```
> wsl --install -d ubuntu-22.04
```
