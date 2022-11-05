import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {

    TreeMap<String, String> phoneBook = new TreeMap<>();
    HashMap<String, String> numberBook = new HashMap<>();
    public int add(String name, String number){
        if (name == null || number == null){
            throw new NullPointerException("Name or phone number is empty");
        }

        if(phoneBook.putIfAbsent(name, number) == null){
            numberBook.put(number, name);
        };

        return phoneBook.size();
    }

    public String findByNumber(String number){

        if (numberBook.containsKey(number)){
            return numberBook.get(number);
        }
        return null;
    }

    public String findByName(String name){
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        return null;
    }

    public void printAllNames(){
        phoneBook.keySet().forEach( value -> System.out.println(value));
    }
}
