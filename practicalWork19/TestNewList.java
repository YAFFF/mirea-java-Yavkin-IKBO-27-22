package practicalWork19;

import java.util.Arrays;

public class TestNewList {
    public static void main(String[] args) {
        Integer[] arrayA = {1, 2, 3, 4, 5, 6};
        String[] arrayB = {"qeews", "gegf", "ertcv"};
        ToList<Integer> listA = new ToList<>(arrayA);
        ToList<String> listB = new ToList<>(arrayB);
        System.out.println(listA.getList());
        System.out.println(listB.getList());
    }
}
