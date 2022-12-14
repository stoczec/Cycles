package FuckingInformatics;

import java.util.Scanner;

public class MinDivisor {
    public static void main(String[] args) {
        // Задача №339. Минимальный делитель

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                System.out.print(i);
                break;
            }
        }
    }
}
