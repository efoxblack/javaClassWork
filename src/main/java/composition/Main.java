package composition;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Anthony Horowitz", "atonywitz@scholastic.com", 'M');
        Book book = new Book("Stormbreaker", author, 15.99, 1);
    }
}
