package OOP._2_14_Generics;



public class Main {
    public static void main(String[] args) {
        MyTuple <String,Integer,Long> mt1 = new MyTuple<>("stringa",99,999999999L);
        MyTuple <Double,String,String> mt2 = new MyTuple<>(5.5,"stringa1","stringa2");
        System.out.println(mt1);
        System.out.println(mt2);


        Integer[] arrOfInt = {0,1,2,3,4,5,6,7,8,9};
        Double[] arrOfDouble = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.print("Number of elements are greater than 3: -> ");
        System.out.println(MyTestMethod.calcNum(arrOfInt, 3));
        System.out.print("Number of elements are greater than 3: -> ");
        System.out.println("\n"+MyTestMethod.calcNum(arrOfDouble, 3.0));

        System.out.print("Sum of elements are greater than 3: -> ");
        System.out.println(MyTestMethod.calcSum(arrOfInt, 3));
        System.out.print("Sum of elements are greater than 3: -> ");
        System.out.printf("%.1f \n",MyTestMethod.calcSum(arrOfDouble, 3.0));
    }
}
