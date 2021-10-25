public class Main {
    private final SharedResource shared1 = new SharedResource("shared1");
    private final SharedResource shared2 = new SharedResource("shared2");

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.start();
    }

    public void start() throws InterruptedException {
        ThreadOne one = new ThreadOne(shared1, shared2);
        ThreadTwo two = new ThreadTwo(shared1, shared2);

        one.start();
        two.start();

        one.join();
        two.join();
    }
}
