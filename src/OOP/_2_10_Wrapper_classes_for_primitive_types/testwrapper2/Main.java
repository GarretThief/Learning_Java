package OOP._2_10_Wrapper_classes_for_primitive_types.testwrapper2;

/**
 * Created by Garret on 21.02.2017.
 */
public class Main {

    static Long compute (Byte by, Integer in){
        return new Long (by+in);
    }

    public static void main(String[] args) {
        Long res = compute((byte)30,220);
        System.out.println(res);

        assert (compute((byte) 30,220) instanceof Long);
    }
}
