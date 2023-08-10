package ExceptionsInProgramming.Task3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContacts {
    public static void writeContacts(String str) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("src/ExceptionsInProgramming/Task3/1.txt",true);
            fileWriter.write(str);
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
