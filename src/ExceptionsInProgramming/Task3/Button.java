package ExceptionsInProgramming.Task3;

import java.io.IOException;

public class Button {
    public static void button() {
        System.out.println("Введите данные в формате : - (фамилия имя отчество дата_рождения номер_телефона пол) - через пробел");
        try {
            VerifyWriteContacts.writeContacts(VerifyWriteContacts.parseFormatContacts(VerifyWriteContacts.decoder(VerifyWriteContacts.parseNumContacts(VerifyWriteContacts.inputContacts()))));
        } catch (InvalidContactException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
