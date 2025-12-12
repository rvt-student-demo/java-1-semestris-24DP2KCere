import java.util.Scanner;

public class objects {
    public static void main(String[] args) {
        Statistics numbers = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        Statistics evensum = new Statistics();
        Statistics oddsum = new Statistics();

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) { // 2 vienadibas zimes parbauda vai divi mainigie atsaucas uz vienu un to pašu
                                // vertibu atmiņā.
                break;
            }
            if (number % 2 == 0) {
                evensum.addNumber(number);
            } else {
                oddsum.addNumber(number);
                ;
            }
            numbers.addNumber(number);

        }
        System.out.println("Summ: " + numbers.sum());
        System.out.println("Evennsum " + evensum.sum());
        System.out.println("Oddsum " + oddsum.sum());

    }
}