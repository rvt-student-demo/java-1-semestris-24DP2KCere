package rvt;

import java.util.Scanner;

public class delikates {
    public static void main(String[] args) {
        Scanner ievade = new Scanner (System.in);

        System.out.print("Ievadi preci: ");
        String preci = ievade.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = ievade.nextDouble();

        System.out.print("Ekspress piegade (0 == ne 1 == ja): ");
        int piegade = ievade.nextInt();

        System.out.println("Rekins:");
        System.out.println("    " + preci + "   " + cena);

        double deliver = 0.0;
        if(cena < 10.0){
            deliver = deliver + 2.0;
        }
        if(piegade == 1){
            deliver = deliver + 3.0;
        }
        System.out.println("    Piegade    " + deliver);
        System.out.println("    Kopa    " + (cena + deliver));

    }
}
