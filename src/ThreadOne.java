public class ThreadOne extends Thread {
    private final SharedResource sr;

    public ThreadOne(SharedResource sr) {
        this.sr = sr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("ThreadOne 자원 요청");
            sr.deposit(100);
            System.out.println("ThreadOne 자원 해제");
        }
    }
}
