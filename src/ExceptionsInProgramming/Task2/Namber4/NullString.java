package ExceptionsInProgramming.Task2.Namber4;

import java.util.Scanner;

public class NullString {
    public static void main(String[] args) {
        nullString();
    }
    public static void nullString() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите не пустую строку");
            String input = scanner.nextLine();

            if (input.isEmpty()){
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Ваша строка:" + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

