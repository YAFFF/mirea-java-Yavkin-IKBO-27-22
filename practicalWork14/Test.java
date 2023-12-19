package practicalWork14;

public class Test {
    public static void main(String[] args) {
        BoundedWaitList<Object> a = new BoundedWaitList<>(1);
        a.add(4);
        a.add(4);
        a.add(2);
        a.add(1);
        System.out.println(a);
        System.out.println(a.getCapacity());
    }
}
