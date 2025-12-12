import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Name:");
            String name = ievade.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int page = Integer.valueOf(ievade.nextLine());

            System.out.print("Publication year: ");
            int edition = Integer.valueOf(ievade.nextLine());

            books.add(new Books(name, page, edition));
        }
        System.out.print("What info will be printed? ");
        String info = ievade.nextLine();

        for (Books gr : books) {

            if (info.equals("everything")) {
                System.out.println(gr.toString());
                
            } else if (info.equals("name")) {
                System.out.println(gr.getTitle());
            }

        }
    }
}