package ExceptionsInProgramming.Task3;

public class Button {
    public static void button(){
        System.out.println("Введите данные в формате : - (фамилия имя отчество дата_рождения номер_телефона пол) - через пробел");
        //VerifyWriteContacts.decoder(VerifyWriteContacts.parseNumContacts(VerifyWriteContacts.inputContacts()));
        //VerifyWriteContacts.writeContacts(VerifyWriteContacts.inputContacts());
        VerifyWriteContacts.writeContacts(VerifyWriteContacts.decoder(VerifyWriteContacts.parseNumContacts(VerifyWriteContacts.inputContacts())));



    }

}
