package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {

        System.out.println("Ievadiet sakum und beig vertibu.");
        Scanner ievade = new Scanner(System.in);

        int sakums = ievade.nextInt();
        int ped = ievade.nextInt();
        System.out.println();
        while (sakums < ped + 1) {
            System.out.println(sakums);
            sakums = sakums + 1;
        }

    }

    public static void ex2() {
        System.out.println("Ievadiet veselo skaitlu.");
        Scanner ievade = new Scanner(System.in);

        int n = ievade.nextInt();
        int summ = 0;

        while (n > 0) {
            summ = summ + n;
            n = n - 1;
        }
        System.out.println(summ);

    }

    public static void ex3() {
        System.out.println("Ievadiet veselo skaitlu.");
        Scanner ievade = new Scanner(System.in);

        int n = ievade.nextInt();
        int summ = 0;

        while (n > 0) {
            summ = summ + n * n;
            n = n - 1;
        }
        System.out.println(summ);

    }

    public static void ex4() {
        System.out.println("Ievadiet sakum und beig vertibu.");
        Scanner ievade = new Scanner(System.in);

        int sakums = ievade.nextInt();
        int ped = ievade.nextInt();
        int summ = 0;

        while (sakums < ped + 1) {
            summ = summ + sakums;
            sakums = sakums + 1;

        }
        System.out.println(summ);
    }

    public static void ex5() {
        System.out.println("Ievadiet vardu.");
        Scanner ievade = new Scanner(System.in);

        String vards = ievade.nextLine();
        int garums = vards.length();
        while (garums > 0) {
            System.out.println(vards);
            garums = garums - 1;
        }
    }

    public static void ex6() {
        System.out.println("Ievadiet pirmo vardu");
        System.out.println("Ievadiet otro vardu");
        Scanner ievade = new Scanner(System.in);

        String word1 = ievade.nextLine();
        String word2 = ievade.nextLine();
        int garums1 = word1.length();
        int garums2 = word2.length();

        int dots = 30 - garums1 - garums2;
        System.out.print(word1);
        while (dots > 0) {
            System.out.print(".");
            dots = dots - 1;
        }
        System.out.print(word2);
    }

    public static void ex7() {
        System.out.println("Ievadiet vardu.");
        Scanner ievade = new Scanner(System.in);

        String word1 = ievade.nextLine();
        int garums1 = word1.length();

       for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
        }
    }
}
