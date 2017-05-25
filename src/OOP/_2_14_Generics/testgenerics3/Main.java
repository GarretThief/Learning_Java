package OOP._2_14_Generics.testgenerics3;

import java.util.Arrays;

/**
 * Created by Garret on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        String[] arrOfString = {"one","two","three","four","five","six","seven","eight","nine"};
        MyMixer<?> mixer = new MyMixer<>(array);
        System.out.println(Arrays.toString(mixer.shuffle()));
        MyMixer<?> mixerStr = new MyMixer<>(arrOfString);
        System.out.println(Arrays.toString(mixerStr.shuffle()));
    }
}
