# 문제1: join() 활용1
다음 코드를 작성하고, 코드를 실행하기 전에 로그가 <b>어떻게 출력될지 예측</b>해보자. 
그리고 <b>총 실행시간이 얼마가 걸릴지 예측</b>해보자
 
```java
package thread.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest1Main {
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
        
        t3.start();
        t3.join();
        System.out.println("모든 스레드 실행 완료");
    }
    
    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
    
}
```