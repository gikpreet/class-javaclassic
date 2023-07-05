## UNIX command 명령
UNIX의 기본 명령어중의 하나인 [command](https://www.ibm.com/docs/ko/aix/7.2?topic=c-command-command) 명령은 단순 명령을 실행합니다.
command -v 및 command -V 명령은 쉘에서 사용되는 경로 이름과 쉘이 명령 유형을 해석하는 방식(내장, 함수, 별명 등)을 표준 출력에 기록합니다.

## UNIX 특수 문자 명령어
|명령어|사용 예|설명|
|-----|-------|----|
|$!   |echo $!|백그라운드에서 가장 마지막에 실행된 프로세스(명령어)의 PID 값을 출력|
|$?   |echo $?|bash 쉘에서 최근 실행한 명령어의 종료 스테이터스를 가진 변수. 정상이면 0, 비정상이면 127과 같은 숫자 출력|
|$$	  |echo $$|	사용하고 있는 Shell의 PID값을 출력한다. 현재 bash 쉘의 프로세스 ID|
|&&	  |mkdir a && chmod 444|	앞의 명령어가 성공하면 다음 명령어를 실행|
|\|\| |	mkdir a \|\| mkdir b|	명령어1이 실패하면 명령어2를 실행|
|&	  |find a & echo 'wait'|	명령어1을 백그라운드로 실행하고 명령어2를 실행|
|;	  |mkdir a ; mkdir b ; mkdir c|	여러 명령어를 한 줄에서 순서대로 수행할 수 있음|
|{}	  |{find a & echo 'wait'} && echo 'success'|	명령을 그룹화하여 순서를 지정할 수 있음

