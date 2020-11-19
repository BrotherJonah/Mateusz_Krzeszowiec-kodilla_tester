public class Book {
    private String author;
    private String title;

    static String of(String author, String title) {
        this.author = author;
        this.title = title;

        return author + title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
    // nie rozumiem dlaczego nie działa
    }
}
