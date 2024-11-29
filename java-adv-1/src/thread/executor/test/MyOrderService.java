package thread.executor.test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class MyOrderService {

    public void order(String orderNo) throws InterruptedException, ExecutionException {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);

        Callable<Boolean> task1 = inventoryWork::call;
        Callable<Boolean> task2 = shippingWork::call;
        Callable<Boolean> task3 = accountingWork::call;

        ExecutorService es = Executors.newFixedThreadPool(5);
        List<Callable<Boolean>> tasks = List.of(task1, task2, task3);
        List<Future<Boolean>> futures = es.invokeAll(tasks);

        boolean result = false;
        for (Future<Boolean> future : futures) {
            result = future.get();
        }
        if (result) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        }
        else {
            log("일부 작업이 실패했습니다.");
        }
        es.close();
    }

    static class InventoryWork {
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork {
        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork {
        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
