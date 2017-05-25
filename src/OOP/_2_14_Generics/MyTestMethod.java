package OOP._2_14_Generics;

/*
 * Laba 2
 * 1) Create class MyTestMethod with generic static method calcNum
 * (with two parameters: an array T[] and variable maxElem of type T)
 * that counts the number of elements in an array T[] that are greater than a specified element maxElem.
 * 2) Add to method main() code that creates two array,
 * first – array of Integer type and second – array of Double type.
 * Fill these arrays with some random values.
 * Add code to counts the number of elements in each of arrays that are greater than a specified element
 * by invoking calcNum() static method.
 *
 * Laba 3
 * 1) Rewrite a class MyTestMethod to add new generic static method calcSum
 * (with two parameters: an array T[] and variable maxValue of type T) that calc sum of the number of elements
 * in an array T[] that are greater than a specified value maxValue.
 * 2) Add to method main() code that creates two array, first – array of Integer type and second – array of Double type.
 * Fill these arrays with some random values.
 * Add code to counts the total sum of elements in each of arrays, that are greater than a specified element
 * by invoking calcSum() static method.
 */

public class MyTestMethod  {
    static <T extends Comparable<T>> int calcNum (T[]array, T maxElem){
        int count = 0;
        for (T elem : array) {
            if(elem.compareTo(maxElem) > 0)
                count++;
        }
        return count;
    }

    static <T extends Number> Float calcSum (T[] arr, T max){
        Float sum = 0f;
        for (T elem : arr) {
            if (elem.floatValue() > max.floatValue())
                sum += elem.floatValue();
        }
        return sum;
    }
}
