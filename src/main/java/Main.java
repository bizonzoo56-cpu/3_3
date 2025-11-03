import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość trójkąta: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj znak (lub naciśnij Enter, żeby użyć '*'): ");
        String znak = scanner.nextLine();
        if (znak.isEmpty()) znak = "*";

        if (n <= 0) {
            System.out.println("Wysokość musi być większa niż 0.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }

        scanner.close();
    }
}
