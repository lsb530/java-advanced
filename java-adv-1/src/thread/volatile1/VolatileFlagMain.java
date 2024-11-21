package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {
        // boolean runFlag = true;
        volatile boolean runFlag = false;
        // -> 캐시메모리를 사용하지 않고, 값을 읽거나 쓸 때 항상 메인메모리에 직접 접근. 성능이 조금 저하됨

        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                // runFlag가 false로 변하면 탈출
                // System.out.println("hello"); // context switching이 일어나면서 캐시메모리->메인메모리에 쓸 수도 있음
            }
            log("task 종료");
        }
    }
}
