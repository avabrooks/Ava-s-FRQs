public class FRQ9Child extends FRQ9 {
    private String illustrator;

    public FRQ9Child(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }

    public String printBookInfo() {
        return super.printBookInfo() + " and illustrated by " + illustrator;
    }

    public static void main(String[] args) {
        FRQ9 book1 = new FRQ9("Frankenstein", "Mary Shelley");
        FRQ9 book2 = new FRQ9Child("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        System.out.println(book1.printBookInfo());
        System.out.println(book2.printBookInfo());
    }
}