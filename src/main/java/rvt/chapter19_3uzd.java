package rvt;

import java.util.Scanner;

public class chapter19_3uzd {
    public static void main(String[] args) {

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
}
