public class Main {
    public static void main(String[] args) {


        int finalSum = 2_459_000;
        int deposit = 15_000;
        double sum = 0;
        int month = 1;

        while (sum <= finalSum) {
            sum += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }


        System.out.println();
        int n = 1;
        while (n <= 10) {
            System.out.print(n++ + " ");
        }
        System.out.println();
        for (int i=10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();



        System.out.println();
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        int currentYear = 2024;
        for (int y = currentYear + 1; y <= currentYear + years; y++) {
            population += (birthRate - deathRate) * population/1000;
            System.out.println("Год " + y + ", численность населения равна " + population);
        }


        System.out.println();
        sum = deposit;
        double percent = 7 / 100D;
        finalSum = 12_000_000;
        month = 0;
        while (sum <= finalSum) {
            month++;
            sum += sum * percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + Math.round(sum) + " рублей");
        }


        System.out.println();
        sum = deposit;
        month = 0;
        while (sum <= finalSum) {
            month++;
            sum += sum * percent;
            if (month%6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + Math.round(sum) + " рублей");
            }
        }


        System.out.println();
        sum = deposit;
        month = 0;
        int months = 9*12;
        while (month <= months) {
            month++;
            sum += sum * percent;
            if (month%6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + Math.round(sum) + " рублей");
            }
        }


        System.out.println();
        int firstFriday = 1;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }


        System.out.println();
        int beginRange = currentYear - 200;
        int endRange = currentYear + 100;
        int cometYear = 79;
        for (int year = beginRange; year <= endRange; year++) {
            if (year%cometYear == 0) {
                System.out.println(year);
            }
        }
    }
}