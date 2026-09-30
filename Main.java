import java.util.Scanner;

public class Main {
    public static String convertToBase(int number, int base) {
        char[] digits = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        String result = "";

        while (number > 0) {
            int remainder = number % base;
            result = digits[remainder] + result;
            number /= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть цiле позитивне число: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Помилка: потрiбно ввести цiле число.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Помилка: число повинно бути позитивним.");
            scanner.close();
            return;
        }

        System.out.println("Двiйкова система: " + convertToBase(number, 2));
        System.out.println("Вiсiмкова система: " + convertToBase(number, 8));
        System.out.println("Шiстнадцяткова система: " + convertToBase(number, 16));

        scanner.close();
    }
}
