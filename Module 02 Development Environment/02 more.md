## 공부 거리

- [Demo.java](Demo.java)에서:
  - punctuators란?
  - delimiter란?
  - 다른 언어의 statement terminator는? e.g. Python, Javascript
  - [keyword](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)를 모두 찾습니다.
    - reserved word를 모두 찾습니다.
- [byte code](https://www.techtarget.com/whatis/definition/bytecode), virtual machine(VM)이 무엇이고 왜 만들었나요?
  - [compiler 구조를 그려서 설명합니다.][compiler]
  - JVM, JDK, JRE의 구분하고 연관지어 설명합니다.
- editor[^editors]에서 tab 문자를 space로 바꿔 넣는 기능이 있는 까닭은 무엇인가요? 어떻게 설정하나요?
- coding convention에 따라 코드 쓰는 연습을 합니다.
  - code formatter를 쓰는 게 이롭습니다.
    - e.g. [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
    - e.g. [Java formatting and linting](https://code.visualstudio.com/docs/java/java-linting)
    - [Pretty-printing](https://en.wikipedia.org/wiki/Prettyprint)이 무엇이고 실제로 어떻게 쓰나요?
    - editor에서 어떻게 설정해서 쓰나요?

### Java on Linux

- Java application에서 main은 누가 불러 쓰나요?
- Shell에서 command의 exit status를 `echo $?`로 찍어보는 것은 번거롭습니다. [VsCode 속 shell](https://code.visualstudio.com/docs/terminal/shell-integration)처럼 $?가 bash prompt에 곧바로 나타나게 꾸밉니다.
- Java source code를 compile & run하는 shell script **cr**을 만듭니다. Demo.java를 보기로 들어:

  sh
  sh cr Demo


  - cr의 \$?(exit status)는 javac Demo.java && java Demo의 $?과 같습니다.
  - error가 나면 다음처럼 stderr로 error message를 보내고 [exit][exit] 합니다. $?은 1입니다.
    - javac와 java를 실행할 수 없다면 "error: No JDK"
    - 인자는 하나만 받습니다. [없거나 많으면][args] Usage: cr [filename without .java]
    - Demo.java 파일이 없다면 "error: Demo.java: No such file"

<!-- 주석 -->
[^editors]: NeoVim(vi), Visual Studio Code(VsCode), IntelliJ 가운데 하나 또는 모두

<!-- 링크 -->
[args]: https://www.redhat.com/sysadmin/process-script-inputs
[exit]: https://www.redhat.com/sysadmin/linux-shell-command-exit-codes
[compiler]:https://www.guru99.com/java-platform.html
