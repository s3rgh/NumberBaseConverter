package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runner runner = new Runner();
        runner.run(scanner);
        scanner.close();
    }
}
