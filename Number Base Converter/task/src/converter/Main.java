package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in decimal system: ");
        String number = scanner.nextLine();
        System.out.println("Enter target base: ");
        String base = scanner.nextLine();
        System.out.println("Conversion result: " + Converter.convert(number, Integer.parseInt(base)));
    }
}
