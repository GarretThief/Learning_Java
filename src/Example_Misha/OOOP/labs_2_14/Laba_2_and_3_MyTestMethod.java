package OOP.labs_2_14;

import static OOP.labs_2_14.Laba_2_and_3_MyTestMethod.calcNum;
import static OOP.labs_2_14.Laba_2_and_3_MyTestMethod.calcSum;

class Laba_2_and_3_MyTestMethod {
  // METHOD ->
  static <T extends Comparable<T>> int calcNum(T[] arr, T elem) {
    int count = 0;
    for (T anArr : arr)
      if (anArr.compareTo(elem)>0) count++;
    return count;
  }

  static <T extends Number> Float calcSum(T[] arr, T max) {
    Float sum = 0f;
    for (T element : arr) if (element.floatValue() > max.floatValue()) sum += element.floatValue();
    return sum;
  }
}

class Main {  // MAIN ->
  public static void main(String[] args) {

    Integer[] intARR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Double[] doubleARR = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

// LABA 2 ->
    int countBiggerInt = calcNum(intARR, 3);
    int countBiggerDouble = calcNum(doubleARR, 6.4);
    System.out.printf("\n%s %3d", "Number of elements that are greater than '3' -> ", countBiggerInt);
    System.out.printf("\n%s %1d", "Number of elements that are greater than '6.4' -> ", countBiggerDouble);

// LABA 3 ->
    float countBiggerThenInt = calcSum(intARR, 3);
    float countBiggerThenFloat = calcSum(doubleARR, 3);
    System.out.printf("\n\n%s %.0f", "Number of elements that are greater than '3' -> ", countBiggerThenInt);
    System.out.printf("\n%s %.1f", "Number of elements that are greater than '3' -> ", countBiggerThenFloat);

  }
}