# 문제1: 공유 자원
다음 코드의 결과는 20000이 되어야 한다<br/>
이 코드의 문제점을 찾아서 해결해라</br>
이 코드에서 다른 부분은 변경하면 안되고, `Counter` 클래스 내부만 수정해야 한다

```java
package thread.sync.test;

public class SyncTest1BadMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("결과: " + counter.getCount());
    }

    static class Counter {
        private int count = 0;

        public void increment() {
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }
}
```

### 기대하는 실행 결과
```text
결과: 20000
```
이 예시의 실행 결과는 20000이 아니라 다른 값이 나올 수 있다. 반드시 20000이 출력되어야 한다

```java
public class SyncTest1Main {
    // 여기에 코드 작성
}
```