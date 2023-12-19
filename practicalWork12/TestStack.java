package practicalWork12;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void addToStack(Stack<Object> stack, int a, int b){
        var t = new Stack<>();
        t.push(b);
        t.push(a);
        for (var i : stack)
            t.push(i);
        stack.clear();
        for (var i : t)
            stack.push(i);
    }
    public static void game(Stack<Object> first, Stack<Object> second){
        int count = 0;
        while (!(first.empty() || second.empty())){
            int f = (int) first.pop(), s =  (int) second.pop();
            if (f == 0 && s == 9) {
                addToStack(first, f, s);
                //                for (var i : first)
//                    System.out.print(i + " ");
//                System.out.println();
//                for (var i : second)
//                    System.out.print(i + " ");
//                System.out.println();
//                System.out.println();
            } else if (f == 9 && s == 0){
                addToStack(second, s, f);
            } else if (f > s){
                addToStack(first, f, s);
            } else if (f < s) {
                addToStack(second, s, f);
            }
            count ++;
            if (count > 200) {
                System.out.println("No one wins in 200 rounds.");
                return;
            }
        }
        if (!first.empty())
            System.out.println("first " + count);
        else
            System.out.println("second " + count);
    }

    public static void pushToStack(int a, Stack<Object> stack){
        if (a / 10 > 0)
            pushToStack(a / 10, stack);
        stack.push(a % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var firstStack = new Stack<>();
        var secondStack = new Stack<>();
        pushToStack(scanner.nextInt(), firstStack);
        pushToStack(scanner.nextInt(), secondStack);
        game(firstStack, secondStack);
    }
}
