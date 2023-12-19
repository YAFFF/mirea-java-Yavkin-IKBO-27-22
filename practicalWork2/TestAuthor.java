package practicalWork2;

public class TestAuthor {
    public static void main(String[] args) {
        var author1 = new Author("Ivan", "ivan.m@mail.ru", 'm');
        System.out.println("Name of author1: " + author1.getName());
        System.out.println("Email of author1: " + author1.getEmail());
        System.out.println("Gender of author1: " + author1.getGender());
        author1.setEmail("ivan.m@gmail.ru");
        System.out.println(author1 + "\n");

        var author2 = new Author("Sergey", "sergey.m@gmail.ru", 'm');
        System.out.println("Name of author2: " + author2.getName());
        System.out.println("Email of author2: " + author2.getEmail());
        System.out.println("Gender of author2: " + author2.getGender());
        author2.setEmail("sergey.m@rambler.ru");
        System.out.println(author2 + "\n");

        var author3 = new Author("Marina", "marina.f@rambler.ru", 'f');
        System.out.println("Name of author3: " + author3.getName());
        System.out.println("Email of author3: " + author3.getEmail());
        System.out.println("Gender of author3: " + author3.getGender());
        author3.setEmail("marina.f@mail.ru");
        System.out.println(author3 + "\n");
    }
}
