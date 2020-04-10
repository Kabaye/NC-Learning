package utils.utils;

public class MoneyUtils {
    private MoneyUtils() {
    }

    public static Float convertToDBPrecision(Float money) {
        return money * 1000;
    }

    public static Float convertFromDbPrecision(Float money) {
        return money / 1000;
    }
}