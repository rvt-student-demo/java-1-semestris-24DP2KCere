package rvt;

import java.util.Scanner;

public class chapter19_1uzd {
    public static void main(String[] args) {

        System.out.println("Ievadiet sakum und beig vertibu.");
        Scanner ievade = new Scanner(System.in);

        int sakums = ievade.nextInt();
        int ped = ievade.nextInt();

        while (sakums < ped + 1) {
            System.out.println(sakums);
            sakums = sakums + 1;
        }

    }
}
