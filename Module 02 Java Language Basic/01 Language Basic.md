# Java Language Basic
## Variables (변수)
프로그래밍 언어에 따라 Sclar(스칼라)라고 부르기도 하는 Variable(변수)은 프로그래밍에서 아직 알려지지 않거나 어느 정도 까지만 알려져 있는 양이나 정보에 대한 상징적인 이름입니다. 소스코드에서 변수 이름은 일반적으로 데이터의 저장 위치와 변수에 저장되는 위치와 연관되어 있으며 프로그램 실행 도중에 변경됩니다.

### 변수의 종류
#### Instance Variables (인스턴스 변수 또는 전역 변수)
* static(정적)이 아닌 dynamic(동적)으로 선언
* static modifier 없이 선언된 클래스의 field(필드)
* 각 Class의 instance(인스턴스)별로 개별 값을 가지며, runtime(런타임)에 instance가 생성될 때 마다 새롭게 생성됨

#### Class Variable (클래스 변수)
* static field (정적 필드)
* static modifier (정적 한정자)가 선언된 필드
* 컴파일러에서 Class의 instance 개수와 상관없이 하나만 생성함
* final이 추가될 경우, 값이 할당된 후 변경되지 않음

#### Local Variable (로컬 변수 또는 지역 변수)
* method(메소드)에서 선언되어 일시적으로 사용하는 variable
* 선언된 method 내에서만, 선언되는 시점에서 생성, 할당되어 사용됨
* method가 실행을 return하거나 실행이 완료되면 해제됨

#### Parameter (파라미터 또는 매개변수)
* method 호출자와 호출되는 method간의 상태 공유를 위해 사용하는 variable
* method 호출 과정에서 생성
* method가 return하거나 실행이 완료되면 해제됨

### 이름 붙이기
* 하나 이상의 글자(영문자, 숫자, '_', '$')로 구성됨
* 첫 번째 글자는 영문자, '_', '$' 중의 하나만 사용 가능
* Java의 경우, 변수 이름에는 Camel Casing(단봉 낙타 규칙)을 사용
* constant(상수)와 같이 저장된 값을 사용하는 변수의 경우 대문자로만 구성
* 예약된 키워드는 사용할 수 없음
```
자료형
boolean     byte        char        double      float       int     long
short       void

반복문/제어문
break       case        default     continue    do          else    finally
for         goto        if          switch      while

기타
abstract    assert      catch       class       const       enum            extends
final       interface   implements  new         package     private         protected
public      return      static      strictfp    super       synchronized    this
throw       throws      transient   try         volatile

상수
true        false       null
```
* Java에서 허용하지 않는 명명의 경우, Compile-time error(컴파일시 오류) 발생

#### Camel Casing
이름을 지정할 때 약어를 쓰지 않고 전체 단어를 쓰며, 단어를 붙어쓰되 단어의 첫 번째 글자가 대 문자로 시작하도록 이릅을 지정하는 방법

**Lower camel casing**
이름의 첫 번째 문자를 소문자로 표시하고, 나머지 이어지는 단어들의 첫 번쨰 문자를 대문자로 표시하는 방법으로 Camel Casing이라면 보통 Lower camel casing을 지칭함
```java
int productCount
void openDocument()
```
**Upper camel casing**
연결되는 모든 단어의 첫 번째 문자를 대문자로 표시하는 방법으로, Pascal Casing이라고 부르기도 함
```java
class ProductFactory
```
#### 모두 대문자
상수를 선언할 때는 변수의 모든 이름을 대문자를 사용하도록 선언할 것을 권장함
```java
static final int MIN_WIDTH = 4;
static final int MAX_WIDTH = 999;
static final int GET_THE_CPU = 1;
```

#### 피해야 할 방법
* Constant이외 변수의 모든 이름을 대문자로 표시
* 이름을 '_'(Underscore)로 시작
* 약어 사용

### Primitive3 Data Types
* Java에서 지원하는 8가지 Primitive Data Type
* 기본 값이 존재하는 data type으로 null이 존재하지 않음
* 정수, 실수, 문자, 논리 리터럴등의 실제 데이터 값을 저장
* 예약된 keyword를 사용해 정의
```java
int, short, long, float, double, char, boolean, float
```
