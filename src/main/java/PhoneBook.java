import java.util.TreeMap;

public class PhoneBook {

    TreeMap<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String number){
        if (name == null || number == null){
            throw new NullPointerException("Name or phone number is empty");
        }

        phoneBook.putIfAbsent(name, number);

        return phoneBook.size();
    }
}
