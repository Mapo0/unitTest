package calculate;

import java.util.Scanner;

public class Enter {
    Scanner scanner = new Scanner(System.in);

    private    int getInt() {
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
}
