# Module 02. Java Language Basic
## 1. Variables (변수)
프로그래밍 언어에 따라 Sclar(스칼라)라고 부르기도 하는 Variable(변수)은 프로그래밍에서 아직 알려지지 않거나 어느 정도 까지만 알려져 있는 양이나 정보에 대한 상징적인 이름입니다. 소스코드에서 변수 이름은 일반적으로 데이터의 저장 위치와 변수에 저장되는 위치와 연관되어 있으며 프로그램 실행 도중에 변경됩니다.

### 1.1. 변수의 종류
#### 1.1.1. Instance Variables (인스턴스 변수 또는 전역 변수)
* static(정적)이 아닌 dynamic(동적)으로 선언
* static modifier 없이 선언된 클래스의 field(필드)
* 각 Class의 instance(인스턴스)별로 개별 값을 가지며, runtime(런타임)에 instance가 생성될 때 마다 새롭게 생성됨

#### 1.1.2. Class Variable (클래스 변수)
* static field (정적 필드)
* static modifier (정적 한정자)가 선언된 필드
* 컴파일러에서 Class의 instance 개수와 상관없이 하나만 생성함
* final이 추가될 경우, 값이 할당된 후 변경되지 않음

#### 1.1.3. Local Variable (로컬 변수 또는 지역 변수)
* method(메소드)에서 선언되어 일시적으로 사용하는 variable
* 선언된 method 내에서만, 선언되는 시점에서 생성, 할당되어 사용됨
* method가 실행을 return하거나 실행이 완료되면 해제됨

#### 1.1.4. Parameter (파라미터 또는 매개변수)
* method 호출자와 호출되는 method간의 상태 공유를 위해 사용하는 variable
* method 호출 과정에서 생성
* method가 return하거나 실행이 완료되면 해제됨

### 1.2. 이름 붙이기
* 하나 이상의 글자(영문자, 숫자, '_', '$')로 구성됨
* 첫 번째 글자는 영문자, '_', '$' 중의 하나만 사용 가능
* Java의 경우, 변수 이름에는 Camel Casing(단봉 낙타 규칙)을 사용
* constant(상수)와 같이 저장된 값을 사용하는 변수의 경우 대문자로만 구성
* 예약된 키워드는 사용할 수 없음
```
자료형
boolean     byte        char        double      float       int         long
short       void

반복문/제어문
break       case        default     continue    do          else        finally
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

#### 1.2.1. Camel Casing
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
#### 1.2.2. 모두 대문자
상수를 선언할 때는 변수의 모든 이름에 대문자를 사용하도록 선언할 것을 권장함
```java
static final int MIN_WIDTH = 4;
static final int MAX_WIDTH = 999;
static final int GET_THE_CPU = 1;
```

#### 1.2.3 피해야 할 방법
* Constant이외 변수의 모든 이름을 대문자로 표시
* 이름을 '_'(Underscore)로 시작
* 약어 사용

## 1.3. 컴퓨터가 데이터를 표현하는 방식
컴퓨터는 Binary(2진수)를 기반으로 데이터를 표현하고 연산합니다. 2진수를 기반으로 연산을 수행하고 이를 Octal(8진수), Decimal(10진수), 16진수(Hexadecimal)등으로 변환합니다.
* **Binary Number(2진수)** 두 개의 기호(1, 0)를 이용해서 값(데이터)을 표현하는 방식입니다.
* **Octal Number(8진수)** 여덟 개의 기호(0 ~ 7)를 이용해서 값(데이터)을 표현하는 방식입니다.
* **Decimal Number(10진수)**  열 개의 기호(0 ~ 9)를 이용해서 값(데이터)을 표현하는 방식입니다.
* **Hexadecimal Number(16진수)** 열 여섯 개의 기호(0 ~ 9, A ~ F)를 이용해서 값(데이터)을 표현하는 방식입니다.

### 1.3.1. Bit(비트)와 바이트(Byte)
컴퓨터는 2진수를 기반으로 데이터를 처리하고 저장합니다. 0 또는 1은 컴퓨터에서 데이터를 처리하는 최소 단위입니다.
* **Bit(비트)** 0 또는 1이라는 하나의 정보를 저장할 수 있는 공간을 의미합니다. 컴퓨터에서 데이터 처리의 최소 단위입니다.
* **Byte(바이트)** 8개의 bit(8 bit)로 이루어져 있는데, 컴퓨터는 프로그램에서 의미가 존재하는 데이터를 8개의 bit로 이루어진 단위로 처리합니다. 이를 Byte(바이트)라고 합니다. 8개의 bit로 이루어진 단위를 Octec(옥텟)이라고 부릅니다.
* **Nibble(니블)** Nibble은 1byte의 절반으로, 4bit를 표현합니다. 2<sup>4</sup>의 값을 표현할 수 있으며, 10진수로 16, 하나의 16진수 값을 표현할 수 있습니다.

### 1.3.2. ASCII(American Standard Code for Information Interchange - 아스키) Code
ASCII 코드는 1963년 미국 ANSI(American National Standard Institute)에서 표준화한 정보 교환용 7비트 부호체계입니다. 기기간 정보 교환을 위해 사용되었으며, 8비트 컴퓨터에서도 사용되어 문자 인코딩의 근간을 이루게 됩니다.

ASCII Code에서 하나의 문자는 1byte로 이루어지며, 8bit 중 첫 비트는 오류 검출을 위한 용도로, 나머지 7비트는 문자를 표시하기 위해 사용됩니다.

#### ASCII Code Table
|Binary |Octal|Decimal|Hex|Character|
|-------|-----|-------|---|---------|
|0000000|000  |0      |0  |NUL      |
|...    |...  |...    |...|...      |
|1000000|100  |64     |40 |@        |
|1000001|101  |65     |41 |A        |
|1000010|102  |66     |42 |B        |
|1000011|103  |67     |43 |C        |
|1000100|104  |68     |44 |D        |
|1000101|105  |69     |45 |E        |
|1000110|106  |70     |46 |F        |
|1000111|107  |71     |47 |G        |
|1001000|110  |72     |48 |H        |
|1001001|111  |73     |49 |I        |
|1001010|112  |74     |4A |J        |
|...    |...  |...    |...|...      |
|1100001|140  |97     |61 |a        |
|1100010|141  |98     |62 |b        |
|1100011|142  |99     |63 |c        |
|1100100|143  |100    |64 |d        |
|1100101|144  |101    |65 |e        |
|1100110|145  |102    |66 |f        |
|1100111|146  |103    |67 |g        |
|1101000|147  |104    |68 |h        |
|1101001|150  |105    |69 |i        |
|1101010|151  |106    |6A |j        |
|...    |...  |...    |...|...      |

## 1.4. Java Primitive Data Types
* Java에서 지원하는 8가지 Primitive Data Type
* 기본 값이 존재하는 data type으로 null이 존재하지 않음
* 정수, 실수, 문자, 논리 리터럴등의 실제 데이터 값을 저장
* 예약된 keyword를 사용해 정의
```java
byte, short, int, long, char, float, double, boolean
```
### 1.4.1. 종류
**byte**
* 부호있는 정수 (첫 번째 bit가 0이면 양수, 1이면 음수)
* 8 bit
* 최소값 -128
* 최대값 127
* 기본값 0
```
0 0 0 0 1 1 1 1 (10진수 15)
1 0 0 0 0 0 0 1 (10진수 -1)
```
**short**
* 부호있는 정수
* 16 bit
* 최소값 -32,768
* 최대값 32,767
* 기본값 0

**int**
* 32 bit
* 최소값 -2^31 (-2,147,483,648)
* 최대값  2^31 -1 (2,147,483,647)
* 기본값 0

**long**
* 부호 있는 정수
* 64 bit
* 최소값 -2^63 (-9,223,372,036,854,775,808)
* 최대값  2^63 -1 (9,223,372,036,854,775,807)
* 기본값 0

**char**
* Unicode 문자
* 16 bit
* 최소값 '\u0000' (또는 0)
* 최대값 '\uffff'(또는 65,535)
* 기본값 '\u0000'

**float**
* Single-precision IEEE 754 floating point(단정밀도 IEEE 754 부동 소수점)
* 32 bit
* 최소값 1.175494351 E-38
* 최대값 3.402823466 E+38
* 기본값 0.0f

**double**
* Double-precision IEEE 754 floating point(배정밀도 IEEE 754 부동 소수점)
* 64 bit
* 최소값 2.2250738585072014 E-308
* 최대값 1.7976931348623158 E+308
* 기본값 0.0d

**boolean**
* true와 false 두 가지 값만 사용
* 조건식과 논리 계산에 사용
* 기본값 false

### 1.4.2. Literals
* Primitive type을 초기화 할 때는 new 키워드를 사용하지 않음
* 고정된 값을 소스코드 상에서 표현한 것으로 별도의 계산 과정이 없음
```java
boolean result = true;
char capitalC = 'C';
byte b = 100;
short s = 10000;
int i = 10000;
```
#### Integer Literals
* 정수형은 byte, short, int, long
* long은 구분을 위해 'l' 또는 'L'을 붙여서 사용하며, '1'과 'l'의 구별이 어려우므로 'L'사용을 권장함
* 10진수를 기본으로 사용
* 16진수로 표기할 경우
    * 앞에 0x접두사가 붙음
    * 영문자 a-f 또는 A-F가 사용될 수 있으며, 대소문자 구분하지 않음
* 2진수로 표기할 경우, 앞에 0b 접두사가 붙음