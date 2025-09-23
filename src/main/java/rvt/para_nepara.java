package rvt;
import java.util.Scanner;
public class para_nepara {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        System.out.print("Ievadiet ciparu:");

        int sk = ievade.nextInt();
        if (sk % 2 == 0 ){
            System.out.println("Cipars ir para");
        } else {
            System.out.println("Cipars ir nepara");
        }

    }
}
