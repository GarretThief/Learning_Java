package SE._1_7_Java_8_new_features;

/**
 * Created by Garret on 15.05.2017.
 */
@FunctionalInterface
public interface MyConverter {
     String convertStr (String str);

     static boolean isNull(String str){
         return str == null;
     }
}
