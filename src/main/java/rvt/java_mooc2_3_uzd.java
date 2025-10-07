package rvt;

import java.util.Scanner;

public class java_mooc2_3_uzd {
    public static void main(String[] args) {
        ex5();

    }

    public static void ex1() {
        int summ = 0;

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet cipari.");
        int number = ievade.nextInt();

        while (number != -1) {
            number = ievade.nextInt();

        }
        System.out.println("Thx.Bye!");

    }

    public static void ex2() {
        int summ = 0;

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet cipari.");
        int number = ievade.nextInt();

        while (number != -1) {
            summ = summ + number;
            number = ievade.nextInt();

        }
        System.out.println("Thx.Bye!");
        System.out.println(summ);

    }

    public static void ex3() {
        int summ = 0;
        int quantity = 0;

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet cipari.");
        int number = ievade.nextInt();

        while (number != -1) {
            summ = summ + number;
            quantity = quantity + 1;
            number = ievade.nextInt();

        }
        System.out.println("Thx.Bye!");
        System.out.println(summ);
        System.out.println("Ciparu skaits:" + quantity);

    }

    public static void ex4() {
        int summ = 0;
        double quantity = 0;
        double avg = 0;
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet cipari.");
        int number = ievade.nextInt();

        while (number != -1) {
            summ = summ + number;
            quantity = quantity + 1;
            number = ievade.nextInt();

        }
        System.out.println("Thx.Bye!");
        System.out.println(summ);
        System.out.println("Ciparu skaits:" + quantity);
        System.out.println("Videjais:" + (avg = summ / quantity));

    }

    public static void ex5() {
        int summ = 0;
        double quantity = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet cipari.");
        int number = ievade.nextInt();

        while (number != -1) {
            summ = summ + number;
            quantity = quantity + 1;
            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }

            number = ievade.nextInt();
        }
        System.out.println("Thx.Bye!");
        System.out.println(summ);
        System.out.println("Ciparu skaits:" + quantity);
        System.out.println("Videjais:" + (avg = summ / quantity));
        System.out.println("Para:" + even);
        System.out.println("Nepara" + odd);

    }
}
