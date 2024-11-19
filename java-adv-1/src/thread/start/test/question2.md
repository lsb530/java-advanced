# 문제2: Runnable 구현
다음 요구사항에 맞게 멀티스레드 프로그램을 작성하라

1. `CounterRunnable` 이라는 이름의 클래스를 만들자, 이 클래스는 `Runnable` 인터페이스를 구현
2. `CounterRunnable` 은 1부터 5까지의 숫자를 1초 간격으로 출력해야 한다. 앞서 우리가 만든 `log()` 기능을 사용해서 출력
3. `main` 메서드에서 `CounterRunnable` 의 인스턴스를 이용해서 `Thread` 를 생성하고 실행
4. 스레드의 이름은 "counter"로 지정해야 함

### 실행 결과
```text
09:46:23.329 [ counter] value: 1
09:46:24.332 [ counter] value: 2
09:46:25.338 [ counter] value: 3
09:46:26.343 [ counter] value: 4
09:46:27.349 [ counter] value: 5
```

```java
package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {
    // 여기에 코드 작성
}
```