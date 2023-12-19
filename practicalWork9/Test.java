package practicalWork9;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Lada", 456);
        System.out.println("Name: " + car.getName() + "\nPrice: " + car.getPrice() + '\n');
        Book book = new Book("Книга", 123);
        System.out.println("Name: " + book.getName() + "\nPrice: " + book.getPrice() + '\n');
    }
}
