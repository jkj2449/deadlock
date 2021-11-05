public class ThreadTwo extends Thread {
    private final SharedResource sr;

    public ThreadTwo(SharedResource sr) {
        this.sr = sr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("ThreadTwo 자원 요청");
            sr.withdraw(200);
            System.out.println("ThreadTwo 자원 해제");
        }
    }
}
