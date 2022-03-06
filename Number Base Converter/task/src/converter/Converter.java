package converter;

public class Converter {
    public String convertFrom(String number, String base) {
        return Integer.toString(Integer.parseInt(number), Integer.parseInt(base));
    }

    public String convertTo(String number, String base) {
        return Integer.toString(Integer.parseInt(String.valueOf(number), Integer.parseInt(base)), 10);
    }
}
