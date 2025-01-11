import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число (a):");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число (b):");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        // Задание 2
        System.out.println("\nВведите первую строку (a):");
        scanner.nextLine(); // Очистка буфера после nextInt
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку (b):");
        String str2 = scanner.nextLine();

        // Сравнение строк
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Задание 3
        System.out.println("\nЧётные числа в массиве:");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
