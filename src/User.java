public class User implements Cloneable {

  private String name;
  private Address address;

  @Override
  public User clone() {
    try {
      User cloneUser = (User) super.clone();
      cloneUser.setAddress(address.clone());

      return cloneUser;

    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }


  public User(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", address=" + address.toString() +
        '}';
  }
}
