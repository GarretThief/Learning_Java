package OOP._2_12_Nested_Classes.testnest1;

import java.util.Arrays;
import java.util.Comparator;


public class MyPhoneBook {
    PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private static int i = 0;
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


    static class PhoneNumber{
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
            return  "Name: " + name + ".\n" +
                    "Phone: " + phone + ".\n";
        }




    }
}
