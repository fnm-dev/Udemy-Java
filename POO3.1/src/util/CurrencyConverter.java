package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount){
        return dollarPrice * amount * (IOF+1);
    }
}
