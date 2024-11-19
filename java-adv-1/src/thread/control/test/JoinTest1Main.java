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

        // 로그 예측
        /*
        t1 - 1
        t1 - 2
        t1 - 3
        t2 - 1
        t2 - 2
        t2 - 3
        t3 - 1
        t3 - 2
        t3 - 3
        "모든 스레드 실행 완료"

        총 실행 시간: 9초
         */
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
