package converter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {

    public List<String> inputBasesOrExit(Scanner scanner) {
        System.out.println("\nEnter two numbers in format: {source base} {target base} (To quit type /exit) ");
        return Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
    }

    public String readNumberOrBack(Scanner scanner, String sourceBase, String targetBase) {
        System.out.println("\nEnter number in base " + sourceBase +
                " to convert to base " + targetBase + " (To go back type /back) ");
        return scanner.nextLine();
    }

    public void outputResult(String result) {
        System.out.println("Conversion result: " + result);
    }
}
