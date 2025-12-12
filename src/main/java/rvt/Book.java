public class Book {
   private int page;
   private int edition;
   private String name;

    public Book(String name, int page, int edition) {
        this.edition = edition;
        this.name = name;
        this.page = page;
    }
    public String getTitle() {
        return this.name;
    }
    public String toString() {
        return this.name + ", " + this.page + " pages, " + this.edition;
    }


}
