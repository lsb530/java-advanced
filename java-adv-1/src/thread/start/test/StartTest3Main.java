package thread.start.test;

import static util.MyLogger.log;

public class StartTest3Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    sleep(1_000L);
                }
            }
        };
        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
