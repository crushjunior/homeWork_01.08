public class Main {
    public static void main(String[] args) {
    // 1 quest

        byte money = 101;
        short volume = 27981;
        int age = 25;
        long yearDays = 365L;
        float mark = 4.8f;
        double pi = 3.1415926535;
        char dog = 64;
        boolean isAgeOld = age > 55;

    // 2 quest

       float weightBoxer1 = 78.2f, weightBoxer2 = 82.7f, summWeight = weightBoxer1 + weightBoxer2, diffWeight = weightBoxer2 - weightBoxer1;
       System.out.println("Общий вес " + summWeight + "\n" + "Разница " + diffWeight);
       System.out.println();

    // 3 quest

        int bananas = 5, milk = 2, iceCream = 2, eggs = 4, weightGr;
        weightGr = bananas * 80 + milk * 105 + iceCream * 100 + eggs * 70;
        System.out.println("Вес завтрака в граммах " + weightGr + " гр");
        float weightKg = (float)weightGr / 1000;
        System.out.println("Вес завтрака в киллограммах " + weightKg + " кг");
        System.out.println();

        // 4 quest

        int goal = 7000;
        int days_250 = goal / 250, days_500 = goal / 500;
        float average = (250 + 500) / 2;
        float averageDays = goal / average;
        System.out.println(days_250 + " дней уйдет, если сбрасыбвать по 250гр и " + days_500+ " дней потребуется, если сжигать по 500гр в день");
        System.out.printf("В среднем постребуется %.1f дней \n", averageDays);
        System.out.println();

        // 5 quest

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha + (salaryMasha / 100) * 10;
        int newSalaryDenis = salaryDenis + (salaryDenis / 100) * 10;
        int newSalaryKristina = salaryKristina + (salaryKristina / 100) * 10;
        int difSalaryM = newSalaryMasha - salaryMasha;
        int difSalaryD = newSalaryDenis - salaryDenis;
        int difSalaryK = newSalaryKristina - salaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " + "Годовой доход вырос на " + difSalaryM + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " + "Годовой доход вырос на " + difSalaryD + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. " + "Годовой доход вырос на " + difSalaryK + " рублей.");
    }
}