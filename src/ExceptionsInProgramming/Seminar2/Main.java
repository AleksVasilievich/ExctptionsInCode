package ExceptionsInProgramming.Seminar2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {

        String line = "12.12.2012";
        //String line = "Петров Пётр Петрович 12.12.2012 89121212121 m";
//        String[] arrLine = line.split(" ");
//        System.out.println(isNum(line));
//        System.out.println(isNum("25353"));
        num(line);
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
