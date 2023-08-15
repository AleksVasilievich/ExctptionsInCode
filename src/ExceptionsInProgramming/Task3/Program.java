package ExceptionsInProgramming.Task3;

public class Program {
    public static void main(String[] args) {
            Button.button();
    }
}

class InvalidContactException extends Exception {
    public InvalidContactException(String message){
        super(message);
    }
}