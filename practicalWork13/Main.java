package practicalWork13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1) Запись;  2) Вывод;  3) Добавление; 4) Выход");
            int a = scanner.nextInt();
            if (a == 1 || a == 3){
                try(FileWriter writer = new FileWriter("task13.txt", a == 3)) {
                    String text = scanner.next();
                    writer.write(text);
                    writer.flush();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            } else if (a == 2) {
                try(FileReader reader = new FileReader("task13.txt"))
                {
                    int c;
                    while((c = reader.read()) != -1){
                        System.out.print((char) c);
                    }
                    System.out.println();
                }
                catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            } else if (a == 4) {
                break;
            }
        }
    }
}
