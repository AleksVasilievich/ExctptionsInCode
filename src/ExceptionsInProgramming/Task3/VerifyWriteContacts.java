package ExceptionsInProgramming.Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
 * разделенные пробелом (данные вводятся одной строкой без запятых):
 * Фамилия Имя Отчество, дата рождения, номер телефона, пол
 * Форматы данных:
 * фамилия, имя, отчество - строки                дата рождения - строка формата dd.mm.yyyy
 * номер телефона - целое беззнаковое число без форматирования       пол - символ латиницей f или m.
 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
 * вернуть код ошибки. Создать метод, который обработает его и покажет пользователю сообщение,
 * что он ввел меньше или больше данных, чем требуется.
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано,
 * пользователю выведено сообщение с информацией, что именно неверно.
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии.
 * В него в одну строку должны записаться полученные данные, вида:
 * Фамилия Имя Отчество, дата рождения, номер телефона, пол
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * Не забудьте закрыть соединение с файлом.
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 * пользователь должен увидеть стектрейс ошибки.
 */

public class VerifyWriteContacts {

    public static String inputContacts() {

//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        System.out.println(line);
//        return line;
        //return "Петров Пётр Петрович 12.12.2012 89121212121 m";
        //return "12.12.2012 89121212121 Петров Пётр Петрович m";
        return "m Петров Пётр Петрович 12.12.2012 89121212121";
    }

    public static String parseNumContacts(String str) {

        String[] strArray = str.split(" ");
        if (strArray.length < 6) {
            return "-1";
        } else if (strArray.length > 6) {
            return "1";
        }
        return str;
    }

    public static String decoder(String code) {

        switch (code) {
            case "-1" -> {
                System.out.println("Количество введённых данные меньше чем требуется");
                Button.button();
            }
            case "1" -> {
                System.out.println("Количество введённых данные больше чем требуется");
                Button.button();
            }
            case "0" -> System.out.println("Количество введённых данных соответствует требованиям");
        }
        return code;
    }

    public static String parseFormatContacts(String str){
        String[] array = str.split(" ");
        String surname = "";
        String name = "";
        String patronymic = "";
        String date = "";
        String phoneNumber = "";
        String gender = "";
        String contact = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[а-яА-ЯёЁ]+")){
                surname = array[i];i++;
                name = array[i];i++;
                patronymic = array[i];
            }else throw new IllegalArgumentException("Строка содержит недопустимые символы");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                date = array[i];
                System.out.println(contact);
            } else throw new IllegalArgumentException("Строка содержит недопустимые символы");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("\\d{11}")) {
                phoneNumber = array[i];
                System.out.println(contact);
            } else throw new IllegalArgumentException("Строка содержит недопустимые символы");
        }

                for (int i = 0; i < array.length; i++){
             if (array[i].matches("[mf]")) {
                 gender = array[i];
                 contact = surname + " " + name + " " + patronymic + " " + date + " " + phoneNumber + " " + gender;
                 System.out.println(contact);
            } else throw new IllegalArgumentException("Строка содержит недопустимые символы");
        }
        return contact;
    }

    public static void writeContacts(String code) {

        if (code.length() > 2) {
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter("src/ExceptionsInProgramming/Task3/1.txt", true);
                fileWriter.write(code);
                fileWriter.append('\n');
                fileWriter.flush();
                System.out.println("Данные успешно сохранены \n" + code);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}





