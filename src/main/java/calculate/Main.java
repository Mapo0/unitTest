package calculate;


public class Main {

    private static Calculate calculate=new Calculate();

    public static void main(String[] args) {
        int num1 =calculate.getInt();
        int num2 = calculate.getInt();
        char operation = calculate.getOperation();
        int result = calculate.calculate(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
}
