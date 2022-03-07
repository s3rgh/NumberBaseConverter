package converter;

import java.util.List;
import java.util.Scanner;

public class Runner {

    private final Converter converter = new Converter();
    private final UserInterface userInterface = new UserInterface();

    public void run(Scanner scanner) {

        String number;
        String result = "";

        while (true) {
            List<String> type = userInterface.inputBasesOrExit(scanner);
            if (type.size() != 2 && type.get(0).equals("/exit")) {
                break;
            } else {
                while (true) {
                    number = userInterface.readNumberOrBack(scanner, type.get(0), type.get(1));
                    if (number.equals("/back")) {
                        break;
                    } else {
                        result = converter.convert(number, type.get(0), type.get(1));
                    }
                    userInterface.outputResult(result);
                }
            }
        }
    }
}
