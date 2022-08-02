public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    // 1 quest
    public static void task1() {
            byte money = 101;
            short volume = 27981;
            int age = 25;
            long yearDays = 365L;
            float mark = 4.8f;
            double pi = 3.1415926535;
            char dog = 64;
            boolean isAgeOld = age > 55;
        }

    // 2 quest
        public static void task2() {
            float weightBoxer1 = 78.2f, weightBoxer2 = 82.7f, summWeight = weightBoxer1 + weightBoxer2, diffWeight = weightBoxer2 - weightBoxer1;
            System.out.println("Общий вес " + summWeight + "\n" + "Разница " + diffWeight);
            System.out.println();
        }

    // 3 quest
        public static void task3() {
            int bananas = 5, milk = 2, iceCream = 2, eggs = 4, weightGr;
            weightGr = bananas * 80 + milk * 105 + iceCream * 100 + eggs * 70;
            System.out.println("Вес завтрака в граммах " + weightGr + " гр");
            float weightKg = (float) weightGr / 1000;
            System.out.println("Вес завтрака в киллограммах " + weightKg + " кг");
            System.out.println();
        }

        // 4 quest
    public static void task4() {
            int goal = 7000;
            int days_250 = goal / 250, days_500 = goal / 500;
            double average = (days_250 + days_500) / 2;
            System.out.println(days_250 + " дней уйдет, если сбрасыбвать по 250гр и " + days_500 + " дней потребуется, если сжигать по 500гр в день");
            System.out.println("В среднем постребуется " + average + " день");
            System.out.println();
        }

        // 5 quest
    public static void task5() {
        double percent = 0.1;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha + (int)(salaryMasha * percent);
        int newSalaryDenis = salaryDenis + (int)(salaryDenis * percent);
        int newSalaryKristina = salaryKristina + (int)(salaryKristina * percent);
        int difSalaryM = newSalaryMasha - salaryMasha;
        int difSalaryD = newSalaryDenis - salaryDenis;
        int difSalaryK = newSalaryKristina - salaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " + "Годовой доход вырос на " + difSalaryM * 12 + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " + "Годовой доход вырос на " + difSalaryD * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. " + "Годовой доход вырос на " + difSalaryK * 12 + " рублей.");
    }
}