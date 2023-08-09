package ExceptionsInProgramming.Task3;

public class Program {
    public static void main(String[] args) {

        System.out.println("Введите данные в формате : - (фамилия имя отчество дата_рождения номер_телефона пол) - через пробел");
        VerifyStoreContacts.parseContacts(VerifyStoreContacts.inputContacts());
    }
}