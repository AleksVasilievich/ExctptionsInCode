package ExceptionsInProgramming.Task3;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Button.button();

//       try {
//           Button.button();
//       }catch (InvalidContactException e){
//           System.out.println(e.getMessage());
//       }catch (IOException e){
//           e.printStackTrace();
//       }
    }
}

class InvalidContactException extends Exception {
    public InvalidContactException(String message){
        super(message);
    }
}