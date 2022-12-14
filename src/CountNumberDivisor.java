import java.util.Scanner;

public class CountNumberDivisor {
    public static void main(String[] args) {
        // Задача №341. Количество делителей

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int count = 0;
        if (x % 2 == 0) {
            for (int i = 1; i <= x / 2; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            System.out.print(count + 1);

        } else if (x % 2 == 1) {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            System.out.print(count);
        }

    }
}