package rvt;

import java.util.Scanner;

public class chapter19_6uzd {
    public static void main(String[] args) {
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
}
