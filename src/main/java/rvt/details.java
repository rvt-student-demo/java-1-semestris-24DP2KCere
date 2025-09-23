package rvt;
import java.util.Scanner;
public class details {
    public static void main(String[] args) {
    Scanner ievade = new Scanner(System.in);

    System.out.print("Ievadiet skruvju daudzumu:");
    int skruvi = ievade.nextInt();
    final int skruviPrice = 5;

    System.out.print("Ievadiet uzgrieznu daudzumu:");
    int uzgriezni = ievade.nextInt();
    final int uzgriezniPrice = 3;

    System.out.print("Ievadiet paplaksnu daudzumu:");
    int paplaksni = ievade.nextInt();
    final int paplaksniPrice = 1;


    int kopeja_cena = ( skruvi * skruviPrice + uzgriezni * uzgriezniPrice + paplaksni * paplaksniPrice );
     System.out.println("Kopeja cena:" + kopeja_cena);

    if (uzgriezni < skruvi){
        System.out.println("Pa maz uzgriežņu.");
    }
    if (skruvi < uzgriezni) {
        System.out.println("Pa maz skruvju.");
    }
    if (paplaksni  / 2 < skruvi){
        System.out.println("Pa maz paplakšņu.");
    }
  }
}

