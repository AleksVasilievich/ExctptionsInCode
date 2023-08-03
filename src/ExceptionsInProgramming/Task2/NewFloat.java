package ExceptionsInProgramming.Task2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class NewFloat {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input;
        while (true) {
            try {
                System.out.println("Введите дробное число:  ");
                input = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод.");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println(userInput);
    }
}



