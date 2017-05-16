package OOP.labs_2_12;

import java.util.Arrays;
import java.util.Comparator;

public class laba_1_MyPhoneBook implements Cloneable {
  private static Contact[] contacts = new Contact[11];
  private static int counter = 0;
  private static String[] names = {
      "Піддубецька Марина",
      "Шастун Богдан",
      "Руденко Олександр",
      "Бондар Дмитро",
      "Гармідер Артур",
      "Есипко Денис",
      "Загребельний Павло",
      "Смашнюк Юрій",
      "Суверток Олексій",
      "Павленко Олександр",
      "Крат Олександр"};

  private static String[] numbers = {
      "ZZZZZZZZZZZZ",
      "80980030525",
      "80979333893",
      "80630779133",
      "80635995230",
      "80953179169",
      "80633839208",
      "80987190986",
      "80633858698",
      "80638908965",
      "80638804175"};

  public static void main(String[] args) {

    Contact im = addNewContactToEmtyFieldArr("Mike", "+38-063-37sd443");
    System.out.println("Me: " + im);
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    System.out.println("ORIGINAL ARR in original mode:");
    // addAllContacts();
    printPhoneBook(contacts);
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    System.out.println("Sorted by names:");
    Contact[] numbersSortedByNames = sortByName(contacts);
    printPhoneBook(numbersSortedByNames);
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    System.out.println("Sorted by phone numbers:");
    Contact[] numbersSortedByNumbers = sortByPhoneNumber(contacts);
    printPhoneBook(numbersSortedByNumbers);

  }

  private static Contact addNewContactToEmtyFieldArr(String name, String number) {
    for (int i = 0; i < contacts.length; i++)
      if (contacts[i] == null) contacts[i] = new Contact("", "");
    return contacts[counter++] = new Contact(name, number);
  }

  private static void addAllContacts(/*String name, String phone*/) {
    for (int i = 0; i < contacts.length; i++)
      contacts[i] = new Contact(names[i], numbers[i]);
  }

  private static void printPhoneBook(Contact[] numbers) {
    for (Contact contact : numbers)
      System.out.print(contact);
  }

  private static Contact[] sortByName(Contact[] numbers) {
    Contact[] clonedNumbers = numbers.clone();
    Arrays.sort(clonedNumbers);
    return clonedNumbers;
  }

  private static Contact[] sortByPhoneNumber(Contact[] numbers) {
    Contact[] clonedNumbers = numbers.clone();
    Arrays.sort(clonedNumbers, new Comparator<Contact>() {
      @Override
      public int compare(Contact o1, Contact o2) {
        if (o1 == null || o2 == null) return -1;
        return o1.phone.compareTo(o2.getPhone());
      }
    });
    return clonedNumbers;
  }

  //__________________________________________________________________________________________________________________
//-------------------------------------------< CONTACT Class >-------------------------------------------------
//__________________________________________________________________________________________________________________
  static class Contact implements Comparable, Cloneable {
    final String name;
    final String phone;

    private Contact(String name, String phone) {
      this.name = name;
      this.phone = phone;
    }

    public String getName() {
      return name;
    }

    public String getPhone() {
      return phone;
    }

    @Override
    public String toString() {
      if (name.length()<1 || phone.length()<1) return"";
      return "\nname='" + name + '\'' +
          ", phone='" + phone;
    }

    @Override
    public int compareTo(Object inputObject) {
      if (this == null || inputObject == null) return -1;
      return this.name.compareTo(((Contact) inputObject).name);
    }
  }
}