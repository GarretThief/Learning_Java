package OOP._2_9_String_processing.teststring3;

import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Pattern;

/**
 * Created by Garret on 21.02.2017.
 */
public class Main {

    static char[] uniqueChars(String s){
        int count = 0;
        char[]arrOfChar = s.toCharArray();
        char[]newArr = new char[arrOfChar.length];

        for (int i = 0; i<arrOfChar.length; i++)
            for (int j = 0;j<arrOfChar.length; j++){
                if (i==j) continue;
                else if (arrOfChar[i] == arrOfChar[j]) break;
                else if (j == arrOfChar.length-1){
                    newArr[count] = arrOfChar[i];
                    count ++;
                    break;
                }
            }
        return newArr;
    }

    public static void main(String[] args) {

    String str1 = "Using methods of class String";
        System.out.println(uniqueChars(str1));

    }
}
