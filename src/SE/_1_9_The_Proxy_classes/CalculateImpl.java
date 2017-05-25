package SE._1_9_The_Proxy_classes;

/**
 * Created by Garret on 27.04.2017.
 */
public class CalculateImpl implements Calculate {
    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public double division(int a, int b) {
        if (b != 0) return a/b;
        else return -1;
    }
}
