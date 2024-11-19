package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        PrintWork a = new PrintWork("A", 1_000L);
        PrintWork b = new PrintWork("B", 500L);

        Thread threadA = new Thread(a, "Thread-A");
        Thread threadB = new Thread(b, "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {

        private String content;
        private long sleepMs;

        public PrintWork(String content, long sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                sleep(sleepMs);
            }
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
