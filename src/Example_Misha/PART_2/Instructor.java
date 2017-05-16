package Example_Misha.PART_2;

import java.io.Serializable;

public class Instructor implements Serializable {
  private final long serialVersionUID = 100_500L;
  private String firstName;
  private String lastName;
  private int age;
  private transient boolean married; // <<-- todo AHAHAH )))

  public Instructor(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Instructor(String firstName, String lastName, int age) {
    this(firstName, lastName);
    this.age = age;
  }

  public Instructor(String firstName, String lastName, int age, boolean married) {
    this(firstName, lastName, age);
    this.married = married;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  @Override
  public String toString() {
    return "\nfirstName = '" + firstName + '\''
        + "\nlastName = '" + lastName + '\''
        + "\nage" + '\'' + age + '\''
        + "\n isMarried = " + married;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Instructor that = (Instructor) o;

    if (age != that.age) return false;
    if (married != that.married) return false;
    if (!firstName.equals(that.firstName)) return false;
    return lastName.equals(that.lastName);
  }

  @Override
  public int hashCode() {
    int result = (int) (serialVersionUID);
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + age;
    result = 31 * result + (married ? 1 : 0);
    return result;
  }
}