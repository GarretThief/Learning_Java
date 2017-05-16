package OOP._2_9_String_processing.testsregexp;

import java.util.regex.Pattern;

/**
 * Created by Garret on 21.02.2017.
 */
public class Main {

    public static boolean checkPersonWithRegExp(String userNameString){
        String pattern = "[A-Z][a-z]+";

        return userNameString.matches(pattern);
    }

    public static void main(String[] args) {

        String[]arrOfStrings = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String str: arrOfStrings) {
            System.out.println(str + " = " + checkPersonWithRegExp(str));
        }
    }
}
