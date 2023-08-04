package ExceptionsInProgramming.Task2.Namber2;

//Задание 2

public class Program2 {
    public static void main(String[] args) {

        int[] intArray = new int[]{2, 5, 7, 7, 5, 6, 3, 9, 2, 7};
        //int[] intArray = new int[]{2, 5, 9, 2, 7};
        //int[] intArray = new int[]{}; //Инициализируем массив.№1
        try {
            int d = 0;
            if (intArray != null) { // Если массив пустой.№2
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (ArithmeticException e) {          // Арифметические ошибки (деление на ноль)
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException ex) {   //Выход за пределы длины массива.№3
            System.out.println("Массив выходит за пределы своего размера!" + ex);
        } catch (Throwable ex) { // №4 исключения обрабатываются от наиболее специфического к наиболее общему.
            System.out.println("Что-то пошло не так...");
        }
    }
}


