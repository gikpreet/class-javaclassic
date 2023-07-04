# Install NHN Academy Development Enrvironment for Java Developer on Windows 10
여기에서는 Java 개발을 위한 환경을 Windows 10이 설치된 컴퓨터 상에서 구성합니다. 

## 1. 설치 개요
NHN Academy에서는 Java 개발을 위해 Linux 운영체제의 배포본인 Ubuntu 20.04 이상 버전을 사용합니다. Windows 운영체제가 설치된 컴퓨터에서 Linux를 실행하기 위해서는 가상화, Docker, WSL등 여러가지 방법이 있습니다.

* 가상화   
Hypervisor를 사용해서 운영체제에 가상화된 운영체제를 설치하여 사용하는 방법으로, Windows 10 Professional 이상의 버전에서 기본으로 제공되는 Hyper-V나, VMWare와 같은 Hypervisor, Virtual PC와 같은 데스크톱 가상화를 사용해서 Windows 운영체제를 기반으로 Hypervisor 계층위에서 Linux 운영체제를 동작시키는 방법입니다.
* Docker   
프로세스 격리 기술을 사용하여 가상화된 운영체제를 사용하는 방법으로, 가상화에 비헤 설치가 간단하고 쉽고 빠르게 원하는 환경만을 구성할 수 있다는 장점이 있습니다. 
* WSL(Windows Subsystem for Linux)   
Windows 운영체제에서 경량화된 가상화 기술을 사용하여 Linux 운영체제를 구동하게 해주는 기술로, Windows Kernel(WSL) 또는 Hypervisor(WSL2)을 사용하여 Linux를 구동하며, 경량화되어 빠르게 사용할 수 있습니다.

NHN Academy는 Java의 기본 개발 환경으로 Linux 운영체제를 사용하며, 다양한 환경에서 Java를 사용하는 방법을 학습합니다. Windows 10 이상의 운영체제에서 가장 간단한 방법으로 Linux 운영체제를 사용할 수 있는 방법은 Windows Subsystem for Linux를 사용하는 것이며, Java Classic 환경에서는 WSL을 사용합니다.

## Windows Terminal 설치
Windows Terminal은 명령 프롬프트, Powershell 및 WSL, 다른 터미널 형식의 응용 프로그램올 통합해서 사용할 수 있는 가상 터미널 응용 프로그램입니다. Windows Terminal은 다중 탭과 텍스트 렌터링에 GPU 가속 지원, 다양한 추가 설정이 가능한 등의 여러 기능을 지원합니다. 

Windows Terminal 설치를 위해 아래 절차를 따릅니다.

1. Windows PowerShell을 실행합니다.
2. 아래 명령을 실행하여 실행중인 Windows의 버전과 빌드 번호를 확인합니다.
```
> winver
```
<img src="images/image05.png" width="400" />   

> - wsl2는 Windows 10 버전 1903, 빌드 18362 이상에서 동작합니다.   
> - 동작중인 Windows 10이 그 이하의 버전이면, 이상의 버전으로 업그레이드 해야 합니다.
> - Windows 10의 최종 버전인 22H2 버전으로 업그레이드 하는 것이 좋습니다.
> - 2023년 6월 기준, 최신 빌드는 19044.3155 입니다.

3. 아래 명령을 실행하여 Windows Terminal 설치 여부를 확인합니다.
```
> winget list | findstr "Terminal"
```
> 아래와 같은 메시지를 출력하여 설치된 것으로 확인되면 **2. Windows 10에서 wsl2 설치** 단계로 넘어갑니다.  
> \> Windows ?????&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Microsoft.WindowsTerminal&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1.17.11461.0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;winget

2. 설치가 발견되지 않으면 아래 명령을 실행하여 Windows Terminal을 설치합니다.
```
> winget install --id=Microsoft.WindowsTerminal -e
```

3. 설치가 진행됩니다.

## 2. Windows 10에서 wsl2 설치
여기에서는 Windows 10에 wsl2를 설치합니다. 아래 절차에 따릅니다.

1. Windows Terminal을 실행합니다.
2. 아래 명령을 실행하여 Windows Subsystem for Linux 기능이 시스템에 설치되어 있는지 확인합니다.
```
> dism /online /Get-Features
```
3. 

https://llighter.github.io/install_wsl2/, 