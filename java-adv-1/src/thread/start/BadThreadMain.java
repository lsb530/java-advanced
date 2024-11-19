package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": main() 호출 전");
        helloThread.run(); // main스레드가 run() 직접 실행
        System.out.println(Thread.currentThread().getName() + ": main() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
