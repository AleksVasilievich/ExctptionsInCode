package ExceptionsInProgramming.Task3_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
 * разделенные пробелом (данные вводятся одной строкой без запятых):
 * Фамилия Имя Отчество, дата рождения, номер телефона, пол
 * Форматы данных: фамилия, имя, отчество - строки
 * дата рождения - строка формата dd.mm.yyyy
 * номер телефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
 * вернуть код ошибки. Создать метод, который обработает его и покажет пользователю сообщение,
 * что он ввел меньше или больше данных, чем требуется.
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано,
 * пользователю выведено сообщение с информацией, что именно неверно.
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии.
 * В него в одну строку должны записаться полученные данные, вида: Фамилия Имя Отчество, дата рождения, номер телефона, пол
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.     Не забудьте закрыть соединение с файлом.
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */

public class Contakts {

    public static void main(String[] args) {
        System.out.println("Приложение  - Контакты - надёжно хранит ваши персональные данные !!!");
        System.out.println("Введите ваши данные в виде: Фамилия Имя Отчество дата рождения номер телефона пол");
        String input = "Петров Пётр Петрович 12.12.20121 89121212121 m";
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();

        try {
            workInContacts(input);
        }catch (InvalidContactException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void inputContact(){

    }

    public static void workInContacts(String input) throws InvalidContactException, IOException {
        String[] contact = input.split(" ");

        if (contact.length != 6) {
            throw new InvalidContactException("Неверное количество данных");
        }
        String surname = contact[0];
        String name = contact[1];
        String patronymic = contact[2];
        String data = contact[3];
        String fone = contact[4];
        String gender = contact[5];

        if(!surname.matches("[а-яА-ЯёЁ]+")){
            throw  new InvalidContactException("Неверный формат фамилии");
        }
        if(!name.matches("[а-яА-ЯёЁ]+")){
            throw  new InvalidContactException("Неверный формат имени");
        }
        if(!patronymic.matches("[а-яА-ЯёЁ]+")){
            throw  new InvalidContactException("Неверный формат фамилии");
        }
        if(!data.matches("\\d{2}\\.\\d{2}\\.\\d{4}")){
            throw  new InvalidContactException("Неверный формат даты");
        }
        if(!fone.matches("\\d{11}")){
            throw  new InvalidContactException("Неверный формат номера телефона");
        }
        if(!gender.matches("[mf]")){
            throw  new InvalidContactException("Неверный формат пола");
        }

        FileWriter fileWriter = new FileWriter(surname + ".txt",true);
        fileWriter.write(surname + " " + name + " " + patronymic + " " + data + " " + fone + " " + gender);
        fileWriter.close();
        System.out.println(surname + " " + name + " " + patronymic + " " + data + " " + fone + " " + gender);
    }

}
class InvalidContactException extends Exception {
    public InvalidContactException(String message){
        super(message);
    }
}

