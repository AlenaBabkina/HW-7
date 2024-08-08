public class Main {

    public static void main(String[] args) {

        {
            System.out.println("Задача 1");
            int month = 0;
            int i = 0;
            while (i < 2_459_000) {
                i += 15_000;
                month += 1;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + i + " рублей");
            }
        }
        {
            System.out.println("Задача 2");
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println("Задача 3");
            int y = 12_000_000;
            int fertility = 17;
            int mortality = 8;
            for (int i = 1; i <= 10; i++) {
                y = y + (fertility - mortality) * y / 1000;
                System.out.println("Год " + i + ", численность населения составляет " + y);
            }
        }
        {
            System.out.println("Задача 4");
            int deposit = 15_000;
            int month = 1;
            while (deposit < 12_000_000) {
                deposit = deposit + (int) (deposit * 0.07);
                System.out.println("Месяц " + month + ", сумма: " + deposit);
                month++;
            }
        }
        {
            System.out.println("Задача 5");
            int deposit = 15_000;
            int month = 1;
            while (deposit < 12_000_000) {
                deposit = deposit + (int) (deposit * 0.07);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма: " + deposit);
                }
                month++;
            }
        }
        {
            System.out.println("Задача 6");
            int deposit = 15_000;
            for (int i = 1; i < 9 * 12; i++) {
                deposit = deposit + (int) (deposit * 0.07);
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма: " + deposit);
                }
            }
        }
        {
            System.out.println("Задача 7");
            for (int i = 5; i < 31; i += 7) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        {
            System.out.println("Задача 8");
            for (int year = 0; year < 2024 + 100; year += 79) {
                if (year >= 2024 - 200) {
                    System.out.println(year);
                }
            }
        }

    }
}