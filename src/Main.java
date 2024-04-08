public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 02
        System.out.println("Task 02");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Task 03
        System.out.println("Task 03");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        //Task 04
        System.out.println("Task 04");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 05
        System.out.println("Task 05");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.printf("%s год является високосным%n", i);
        }

        //Task 06
        System.out.println("Task 06");
        for (int i = 1; i < 15; i++) {
            System.out.printf("%s ", i * 7);
        }
        System.out.println();

        //Task 07
        System.out.println("Task 07");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        //Task 08
        System.out.println("Task 08");
        int salary = 29000;
        int totalIncome = 0;
        for (int i = 1; i <= 12; i++) {
            totalIncome = totalIncome + salary;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", i, totalIncome);
        }

        //Task 09
        System.out.println("Task 09");
        double totalIncome2 = 0;
        for (int i = 1; i <= 12; i++) {
            totalIncome2 = totalIncome2 + (totalIncome2 / 100);
            totalIncome2 = totalIncome2 + salary;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей%n", i, totalIncome2);
        }

        //Task 10
        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2*%s=%s%n", i, i * 2);
        }
    }
}
