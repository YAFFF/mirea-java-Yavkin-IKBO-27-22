package practicalWork10;

import java.util.Scanner;

public class Task14 {
    public static void function(int a){
        if (a / 10 > 0)
            function(a / 10);
        System.out.print(a % 10 + "  ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        function(scanner.nextInt());
    }
}
