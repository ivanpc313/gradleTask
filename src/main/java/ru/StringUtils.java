package ru;
import org.apache.commons.lang3.math.Fraction;

public class StringUtils {

    public StringUtils() {
    }

    public static Fraction isPositiveNumber(String str) {
        return Fraction.getFraction(str);
    }

}