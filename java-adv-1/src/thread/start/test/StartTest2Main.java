package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {
        CounterRunnable runnable = new CounterRunnable();
        Thread thread = new Thread(runnable);
        thread.setName("counter");
        thread.start();
    }

    static class CounterRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                sleep(1_000L);
            }
        }

        public static void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
