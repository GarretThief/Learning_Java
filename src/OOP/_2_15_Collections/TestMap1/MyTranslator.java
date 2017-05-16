package OOP._2_15_Collections.TestMap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Garret on 11.03.2017.
 */
public class MyTranslator {
    Map<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru){
        dictionary.put(en,ru);
    }
    public void translate(String[] en){
        for (String elem : en) {
            System.out.print(dictionary.get(elem) + " ");
        }
    }
}
