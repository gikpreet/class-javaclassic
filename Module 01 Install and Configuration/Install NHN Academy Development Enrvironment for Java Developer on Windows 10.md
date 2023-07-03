# Install NHN Academy Development Enrvironment for Java Developer on Windows 10
여기에서는 Java 개발을 위한 운영체제 환경을 Windows 10이 설치된 컴퓨터 상에서 구성합니다. 

## 1. 설치 개요
NHN Academy에서는 Java 개발을 위해 Linux 운영체제의 배포본인 Ubuntu 20.04 이상 버전을 사용합니다. Windows 운영체제가 설치된 컴퓨터에서 Linux를 실행하기 위해서는 가상화, Docker, WSL등 여러가지 방법이 있습니다.

* 가상화   
Hypervisor를 사용해서 운영체제에 가상화된 운영체제를 설치하여 사용하는 방법으로, Windows 10 Professional 이상의 버전에서 기본으로 제공되는 Hyper-V나, VMWare와 같은 Hypervisor, Virtual PC와 같은 데스크톱 가상화를 사용해서 Windows 운영체제를 기반으로 Hypervisor 계층위에서 Linux 운영체제를 동작시키는 방법입니다.
* Docker   
프로세스 격리 기술을 사용하여 가상화된 운영체제를 사용하는 방법으로, 가상화에 비헤 설치가 간단하고 쉽고 빠르게 원하는 환경만을 구성할 수 있다는 장점이 있습니다. 
* WSL   
Windows 운영체제에서 경량화된 가상화 기술을 사용하여 Linux 운영체제를 구동하게 해주는 기술로, Windows Kernel(WSL) 또는 Hypervisor(WSL2)을 사용하여 Linux를 구동하며, 경량화되어 빠르게 사용할 수 있습니다.


NHN Academy는 Java의 기본 개발 환경으로 Linux 운영체제를 사용하며, 다양한 환경에서 Java를 사용하는 방법을 학습합니다. Windows 10 이상의 운영체제에서 가장 간단한 방법으로 Linux 운영체제를 사용할 수 있는 방법은 Windows Subsystem for Linux를 사용하는 것이며, Java Classic 환경에서는 WSL을 사용합니다.

## 2. Windows 10에서 wsl 설치
Windows에서는 

https://llighter.github.io/install_wsl2/