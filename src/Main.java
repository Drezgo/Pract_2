public class Main {
    public static void main(String[] args) {
        // 1 Завдання

        int a = 70;
        if (a >= 25 & a <= 100) System.out.println("Число " + a + " міститься в проміжку (25; 100)");
        else System.out.println("Число " + a + " не міститься в проміжку (25; 100)");

        // 2 Завдання

        int n = 739;
        int b1 = n / 100;
        int b2 = n / 10 % 10;
        int b3 = n % 10;
        if (b1 >= b2 & b1 >= b3) System.out.println("Найбільше число " + b1);
        else if (b2 >= b1 & b2 >= b3) System.out.println("Найбільше число " + b2);
        else if (b3 >= b2 & b3 >= b1) System.out.println("Найбільше число " + b3);

        // 3 Завдання

        String direction = "До гори";
        int floor = 5;
        String n1 = "піднялись";
        if (direction == "До низу") {
            n1 = "спустились";
            if (floor == 2) System.out.println("Ви " + n1 + " на 1 поверх");
        } else {
            if (floor == 3) System.out.println("Ви " + n1 + " на 3 поверх");
        }
        if (floor == 1) System.out.println("Ви " + n1 + " на 1 поверх");
        else if (floor == 2) ;
        else if (floor == 3) System.out.println("Ви " + n1 + " на 3 поверх");
        else if (floor == 4) System.out.println("Ви " + n1 + " на 4 поверх");
        else if (floor == 5) System.out.println("Ви " + n1 + " на 5 поверх");
        else if (floor == 6) System.out.println("Ви " + n1 + " на 6 поверх");
        else if (floor == 7) System.out.println("Ви " + n1 + " на 7 поверх");
        else if (floor == 8) System.out.println("Ви " + n1 + " на 8 поверх");
        else if (floor == 9) System.out.println("Ви " + n1 + " на 9 поверх");
        else System.out.println("Ви вказали неіснуючий поверх!");


        // 4 Завдання

        String zap = "NO";
        switch (zap) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Ви вказали неправильну відповідь!");
        }


        // 5 Завдання

        int ch1 = 86;
        int ch2 = 65;
        int ch3 = 674;
        System.out.println("Числа в порядку зростання: ");
        if (ch1==ch2 | ch1==ch3 | ch3==ch2) System.out.println("Неправильні (рівні) числа!");
        else {
            //найменше
            if (ch1 < ch2 & ch1 < ch3) System.out.println(ch1);
            if (ch2 < ch1 & ch2 < ch3) System.out.println(ch2);
            if (ch3 < ch1 & ch3 < ch2) System.out.println(ch3);
            //середнє
            if (ch3 > ch1 & ch1 > ch2 | ch2 > ch1 & ch1 > ch3) System.out.println(ch1);
            if (ch3 > ch2 & ch2 > ch1 | ch1 > ch2 & ch2 > ch3) System.out.println(ch2);
            if (ch1 > ch3 & ch3 > ch2 | ch2 > ch3 & ch3 > ch1) System.out.println(ch3);
            //найбільше
            if (ch1 > ch2 & ch1 > ch3) System.out.println(ch1);
            if (ch2 > ch1 & ch2 > ch3) System.out.println(ch2);
            if (ch3 > ch1 & ch3 > ch2) System.out.println(ch3);
        }


        //6 Завдання

        int n11 = 12099;
        if (n11>28800 | n11<0) System.out.println("Завелике або замале значення секунд! "+n+" не входить у проміжок (0; 28800)");
        else {
            System.out.println(n11+" секунд");
            int g = n11 / 3600;
            if (n11<3600) System.out.println("До кінця робочого дня залишилось менше 1 години");
            else System.out.println("До кінця робочого дня залишилось "+g+" годин(и)");
        }


    }
}