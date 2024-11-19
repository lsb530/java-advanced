package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId = " + mainThread.threadId());
        log("mainThread.name = " + mainThread.getName());
        log("mainThread.priority = " + mainThread.getPriority());
        log("mainThread.threadGroup = " + mainThread.getThreadGroup());
        log("mainThread.state = " + mainThread.getState());

        System.out.println();

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId = " + myThread.threadId());
        log("myThread.name = " + myThread.getName());
        log("myThread.priority = " + myThread.getPriority());
        log("myThread.threadGroup = " + myThread.getThreadGroup());
        log("myThread.state = " + myThread.getState());
    }

}
