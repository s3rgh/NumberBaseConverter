package converter;

public class Converter {
    public static String convert(String number, Integer base) {
        return Integer.toString(Integer.parseInt(number), base);
    }
}
