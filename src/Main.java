import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int accumulation = 2_459_000;
        int sum = 0;
        int firstMonth = 15_000;
        int month = 1;
        while (sum <= accumulation) {
            sum = sum + firstMonth;
            System.out.println("«Месяц " + month + ", сумма накоплений равна " + sum + " рублей».");
            month++;
        }

    }

    public static void task2() {
        System.out.println("Задача 2");

        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



}

