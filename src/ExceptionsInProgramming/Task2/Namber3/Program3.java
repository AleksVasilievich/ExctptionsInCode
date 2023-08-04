package ExceptionsInProgramming.Task2.Namber3;

//Задание 3

import java.io.FileNotFoundException;

public class Program3 {
    public static void main(String[] args) {  // №1
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch(ArithmeticException e){
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // №2 исключения обрабатываются от наиболее специфического к наиболее общему.
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {  //№3
        System.out.println(a + b);
    }
}

