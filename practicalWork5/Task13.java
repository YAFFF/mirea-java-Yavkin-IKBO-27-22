package practicalWork5;

import java.util.Scanner;

public class  Task13 {
    public static void function(){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        num1 = scanner.nextInt();
        if (num1 != 0){
            System.out.println(num1);
            num2 = scanner.nextInt();
            if (num2 != 0){
                function();
            }
        }
    }

    public static void main(String[] args) {
        function();
    }
}
