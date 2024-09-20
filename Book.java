
public class Book {
    public String title;
    public String author;
    public String isbn;
    public double price;

    public Book() {
        this.title = "The Great Gatsby";
        this.author = "F. Scott Fitzgerald";
        this.isbn = "9780743273565";
        this.price = 17.00;
    }

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Book title:" + title);
        System.out.println("Book author:" + author);
        System.out.println("Book isbn:" + isbn);
        System.out.println("Book price:" + price);
    }

    public double applyDiscount(double percentage) {
        price = price - (price * (percentage / 100));
        return price;
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Kafka on the Shore", "Haruki Murakami", "1400079276", 18.00);
        Book display = new Book();
        System.out.println("Default Book: ");
        defaultBook.displayInfo();

        System.out.println("\nParameterized Book: ");
        parameterizedBook.displayInfo();

        System.out.println("\nApplying discount on Default Book: ");
        System.out.println(defaultBook.applyDiscount(10));
    }
}

