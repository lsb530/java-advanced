# 문제1: Thread 상속
다음 요구사항에 맞게 멀티스레드 프로그램을 작성하라
 
1. `Thread`클래스를 상속받은 `CounterThread`라는 스레드 클래스 생성
2. 이 스레드는 1부터 5까지의 숫자를 1초 간격으로 출력해야 함. 앞서 만든 `log()` 기능을 사용해서 출력
3. `main()` 메서드에서 `CounterThread` 스레드 클래스를 만들고 실행

### 실행 결과
```text
09:46:23.329 [ Thread-0] value: 1
09:46:24.332 [ Thread-0] value: 2
09:46:25.338 [ Thread-0] value: 3
09:46:26.343 [ Thread-0] value: 4
09:46:27.349 [ Thread-0] value: 5
```

```java
package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {
    // 여기에 코드 작성
}
```