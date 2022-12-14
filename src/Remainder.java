import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        // Задача №334. Остаток
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
