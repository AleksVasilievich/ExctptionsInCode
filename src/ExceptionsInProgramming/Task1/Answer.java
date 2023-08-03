package ExceptionsInProgramming.Task1;

/**
 *Получить 3 вида ошибкок
 */

public class Answer {
    public static void arrayOutOfBoundsException() {
        int array[] = new int[10];
        System.out.println(array[11]);
    }

    public static void divisionByZero() {
        int a = 10; int b = 0; int c = a / b;
        System.out.println(c);

    }

    public static void numberFormatException() {
        String s = "123o";
        System.out.println(Integer.parseInt(s));
    }
}

class printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
