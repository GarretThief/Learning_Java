package OOP._2_12_Nested_Classes.testnest1;

/**
 * Created by Garret on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "0639999999");
        myPhoneBook.addPhoneNumber("Ivan", "0632222222");
        myPhoneBook.addPhoneNumber("Mari", "0631111111");
        myPhoneBook.addPhoneNumber("Vova", "0634444444");
        myPhoneBook.addPhoneNumber("Serhiy", "0637777777");
        myPhoneBook.addPhoneNumber("Vadim", "0635555555");
        myPhoneBook.addPhoneNumber("Olga", "0636666666");
        myPhoneBook.addPhoneNumber("Alex", "0638888888");
        myPhoneBook.addPhoneNumber("Pavel", "0633333333");
        myPhoneBook.addPhoneNumber("Boris", "0630000000");
//        myPhoneBook.printPhoneBook();

//        myPhoneBook.sortByName();
//        myPhoneBook.printPhoneBook();

        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();
    }
}
