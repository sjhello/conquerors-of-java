# 메모리 효율이 더 좋은 short 대신 왜 int를 사용할까?

보통 변수를 숫자형 자료를 지정할 때 타입을 int로 지정하는 경우가 많다

```java
int num = 10;    // short 자료형을 써도 되는데 왜 굳이 int를..?
```

그 이유는 컴퓨터는 기본적으로 int형을 가장 효율적으로 처리하며 CPU가 정수형 연산을 처리할때 모든 피연산자를 int형으로 변환하는 과정을 거치기 때문이다

short를 사용하면 int보다 메모리 절약은 되지만 이는 메모리 절약이 중요한 프로그램에서나 통하는 이야기이다(영상처리, 컴퓨터 그래픽스 등..) 메모리 절약이 중요하지 않은 프로그램에서는 short형을 쓰는것보다 차라리 int형을 쓰는것이 낫다

# 출처

[https://www.notion.so/2-00ffb2aeb41d450aa446675b8a9e91d5](https://www.notion.so/2-00ffb2aeb41d450aa446675b8a9e91d5)

[https://stackoverflow.com/questions/24371077/when-to-use-short-over-int](https://stackoverflow.com/questions/24371077/when-to-use-short-over-int)