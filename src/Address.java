public class Address implements Cloneable {
  private String city;

  public Address(String city) {
    this.city = city;
  }

  @Override
  public Address clone() {
    try {
      Address clone = (Address) super.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        '}';
  }
}
