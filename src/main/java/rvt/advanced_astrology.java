package rvt;

public class advanced_astrology {
    public static void main(String[] args) {
       christmasTree(4);
    }

    public static void printSpaces(int number) {
        for(int i = number; i > 0; i--) {
                System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for(int i = number; i > 0; i--) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1 ; i <= size  ; i++) {
            printSpaces(size - i );
            printStars(i);
        }
    }
    public static void christmasTree(int size){
        for (int i = 1 ; i <= size  ; i++) {
            printSpaces(size - i );
            printStars(i * 2 - 1);
        }
        for(int i = 2 ; i > 0 ; i--){
            printSpaces(size - 2 );
            printStars(3 );
        }
    }
}

