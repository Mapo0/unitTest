package calculate;

import java.util.Scanner;

public class Calculate {
    int num1 =getInt();
    int num2 = getInt();
    char operation = getOperation();
    int result = calculate(num1,num2,operation);
    Scanner scanner = new Scanner(System.in);

    private int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("введите заново");
            scanner.next();
            num = getInt();
        }
        return num;
    }

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

    public int calculate(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("введите операцию заново");
                result = calculate(num1, num2, getOperation());

        }

        return result;
    }


}
