package OOP._2_12_Nested_Classes.testnest1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Garret on 01.03.2017.
 */
public class MyPhone {
    private static int i = 0;
    MyPhoneBook.PhoneNumber[] phoneNumbers = new MyPhoneBook.PhoneNumber[10];
    public void switchOn(){
        System.out.print("Loading PhoneBook records...");
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
        System.out.println(" OK!");
    }

    public void call(int index){
        System.out.println("Calling to: " + phoneNumbers[index]);
    }


    class MyPhoneBook {

        public void addPhoneNumber (String name, String phone){
            phoneNumbers[i] = new PhoneNumber(name, phone);
            i++;
        }
        public void printPhoneBook (){
            for (PhoneNumber numbers : phoneNumbers) {
                System.out.println(numbers);
            }
        }

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
        }


        class PhoneNumber{
            String name, phone;

            public PhoneNumber(String name, String phone) {

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
                return  "Name: " + name +
                        ", phone: " + phone + ".\n";
            }
        }
    }

    class Camera{

    }
    class Bluetooth{

    }
    class MemoryCard{

    }
    class SimCard{

    }
    class PowerOnButton{

    }
    class HeadPhones{

    }
    class PhoneBattery{

    }
    class PhoneCharger{

    }
    class PhoneDisplay{

    }
    class PhoneSpeaker{

    }
}
