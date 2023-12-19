package practicalWork1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Ivan", "bulldog", 3, 20);
        System.out.println(dog.humanAge());
        System.out.println(dog.supposedNumberOfOffspring());
        System.out.println(dog + "\n");

        Ball ball = new Ball(0.5, "red");
        System.out.println(ball.weightOnJupiter());
        System.out.println(ball.colorWithColorBlindness());
        System.out.println(ball + "\n");

        Book book = new Book(400, 450, "brown", "Pushkin");
        System.out.println(book.willYouLikeThis(112));
        System.out.println(book);
    }
}