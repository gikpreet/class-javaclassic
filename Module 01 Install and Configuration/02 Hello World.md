# Hello, World
이 연습에서는 Java 프로그래밍 언어를 사용해서 몇 가지 간단한 응용 프로그램을 작성합니다.

## Hello, World! 응용 프로그램 작성
이 연습에서는 첫 번째 Java 응용 프로그램, Hello, World!를 작성합니다. 아래 절차에 따릅니다.

1. Visual Studio Code의 파일 메뉴에서 Open Folder를 클릭합니다.
2. 코드가 위치할 디렉토리를 지정하고 오른쪽 위의 Open 버튼을 클릭합니다.
3. Yes, I trust the authors 버튼을 클릭합니다.
4. Explore에서 New File 버튼을 클릭하고 Hello.java 파일을 추가합니다.
![](./images/image03.png)
5. 코드 에디터에 아래와 같은 코드를 작성합니다.
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
6. Visual Studio Code의 Terminal 메뉴에서 new Terminal을 클릭합니다.
7. 터미널에서, 아래 명령을 실행하여 작성한 코드를 컴파일합니다.
```bash
$ javac Hello.java
```
8. 컴파일이 완료되면, Hello.class 파일이 생성됩니다. 아래 명령을 실행하여 Hello 응용 프로그램을 실행합니다.
```bash
$ java Hello
Hello, World!
```

## 섭씨를 화씨로 바꾸어 출력하는 프로그램 작성
이 연습에서는 $^\circ C = (5/9) (  ^\circ F - 32)$ 공식을 사용해서 화씨 온도를 섭씨 온도로 바꾸어 출력하는 프로그램을 작성합니다.

### 섭씨(Celcius)와 화씨(Fahrenheit) 온도
섭씨는 한국을 포함한 많은 나라에서 사용되고 있는 온도의 단위입니다. 표준 기압에서 물의 어는 점을 0 $^\circ $, 물의 끓는 점을 100 $^\circ$로 간주합니다.

화씨는 미국과 일부 영어권에서 사용되는 온도의 단위입니다. 표준 기압에서 물의 어는 점을 32 $^\circ$, 물의 끓는 점을 212 $^\circ$로 간주합니다.

화씨에서 섭씨로 온도르 변환하는 공식은 아래와 같습니다.

$$ ^\circ C = ( ^\circ F - 32)  \times (5 / 9) $$

공식에서 알 수 있듯이 물이 화씨에서는 32 $^\circ$ 에서 얼고, 섭씨에서는 0 $^\circ$ 에서 얼므로, 화씨를 섭씨로 변환할 때는 화씨 온도에서 32을 뺍니다. 이 수를 중심으로 화씨가 5도씩 증감 할 때 마다 섭씨는 9도씩 증갑합니다.

화씨를 섭씨로 변환하는 프로그램은 화씨 0 $^\circ$에서 300 $^\circ $까지의 온도를 20 $^\circ $ 간격으로 계산하여 출력합니다. 프로그램를 실행하면 아래와 같이 출력됩니다.
```
0       -17
20      -6
40      4
60      15
80      26
100     37
120     48
140     60
160     71
180     82
200     93
220     104
240     115
260     126
280     137
300     148
```

1. 터미널을 엽니다.
2. 아래 명령을 실행하여 프로그램을 작성할 디렉토리를 만듭니다.
```
$ mkdir -p $HOME/java/module01
```
3. 아래 명령을 실행하여 생성한 디렉토리로 이동합니다.
```
$ cd $HOME
$ cd java/module01
```
4. 아래 명령을 실행하여 현재 디렉토리에서 Visual Studio Code를 엽니다.
```
$ code .
```
5. Celsius.java 파일을 생성합니다.
6. 파일에 아래와 같은 코드를 작성합니다.
```java
public class Celsius {
    public static void main(String[] args) {
        int fahr, celsius;
        int lower, upper, step;

        lower = 0;
        upper = 300;
        step = 20;

        fahr = lower;

        while (fahr <= upper) {
            celsius = 5 * (fahr - 32) / 9;
            System.out.printf("%d\t%d\n", fahr, celsius);
            fahr += step;
        }
    }
}
```