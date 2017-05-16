package OOP.labs_2_11;

public class Laba_2_11_3 {
  public static void main(String[] args) {
    final Person MARINA = new Person("Marina", 118);
  }
}// END of class<<

// CLASS PERSON->
class Person {
  private final String name;
  private final int age;

  // CONSTRUCTOR->
  Person(String name, int age) {
    isValid(age);
    this.name = name;
    this.age = age;
  }

  // VALIDATOR (method)->
  private void isValid(int age) {
    if (age < 1 || age > 110) throw new InvalidAgeException();
  }

  // GETTERS & SETTERS ->
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // EXCEPTION CLASS ->
  private class InvalidAgeException extends RuntimeException {

    private String message = "\nAre you drunk, bro?! " +
        "Age must be from 1 to 110 years!\n";

    @Override
    public String getMessage() {
      return "\ngetMessage(): \n" + message;
    }

/*    @Override
    public String toString() {
      return "\ntoString(): \n"+"InvalidAgeException: "+ message ;
    }*/
  }
}