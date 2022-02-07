public class FRQ9 {
    private String title;
    private String author;

    public FRQ9(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String printBookInfo() {
        return title + ", written by " + author;
    }

    public static void main(String[] args) {
        FRQ9 book1 = new FRQ9("Frankenstein", "Mary Shelley");
        System.out.println(book1.printBookInfo());
    }
}