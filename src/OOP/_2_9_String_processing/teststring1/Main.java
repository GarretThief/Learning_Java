package OOP._2_9_String_processing.teststring1;

/**
 * * Find the index of first “ra” substring of myStr value and print result to console.
 * * Find the index of last “ra” substring of myStr value and print result to console.
 * * Get substring of myStr from 3 to 7 char index and print result to console.
 * * Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
 * * Invoke reverseString() method with myStr argument and print result to console.
 * Created by Garret on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
//        int iFirstRa = myStr.indexOf("ra");
//        int iLastRa = myStr.lastIndexOf("ra");
//        System.out.println(iFirstRa + " " + iLastRa);
//        System.out.println(myStr.substring(iFirstRa));
//        System.out.println(myStr.substring(iLastRa));
//        System.out.println(myStr.substring(3,7));
        System.out.println(reverseString(myStr));

    }
    static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
