package SE._1_7_Java_8_new_features.testStreams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static public void initPersons(){

}
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200);
        List<Integer> listOfInt = stream.limit(10).collect(Collectors.toList());
        System.out.println(listOfInt);

        Stream<String> stringStream = Stream.of("AAAA", "BBBBBB","CCCC", "DDDDDD", "CCDD");
        List<String> stringList = stringStream.filter(e -> e.matches("C[A-Z]+")).collect(Collectors.toList());
        System.out.println(stringList);

        Person person1 = new Person("Valera", "male", 19);
        Person person2 = new Person("Valera", "male", 17);
        Person person3 = new Person("Valera", "male", 29);
        Person person4 = new Person("Valera", "female", 7);
        Stream<Person> personStream = Stream.of(person1,person2,person3,person4);
        List<Person> personList = personStream.filter(e -> e.getAge()>18).collect(Collectors.toList());//.forEach(System.out::println);
       // personList.forEach(System.out::println);
        System.out.println(personList);

    }
}
