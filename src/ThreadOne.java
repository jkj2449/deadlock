public class ThreadOne extends Thread {
    private static final String NAME = "ThreadOne";
    private final SharedResource shared1;
    private final SharedResource shared2;

    public ThreadOne(SharedResource shared1, SharedResource shared2) {
        this.shared1 = shared1;
        this.shared2 = shared2;
    }

    @Override
    public void run() {
        synchronized (shared1) {
            shared1.setOwner(NAME);
            notify();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (shared2){
                shared2.setOwner(NAME);
                notify();
            }
        }
    }
}
