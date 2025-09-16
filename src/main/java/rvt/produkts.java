package rvt;

import java.util.Scanner;

public class uzd {
     public static void main(String[] args) {
Scanner ievade = new Scanner(System.in);

System.out.println("Ievadiet produkta nosaukumu");

String produkts = ievade.nextLine();

System.out.println("Ievadiet produkta cenu");

double cena = ievade.nextDouble();

System.out.println("Ievadiet produkta daudzumu");

int daudz = ievade.nextInt();

System.out.println("Produkts: " + produkts);

System.out.println("Cena: " + cena);

System.out.println("Daudzums: " + daudz);

System.out.println("Kopeja cena: " + daudz * cena);


     }
}
