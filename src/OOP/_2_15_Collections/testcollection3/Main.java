package OOP._2_15_Collections.testcollection3;

import java.util.*;

/**
 * 1) Add to method main() code to create both an ArrayList and LinkedList (of String parameter type),
 * and fill each in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 * Print each list using an ordinary Iterator.
 * 2) Then insert one list (ArrayList) into the other (LinkedList) by using an ListIterator, inserting at every other location.
 * 3) Now perform the insertion elements of the first list in reverse order,
 * moving through the element from end to beginning in the second list.
 * 4) Write a static method printElements() that uses an Iterator to step through an Collection
 * and print the each element value in the container.
 */
public class Main {
    static void printElements(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();
        for (int i = 0;i<10;i++){
            arrList.add("numOfArrayList_"+i);
            linkList.add("numOfLinkedList_"+i);
        }


        ListIterator<String> iteratorArray = arrList.listIterator(linkList.size());
        while (iteratorArray.hasPrevious())
            linkList.add(iteratorArray.previous());
 //     linkList.forEach(System.out::println);
        printElements(linkList.iterator());

    }
}
