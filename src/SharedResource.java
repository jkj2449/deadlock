public class SharedResource {
    private final String name;
    private String owner;

    public SharedResource(String name) {
        this.name = name;
    }

    public synchronized void setOwner(String owner) {
        System.out.println(this.name + " owner = " + owner);
        this.owner = owner;
    }

//    public String getOwner() {
//        return owner;
//    }
}
