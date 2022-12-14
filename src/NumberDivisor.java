import java.util.Scanner;

public class NumberDivisor {
    public static void main(String[] args) {
        // Задача №340. Делители числа

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
