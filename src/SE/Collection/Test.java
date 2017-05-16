package SE.Collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Garret on 06.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        List<String> myList = new MyList<>();
//        System.out.println(myList.isEmpty());
//        myList.add("Sasha");
//        System.out.println(myList.isEmpty());
//        System.out.println(myList.size());
//        myList.add("Denis");
//        System.out.println(Arrays.toString(myList.toArray()));
//        System.out.println(myList.size());
//        System.out.println(myList.contains("Sasha"));
//        System.out.println(myList.contains("Sasa"));
//        System.out.println(myList.remove("Sasha"));
//        System.out.println(Arrays.toString(myList.toArray()));
//        myList.clear();
//        System.out.println(myList.isEmpty());
        for (int i = 0;i<10;i++)
            myList.add("Object " + i);
        System.out.println(Arrays.toString(myList.toArray()));

        myList.add(4,"Sasha");
        System.out.println(Arrays.toString(myList.toArray()));

        List<String> newArr = new MyList<>();
        for (int i = 0;i<10;i++)
            newArr.add("New " + i);

        myList.addAll(newArr);
        System.out.println(Arrays.toString(myList.toArray()));
    }
}
