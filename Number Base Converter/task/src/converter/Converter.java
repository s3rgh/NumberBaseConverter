package converter;

import java.math.BigInteger;

public class Converter {
    public String convert(String number, String sourceBase, String targetBase) {
        return new BigInteger(number, Integer.parseInt(sourceBase)).toString(Integer.parseInt(targetBase));
    }

    public String convertWithFractional(String number, String sourceBase, String targetBase) {
        String[] fractionalNumber = number.split("[.,]");
        String integerPart;
        integerPart = convert(fractionalNumber[0], sourceBase, targetBase);
        double decimalFractionalPart = convertFractionalPartIntoDecimal(number, Integer.parseInt(sourceBase));
        String fractionalPartDecimal = convertFractionalPartFromDecimalIntoNewBase(decimalFractionalPart, Integer.parseInt(targetBase));
        return integerPart + "." + fractionalPartDecimal;
    }

    public static double convertFractionalPartIntoDecimal(String number, int sourceBase) {
        String[] fractionalDigits = number.split("[,.]")[1].split("");
        double decimalValue = 0;
        for (int i = 0; i < fractionalDigits.length; i++) {
            decimalValue = decimalValue + (convertLettersToNumber(fractionalDigits[i])) / Math.pow(sourceBase, i + 1);
        }
        return decimalValue;
    }

    public static String convertFractionalPartFromDecimalIntoNewBase(double number, int newBase) {
        StringBuilder newBaseFractionalPart = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int tempIntNum = (int) (number * newBase);
            double tempDoubleNum = (number * newBase) - tempIntNum;
            newBaseFractionalPart.append(convertNumberToLetters(String.valueOf(tempIntNum)));
            number = tempDoubleNum;
        }
        return newBaseFractionalPart.toString();
    }

    public static String convertNumberToLetters(String letter) {
        switch (letter) {
            case "10":
                return "a";
            case "11":
                return "b";
            case "12":
                return "c";
            case "13":
                return "d";
            case "14":
                return "e";
            case "15":
                return "f";
            case "16":
                return "g";
            case "17":
                return "h";
            case "18":
                return "i";
            case "19":
                return "j";
            case "20":
                return "k";
            case "21":
                return "l";
            case "22":
                return "m";
            case "23":
                return "n";
            case "24":
                return "o";
            case "25":
                return "p";
            case "26":
                return "q";
            case "27":
                return "r";
            case "28":
                return "s";
            case "29":
                return "t";
            case "30":
                return "u";
            case "31":
                return "v";
            case "32":
                return "w";
            case "33":
                return "x";
            case "34":
                return "y";
            case "35":
                return "z";
            default:
                return letter;
        }
    }

    public static int convertLettersToNumber(String letter) {
        switch (letter) {
            case "a":
                return 10;
            case "b":
                return 11;
            case "c":
                return 12;
            case "d":
                return 13;
            case "e":
                return 14;
            case "f":
                return 15;
            case "g":
                return 16;
            case "h":
                return 17;
            case "i":
                return 18;
            case "j":
                return 19;
            case "k":
                return 20;
            case "l":
                return 21;
            case "m":
                return 22;
            case "n":
                return 23;
            case "o":
                return 24;
            case "p":
                return 25;
            case "q":
                return 26;
            case "r":
                return 27;
            case "s":
                return 28;
            case "t":
                return 29;
            case "u":
                return 30;
            case "v":
                return 31;
            case "w":
                return 32;
            case "x":
                return 33;
            case "y":
                return 34;
            case "z":
                return 35;
            default:
                return Integer.parseInt(letter);
        }
    }
}
