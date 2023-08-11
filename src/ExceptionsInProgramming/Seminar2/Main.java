package ExceptionsInProgramming.Seminar2;

public class Main {
    public static void main(String[] args) {

        String line = "Петров Пётр Петрович 12.12.2012 89121212121 m";
        String[] arrLine = line.split(" ");
        System.out.println(isNum(line));
        System.out.println(isNum("25353"));
    }
    public static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
