package ExceptionsInProgramming.Task3;

public class Button {
    public static void button(){
        System.out.println("Введите данные в формате : - (фамилия имя отчество дата_рождения номер_телефона пол) - через пробел");
        try {
            VerifyWriteContacts.writeContacts(VerifyWriteContacts.parseFormatContacts(VerifyWriteContacts.decoder(VerifyWriteContacts.parseNumContacts(VerifyWriteContacts.inputContacts()))));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println(("Строки содержит недопустимые символы"));

        }




    }

}
