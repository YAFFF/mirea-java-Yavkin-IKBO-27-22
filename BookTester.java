package practicalWork1;

public class BookTester {
    public static void main(String[] args){
        Book book1 = new Book(400, 450, "brown", "Pushkin");
        System.out.println(book1.willYouLikeThis(112));
        System.out.println(book1);

        Book book2 = new Book(159, 200, "yellow", "Tolstoy");
        System.out.println(book2.willYouLikeThis(120));
        System.out.println(book2);

        Book book3 = new Book(300, 300, "blue", "dostoevsky");
        System.out.println(book3.willYouLikeThis(50));
        System.out.println(book3);
    }
}
