import methods.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods= new Methods();


        System.out.println("\n Сумма строк");
        String str = methods.summStr("sad", "boy" );
        System.out.println(str);

        System.out.println("\n Факториал 5 ");
        System.out.println(methods.factorial());
    }

}
