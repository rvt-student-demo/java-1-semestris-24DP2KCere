package rvt;

import java.util.Scanner;

public class chapter19_4uzd {
    public static void main(String[] args) {

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
}
