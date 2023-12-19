package practicalWork12;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TestDoubleList {

    public static void addToDList(LinkedList<Object> stack, int a, int b){
        stack.addLast(a);
        stack.addLast(b);
    }

    public static void game(LinkedList<Object> first, LinkedList<Object> second){
        int count = 0;
        while (!(first.isEmpty() || second.isEmpty())){
            int f = (int) first.remove(), s =  (int) second.remove();
            if (f == 0 && s == 9) {
                addToDList(first, f, s);
            } else if (f == 9 && s == 0){
                addToDList(second, s, f);
            } else if (f > s){
                addToDList(first, f, s);
            } else if (f < s) {
                addToDList(second, s, f);
            }
            count ++;
            if (count > 200) {
                System.out.println("No one wins in 200 rounds.");
                return;
            }
        }
        if (!first.isEmpty())
            System.out.println("first " + count);
        else
            System.out.println("second " + count);
    }

    public static void pushToDList(int a, Deque<Object> stack){
        if (a / 10 > 0)
            pushToDList(a / 10, stack);
        stack.push(a % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> firstDList = new LinkedList<>();
        LinkedList<Object> secondDList = new LinkedList<>();
        pushToDList(scanner.nextInt(), firstDList);
        pushToDList(scanner.nextInt(), secondDList);
//        addToDList(firstDList, 13, 14);

        for (var i : firstDList)
            System.out.print(i + "  ");
        System.out.println();
        for (var i : secondDList)
            System.out.print(i + "  ");
        System.out.println("\n");
        game(firstDList, secondDList);
    }
}
