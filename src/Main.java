import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.Add("Иван", 12345);
        phoneBook.Add("Иван", 34255);
        phoneBook.Add("Николай", 87654);
        phoneBook.Add("Василий", 32456);
        phoneBook.Add("Василий", 64562);
        phoneBook.Add("Василий", 54335);
        phoneBook.Add("Александр", 985455);

        System.out.println("Не сортированный справочник:");
        System.out.println(phoneBook.Print());
        System.out.println("Сортированный справочник по количеству телефонов:");
        System.out.println(phoneBook.PrintSorted());
    }

}