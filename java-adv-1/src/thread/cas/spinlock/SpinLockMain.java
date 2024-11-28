package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockMain {

    public static void main(String[] args) {
        // SpinLockBad spinLock = new SpinLockBad();
        SpinLock spinLock = new SpinLock();

        Runnable task = () -> {
            spinLock.lock();
            try {
                // critical section
                log("비즈니스 로직 실행");
                sleep(10); // 오래 걸리는 로직에서 스핀 락 사용 X
            } finally {
                spinLock.unlock();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }
}
