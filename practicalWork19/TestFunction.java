package practicalWork19;

import java.util.ArrayList;

public class TestFunction {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        new Function<Integer>().function(array, list);
        System.out.println(list);
    }
}
