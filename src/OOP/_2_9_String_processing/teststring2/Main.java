package OOP._2_9_String_processing.teststring2;


import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringTokenizer token = new StringTokenizer(myStr1,myStr2);
        do {
            System.out.println(token.nextElement());
        }while (token.hasMoreElements());
    }
}
