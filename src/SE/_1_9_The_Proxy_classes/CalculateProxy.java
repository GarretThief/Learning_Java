package SE._1_9_The_Proxy_classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Garret on 27.04.2017.
 */
public class CalculateProxy implements InvocationHandler{
    Object objCalc;

    public CalculateProxy(Object objCalc) {
        this.objCalc = objCalc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("The method <" + method.getName() + "> invoked with arg:" + Arrays.toString(args));
        Object result = method.invoke(objCalc, args);
        System.out.println("The method <" + method.getName() + "> ends with result:" + result.toString());
        return result;
    }
}
