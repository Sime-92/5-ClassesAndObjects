public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "johndoe@example.com", 'm');

        Book book1 = new Book("Java for Dummy", author, 19.95);
        Book book2 = new Book("More Java for Dummy", new Author("Jane Smith", "janesmith@example.com", 'f'), 29.95, 888);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getEmail());

        System.out.println(book2.getAuthorName());
        System.out.println(book2.getAuthorEmail());
        System.out.println(book2.getAuthorGender());

        Book[] books = new Book[5];
        books[0] = new Book("Book 1", author, 10.99);
        books[1] = new Book("Book 2", new Author("Alice Brown", "alicebrown@example.com", 'f'), 15.99, 500);
        books[2] = new Book("Book 3", new Author("Bob Smith", "bobsmith@example.com", 'm'), 20.99, 200);
        books[3] = new Book("Book 4", new Author("Eve Johnson", "evejohnson@example.com", 'f'), 25.99, 1000);
        books[4] = new Book("Book 5", new Author("Mike Davis", "mikedavis@example.com", 'm'), 30.99, 300);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

