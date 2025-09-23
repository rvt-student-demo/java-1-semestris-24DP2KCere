package rvt;
import java.util.Scanner;
public class grades{
    public static void main(String[] args) {
        
Scanner ievade = new Scanner(System.in);

    System.out.println("Ievadiet savu punktu skaitu:");

    int points = ievade.nextInt();
    

    if ( points < 0 ){
        System.out.println("Your grade is:impossible");
    }else if (points <= 49){
        System.out.println("Your grade is:impossible");
    }else if (points <= 59){
        System.out.println("Your grade is:1");
    }else if (points <= 69){
        System.out.println("Your grade is:2");
    }else if (points <= 79){
        System.out.println("Your grade is:3");
    }else if (points <= 89){
        System.out.println("Your grade is:4");
    }else if (points <= 100){
        System.out.println("Your grade is:5");
    }else if (points > 100){
        System.out.println("Your grade is:incredible");
    }
    

    }
}
