# 문제2: join() 활용2

문제1의 코드를 변경해서 전체 실행 시간을 3초로 앞당겨보자. 실행 결과를 참고하자.

```java
package thread.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest2Main {
    // 여기에 코드 작성
}
```

### 실행 결과
```text
10:29:46.321 [ t1] 1
10:29:46.321 [ t3] 1
10:29:46.321 [ t2] 1
10:29:47.325 [ t2] 2
10:29:47.329 [ t3] 2
10:29:47.329 [ t1] 2
10:29:48.330 [ t3] 3
10:29:48.330 [ t1] 3
10:29:48.330 [ t2] 3
모든 스레드 실행 완료
```
<b>실행 시간: 3초</b>

