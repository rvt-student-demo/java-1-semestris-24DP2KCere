package rvt;

import java.util.Scanner;

public class chapter19_5uzd {
    public static void main(String[] args) {

        System.out.println("Ievadiet vardu.");
        Scanner ievade = new Scanner(System.in);

        String vards = ievade.nextLine();
        int garums = vards.length();
        while (garums > 0) {
            System.out.println(vards);
            garums = garums - 1;
        }
    }
}
