package OOP._2_18_Core_Java_Classes.testcore2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal nailPrice = new BigDecimal("0.1");
        BigDecimal money = new BigDecimal("1.0");
        shopping(nailPrice,money);
    }

    static void shopping(BigDecimal nailPrice, BigDecimal money){
        int i = 0;
        while (money.compareTo(BigDecimal.ZERO) > 0){
            money = money.subtract(nailPrice);
            nailPrice = nailPrice.add(BigDecimal.valueOf(0.1));
            i++;
        }
        System.out.println(i + " items bought.");
        System.out.println("Money left over: $" + money);
    }
}
