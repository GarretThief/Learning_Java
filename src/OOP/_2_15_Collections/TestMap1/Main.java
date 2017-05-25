package OOP._2_15_Collections.TestMap1;

import java.util.Scanner;

/**
 * Created by Garret on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyTranslator translator = new MyTranslator();
        translator.addNewWord("cat", "кот");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("mouse", "мышь");
        Scanner scan = new Scanner(System.in);
        String splitOfStr = scan.nextLine();

        translator.translate(splitOfStr.split(" "));
    }
}
