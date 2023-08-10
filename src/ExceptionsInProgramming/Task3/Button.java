package ExceptionsInProgramming.Task3;

public class Button {
    public static void button(){
        System.out.println("Введите данные в формате : - (фамилия имя отчество дата_рождения номер_телефона пол) - через пробел");
        VerifyStoreContacts.decoder(VerifyStoreContacts.parseNumContacts(VerifyStoreContacts.inputContacts()));
    }

}
