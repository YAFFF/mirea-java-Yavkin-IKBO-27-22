package practicalWork12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestQueue {
    public static void addToQueue(Queue<Object> queue, int a, int b){
        Queue<Object> t = new LinkedList<>(queue);
        t.add(a);
        t.add(b);
        queue.clear();
        queue.addAll(t);
    }
    public static void game(Queue<Object> first, Queue<Object> second){
        int count = 0;
        while (!(first.isEmpty() || second.isEmpty())){
            int f = (int) first.remove(), s =  (int) second.remove();
            if (f == 0 && s == 9) {
                addToQueue(first, f, s);
            } else if (f == 9 && s == 0){
                addToQueue(second, s, f);
            } else if (f > s){
                addToQueue(first, f, s);
            } else if (f < s) {
                addToQueue(second, s, f);
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
    public static void pushToQueue(int a, Queue<Object> queue){
        queue.add(a % 10);
        if (a / 10 > 0)
            pushToQueue(a / 10, queue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Object> firstQueue = new LinkedList<>();
        Queue<Object> secondQueue = new LinkedList<>();
        pushToQueue(scanner.nextInt(), firstQueue);
        pushToQueue(scanner.nextInt(), secondQueue);
        game(firstQueue, secondQueue);
    }
}
