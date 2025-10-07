package rvt;

public class from_parametr_to_one {
    public static void main(String[] args) {
    printFromNumberToOne(8);
}
 
    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
