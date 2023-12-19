package practicalWork19;

public class TestUniversalArray {
    public static void main(String[] args) {
        UniversalArray<Integer> arrayInt = new UniversalArray<>(new Integer[] {1, 2, 3, 4, 5});
        UniversalArray<Long> arrayLong = new UniversalArray<>(new Long[] {1L, 2L, 3L, 4L, 5L});
        for (var i : arrayInt.getArray()){
            System.out.println(i);
        }
        System.out.println();
        for (var i : arrayLong.getArray()){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(arrayInt.get(2));
        System.out.println(arrayLong.get(4));
    }
}
