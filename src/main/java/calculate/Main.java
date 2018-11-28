package calculate;

import static calculate.Calculate.calculate;
import static calculate.Calculate.getInt;
import static calculate.Calculate.getOperation;

public class Main {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calculate(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
}
