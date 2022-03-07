package converter;

import java.math.BigInteger;

public class Converter {
    public String convert(String number, String sourceBase, String targetBase) {
        return new BigInteger(number, Integer.parseInt(sourceBase)).toString(Integer.parseInt(targetBase));
    }
}
