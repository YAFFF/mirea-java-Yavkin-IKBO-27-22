package practicalWork7;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameWithPlayer {
    public static void addToDeque(Deque<Object> stack, int a, int b){
        stack.addLast(a);
        stack.addLast(b);
    }

    public static void currentInformation(Deque<Object> player, Deque<Object> bot, int count){

        System.out.println("Round: " + count);
        System.out.println("Size of Your deck: " + player.size());
        System.out.println("Size of bot`s deck: " + bot.size() + '\n');
        System.out.print("Your deck: ");
        for (var i : player)
            System.out.print(i + " ");
        System.out.print('\n' + "bot`s deck: ");
        for (var i : bot)
            System.out.print(i + " ");
        System.out.println("\n——————————————————\n\n");
    }
    public static void game(Deque<Object> player, Deque<Object> bot){
        int count = 0;
        while (!(player.isEmpty() || bot.isEmpty())){
            int f = (int) player.pop(), s =  (int) bot.pop();
            if (f == 0 && s == 9) {
                addToDeque(player, f, s);
                currentInformation(player, bot, count);
            } else if (f == 9 && s == 0){
                addToDeque(bot, s, f);
                currentInformation(player, bot, count);
            } else if (f > s){
                addToDeque(player, f, s);
                currentInformation(player, bot, count);
            } else if (f < s) {
                addToDeque(bot, s, f);
                currentInformation(player, bot, count);
            }
            count ++;
            if (count > 200){
                System.out.println("No one wins in 200 rounds.");
                return;
            }
        }
        if (!player.isEmpty())
            System.out.println("You wins in " + count + " rounds.");
        else
            System.out.println("Bot wins in " + count + " rounds.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> deck = new ArrayList<>(), fList = new ArrayList<>(), sList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            deck.add(i);
        for (int i = 0; i < 5; i++){
            fList.add(deck.remove(ThreadLocalRandom.current().nextInt(deck.size())));
            sList.add(deck.remove(ThreadLocalRandom.current().nextInt(deck.size())));
        }
        Deque<Object> firstDeque = new ArrayDeque<>(fList);
        Deque<Object> secondDeque = new ArrayDeque<>(sList);
        System.out.println("Select the deck");
        System.out.print("1) ");
        for (var i : firstDeque)
            System.out.print(i);
        System.out.print(";    2) ");
        for (var i : secondDeque)
            System.out.print(i);
        System.out.println('.');
        while (true) {
            int a = scanner.nextInt();
            if (a == 1) {
                game(firstDeque, secondDeque);
                break;
            }
            else if (a == 2) {
                game(secondDeque, firstDeque);
                break;
            } else {
                System.out.println("Only 1 or 2");
            }
        }
    }
}
