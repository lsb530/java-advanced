# 문제4: 여러 스레드 사용
* Thread-A` , `Thread-B` 두 스레드를 만들어라
* `Thread-A` 는 1초에 한 번씩 "A"를 출력한다
* `Thread-B` 는 0.5초에 한 번씩 "B"를 출력한다
* 이 프로그램은 강제 종료할 때 까지 계속 실행된다

### 실행 결과
```text
10:04:27.000 [ Thread-A] A
10:04:27.000 [ Thread-B] B
10:04:27.507 [ Thread-B] B
10:04:28.006 [ Thread-A] A
10:04:28.012 [ Thread-B] B
10:04:28.518 [ Thread-B] B
10:04:29.011 [ Thread-A] A
10:04:29.023 [ Thread-B] B
... 무한 실행
```

```java
package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    // 여기에 코드 작성
}
```