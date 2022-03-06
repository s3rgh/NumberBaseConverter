package converter;

import java.util.Scanner;

public class UserInterface {

    public String inputConvertType(Scanner scanner) {
        System.out.println("\nDo you want to convert /from decimal or /to decimal? (To quit type /exit) ");
        return scanner.nextLine();
    }

    public String readNumber(Scanner scanner) {
        return scanner.nextLine();
    }
}
