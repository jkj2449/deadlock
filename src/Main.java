public class Main {
    private final SharedResource shared = new SharedResource();

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.start();
    }

    public void start() throws InterruptedException {
        ThreadOne one = new ThreadOne(shared);
        ThreadTwo two = new ThreadTwo(shared);

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println("종료");
    }
}
