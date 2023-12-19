package practicalWork12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TestDeque {
    public static void addToDeque(Deque<Object> stack, int a, int b){
        stack.addLast(a);
        stack.addLast(b);
    }
    public static void game(Deque<Object> first, Deque<Object> second){
        int count = 0;
        while (!(first.isEmpty() || second.isEmpty())){
            int f = (int) first.pop(), s =  (int) second.pop();
            if (f == 0 && s == 9) {
                addToDeque(first, f, s);
            } else if (f == 9 && s == 0){
                addToDeque(second, s, f);
            } else if (f > s){
                addToDeque(first, f, s);
            } else if (f < s) {
                addToDeque(second, s, f);
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
    public static void pushToStack(int a, Deque<Object> stack){

        if (a / 10 > 0)
            pushToStack(a / 10, stack);
        stack.push(a % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Object> firstDeque = new ArrayDeque<>();
        Deque<Object> secondDeque = new ArrayDeque<>();

        pushToStack(scanner.nextInt(), firstDeque);
        pushToStack(scanner.nextInt(), secondDeque);
        game(firstDeque, secondDeque);
    }
}
