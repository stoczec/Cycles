package FuckingInformatics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        // Задача №335. Квадраты

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i * i <= b) {
                System.out.print(i * i + " ");
            }else System.out.print("");
        }
    }
}
