public class ThreadTwo extends Thread {
    private static final String NAME = "ThreadTwo";
    private final SharedResource shared1;
    private final SharedResource shared2;

    public ThreadTwo(SharedResource shared1, SharedResource shared2) {
        this.shared1 = shared1;
        this.shared2 = shared2;
    }

    @Override
    public void run() {
        synchronized (shared2) {
            shared2.setOwner(NAME);
            notify();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (shared1) {
                shared1.setOwner(NAME);
                notify();
            }
        }
    }
}
