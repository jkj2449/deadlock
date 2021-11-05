public class Main2 {

  public static void main(String[] args) {
    User user = new User("jeong", new Address("서울"));

    User cloneUser = user.clone();
    cloneUser.setName("song");
    cloneUser.getAddress().setCity("대구");

    System.out.println("user = " + user.toString());
    System.out.println("cloneUser = " + cloneUser.toString());
  }
}
