package ExceptionsInProgramming.Seminar2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {

        //String line = "12.12.2012";
        String line = "Петров Пётр Петрович 12.12.2012 89121212121 m";
        String line1 = "12.12.2012 Петров 89121212121 Пётр m Петрович";
//        String[] arrLine = line.split(" ");
//        System.out.println(isNum(line));
//        System.out.println(isNum("25353"));
        //num(line);
        text(line1);
    }
    public static void text(String line){
        String[] array = line.split(" ");
        String surname = "";
        String name = "";
        String patronymic = "";
        String date = "";
        String phoneNumber = "";
        String gender = "";
        String contact = "";
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[0]);
            if (array[i].matches("[а-яА-ЯёЁ]+")) {
                surname = array[i] ;
                i++;
                name = array[i];
                i++;
                patronymic = array[i];
                contact = surname + " " + name + " " + patronymic + " " + date + " " + phoneNumber + " " + gender;

            }
        }
        System.out.println(contact);
    }

    public static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

   // "\\d{2}\\.\\d{2}\\.\\d{4}"

    public static void num(String line){
        String[] arr = line.split("");
        for (int i = 0; i < arr.length; i++) {
            if (line.matches("\\d{2}\\.\\d{2}\\.\\d{4}")){
                System.out.print(arr[i]);
            }
        }
    }
}
