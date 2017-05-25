package OOP._2_14_Generics.testgenerics3;

/*
 * 1) Create a generic class MyMixer<T> with field as array of some type, provide constructor with one parameters.
 * Add to MyMixer public shuffle() method which shuffle elements of array and return it;
 * 2) Add to method main() code that creates two array of different types:
 * First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
 * Second one is array of String: {“one”,”two”, …}
 * 3) Create two objects of MyMixer type and using each of arrays, invoke shuffle() method and print result to console.
 */

public class MyMixer <T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }
    public T[] shuffle (){
        T tmp;
        for (int i = 0; i<array.length -1; i++) {
            if (i % 2 == 0) {
                tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
        return array;
    }
}
