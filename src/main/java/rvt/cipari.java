package rvt;

import java.util.Scanner;

public class cipari {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        System.out.println("Ievadiet pirmo veselo skaitļu:");

        double pirm = ievade.nextDouble();

        System.out.println("Ievadiet otro veselo skaitļu:");

       double otr = ievade.nextDouble();

       System.out.println("Ievadiet trešo veselo skaitļu:");

       double treš = ievade.nextDouble();

       double result = (pirm + otr + treš) / 3;

       System.out.println("Videja vertiba ir:" + result);

    }
}


