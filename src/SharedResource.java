public class SharedResource {
    private int total = 0;

    public synchronized void withdraw(int amount) {
        try {
            while(total < amount) {
                //wait();
                if(total > amount) {
                    break;
                }
            }

            this.total = total - amount;
            System.out.println("withdraw total = " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(int amount) {
        this.total = total + amount;
        System.out.println("deposit total = " + total);

        notifyAll();
    }
}
