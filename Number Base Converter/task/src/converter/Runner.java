package converter;

import java.util.Scanner;

public class Runner {

    private final Converter converter = new Converter();
    private final UserInterface userInterface = new UserInterface();

    public void run(Scanner scanner) {

        String number;
        String base;
        String result = "";

        while (true) {
            String type = userInterface.inputConvertType(scanner);
            if (type.equals("/exit")) {
                break;
            }

            if (type.equals("/from")) {
                System.out.println("Enter a number in decimal system: ");
                number = userInterface.readNumber(scanner);
                System.out.println("Enter the target base: ");
                base = userInterface.readNumber(scanner);
                result = converter.convertFrom(number, base);
                System.out.println("Conversion result: " + result);
            }

            if (type.equals("/to")) {
                System.out.println("Enter source number: ");
                number = userInterface.readNumber(scanner);
                System.out.println("Enter source base: ");
                base = userInterface.readNumber(scanner);
                result = converter.convertTo(number, base);
                System.out.println("Conversion to decimal result: " + result);
            }
        }
    }
}
