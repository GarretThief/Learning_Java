package OOP._2_18_Core_Java_Classes.testcore3;

import sun.util.resources.ru.CurrencyNames_ru_RU;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Garret on 26.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("2430000000000000");
        Locale locale = Locale.ITALY;//new Locale("ru", "RU");
        System.out.println("Current Locale: " + locale.getDisplayName());

        System.out.println("Integer: " + money);

        Currency currency = Currency.getInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + currency.getDisplayName() + ": "+ currencyFormat.format(money));

        Date date = new Date();
        System.out.println(date.toLocaleString());
    }
}
