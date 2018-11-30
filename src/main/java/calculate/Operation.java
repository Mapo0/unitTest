package calculate;

import java.util.Scanner;

public class Operation {
    Scanner scanner = new Scanner(System.in);
    private char getOperation() {
        System.out.println("Выберите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("введите заново операцию");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

}
