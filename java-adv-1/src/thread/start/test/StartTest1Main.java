package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {

    public static void main(String[] args) {
        CounterThread thread = new CounterThread();
        thread.start();
    }

    static class CounterThread extends Thread {
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
