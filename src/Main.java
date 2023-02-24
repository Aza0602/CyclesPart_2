import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

    public static void task3() {
        System.out.println("Задача 3");

        int y = 12_000_000;
        int people = 1000;
        int fertility = 17;
        int mortality = 8;
        int firstYear = 1;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        while (firstYear <= 10) {
            y += y * fertility /people - y * mortality / people;
            System.out.println("«Год " + firstYear + ", численность населения составляет " + numberFormat.format(y)  + "».");
            firstYear++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        int result = 12_000_000;
        double deposit = 15_000;
        int month = 1;
        double percent = 0.07;
        while (deposit <= result) {
            deposit = deposit * (1 + percent);

            System.out.println("«Месяц " + month + ", сумма накоплений равна " + numberFormat.format((int) deposit) + " рублей».");
            month++;

        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        int result = 12_000_000;
        double deposit = 15_000;
        int month = 1;
        double percent = 0.07;
        while (deposit <= result) {
            deposit = deposit * (1 + percent);
            if (month % 6 == 0) {
                System.out.println("«Месяц " + month + ", сумма накоплений равна " + numberFormat.format((int) deposit) + " рублей».");
            }
            month++;

        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        double deposit = 15_000;
        int months = 12 * 9;
        int month = 1;
        double percent = 0.07;
        while (month <= months) {
            deposit = deposit * (1 + percent);
            if (month % 6 == 0) {
                System.out.println("«Месяц " + month + ", сумма накоплений равна " + numberFormat.format((int) deposit) + " рублей».");
            }
            month++;

        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int firstFriday = 3;
        while (firstFriday <= 31) {
            System.out.println("«Сегодня пятница, " + firstFriday +"-е число. Необходимо подготовить отчет».");
            firstFriday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int firstYear = 0;
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year < end; year++) {
            if (year % period == firstYear) {
                System.out.println(year);
            }
        }
    }

}

