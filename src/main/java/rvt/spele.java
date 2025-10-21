package rvt;

import java.util.*;

public class spele {
    public static void main(String[] args) {
        System.out.println("Es domaju par skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin 3 meģinajumos");

        Random random = new Random();
        int result = random.nextInt(10) + 1;
        System.out.println("Ievadi minejumu");

        Scanner ievade = new Scanner(System.in);
        

        for (int i = 0; i < 3; i++) {

            int lietotajs = ievade.nextInt();

            if (lietotajs == result) {
                System.out.println("Pareizi!");
                System.out.println("Tu uzvareji speli.");
                break;

            } else {
                System.out.println("Nepareizi");
                
            }

            if (i == 2) {
                System.out.println("Pareiza atbilde bija:" + result + ".");
                System.out.println("Tu esi zaudejis speli.");
            }

        }
      

    }

}
