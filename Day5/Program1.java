class Book{
    String title = "Programmig in C";
    String author = "Bala Guru Swami";
    String publisher = "unknown";
    short price = 493;
    int ISBN = 1173461819;

    void applyDiscount(){
        short dis = (short) (price * 10 / 100);
        price -= dis;
    }

    void displayBookDetails(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Publisher: "+ publisher);
        System.out.println("Price: "+ price);
        System.out.println("Publisher: "+ publisher);
        System.out.println();
    }
}

public class Program1{
    public static void main(String[] args) {
        Book book = new Book();
        
        book.displayBookDetails();
        book.applyDiscount();
        book.displayBookDetails();
    }
}
