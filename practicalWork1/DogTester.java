package practicalWork1;

public class DogTester {
    public static void main(String[] args){
        Dog dog1 = new Dog("Ivan", "bulldog", 3, 25);
        System.out.println(dog1.humanAge());
        System.out.println(dog1.supposedNumberOfOffspring());
        System.out.println(dog1 + "\n");

        Dog dog2 = new Dog("Sergey", "bulldog2", 10, 52);
        System.out.println(dog2.humanAge());
        System.out.println(dog2.supposedNumberOfOffspring());
        System.out.println(dog2 + "\n");

        Dog dog3 = new Dog("Vladimir", "bulldog3", 5, 43);
        System.out.println(dog3.humanAge());
        System.out.println(dog3.supposedNumberOfOffspring());
        System.out.println(dog3 + "\n");
    }
}

