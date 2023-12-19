package practicalWork5;

import java.util.Scanner;

public class Task15 {
    public static void function(int a){
        System.out.print(a % 10 + "  ");
        if (a / 10 != 0)
            function(a / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        function(scanner.nextInt());
    }
}
