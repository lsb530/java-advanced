package thread.cas.increment;

public class VolatileInteger implements IncrementInteger {

    volatile private int value;
    volatile private boolean flag;

    // 원자적 연산
    public void setFlagFalse() {
        flag = false;
    }

    /*
        value = value + 1
        1. 값을 가져와서
        2. 1증가 시킨 후
        3. 다시 업데이트
        => 원자적 연산이 아님
        => volatile 키워드로 해결 불가
    */
    @Override
    public void increment() {
        value++;
    }

    @Override
    public int get() {
        return value;
    }
}
