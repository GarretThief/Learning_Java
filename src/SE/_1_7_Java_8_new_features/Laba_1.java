package SE._1_7_Java_8_new_features;

import java.util.*;
import java.util.function.Predicate;

public class Laba_1 {
    public static void main(String[] args) {
        Integer[] myArray = new Random().ints(20,1,100).boxed().toArray(Integer[]::new);
        Arrays.sort(myArray, (a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(myArray));

        List<String> myList = Arrays.asList("Java","C#","Fortran","Ada","Modula","Python","Javascript");
        Collections.sort(myList,(a,b) -> b.compareTo(a));
        System.out.println(myList);

       // sumEven(myArray, (t) -> t + sum);

        //Laba 3
        updateList(myList, s -> s.toUpperCase());

    }
    static void sumEven(Integer[] array, Predicate<Integer> predicate){
        int sum = 0;
        for (Integer val : array)
            predicate.test(val);
    }

    static void updateList (List<String> list, MyConverter converter){
        for (String str : list) {
            if (MyConverter.isNull(str))
                System.out.println("String is Null");
            else
                System.out.println(converter.convertStr(str));
        }

    }

}
