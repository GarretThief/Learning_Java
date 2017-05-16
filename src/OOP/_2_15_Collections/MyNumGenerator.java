package OOP._2_15_Collections;

import java.util.*;

/**
 * Created by Garret on 11.03.2017.
 */
public class MyNumGenerator {
    int numOfElem,maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public void gererate(){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        while (list.size()<numOfElem)
            list.add(rand.nextInt(maxNumb));
        System.out.println(list);
    }

    public void generateDistinct(){
        Set<Integer> setInt = new HashSet<>();
        Random rand = new Random();
        while (setInt.size()<numOfElem)
            setInt.add(rand.nextInt(maxNumb));
        System.out.println(setInt);
    }
}
