<!-- [#8](https://github.com/xtra72/On-To-Java/issues/8) -->
# 변수(Variable)

- 어느 글월이 [변수][variables]의 역할을 더 잘 풀어썼나요?
  1. "메모리 뭉치(address to memory chunk)"와 그 속에 저장된 "bit pattern의 해석 방식(data type)"을 요약(abstraction)[^1]한 것
  1. 식(expression) 속에서 값이 들어갈 자리(place-holder)와 조건(data type)을 abstraction 한 것
- 변수의 data type을 static time에 정하는(binding) 방식을 static typing이라고 합니다. Java에서는 static typing이 기본입니다. 여기서 static은 무슨 뜻인가요?
- [primitive data type][datatypes] 이름을 모두 적습니다.
  - primitive를 어떤 뜻으로 쓰나요?
  - primtive data type 이름은 keyword인가요? reserved word인가요?

[DefaultValue](DefaultValue.java) application에서:

- 변수를 모두 찾아서 [분류][variables]합니다.
- compile 합니다.
  - error를 내지 않는 변수가 있습니다. 이유가 무엇인가요?
  - 변수의 declaration과 definition을 구분할 수 있습니까?
  - defintion, declaration, initialization[^2]을 한 글월로 연결 지어 설명합니다.
- 모든 변수의 [default value][datatypes]가 찍히도록 코드를 고칩니다. 무엇을 바로 잡았습니까?

### Convention

- 변수 이름은 camel-case syntax를 따릅니다.
- 변수에 final을 붙여 정의하는 constant의 이름은 LINE_FEED처럼 대문자 낱말을 _로 연결하여 변수 이름과 구분합니다.

## Literals

[Literals.java](Literals.java)에서:

- 돌아가도록 고칩니다.
- 왜 글자가 저렇게 찍히는지 설명합니다.
- LINE_FEED 대신에 다른 constant를 써서 같은 결과가 나오게 만듭니다.
- 쓰지 않은 모든 변수와 constant의 <이름> = <값>을 찍도록 code를 보탭니다.

<!-- TODO:

class 변수, instance 변수를 static, non-static field라고도 한다는 것을 빠뜨렸다. 그런데 field라고 쓰는 사람을 못봤다. 그랬으면 좋겠다는 바람인가? ^^

문제를 풀라고 할까?
- Q7은 array 문제만 빼고
- E1에서 field가 static non-static field 둘 다 나오는데 ... local 변수만 나온 것이라서 진도에 안맞기는 하고
[Q&E](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_variables.html)

-->

<!-- 참고 자료 -->
[variables]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
[datatypes]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

[^1]: 추상화(抽象化)라고 하지 않고 abstraction이라고 씁니다. 글의 흐름에 따라  '요약'하거나 간추린다고 씁니다.
[^2]: 초기화(初期化)라고 하지 않고 initialization이라고 씁니다. 글의 흐름에 따라 '변수의 값을 (지)정한다'라고 씁니다.
