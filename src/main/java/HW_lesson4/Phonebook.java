package HW_lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Phonebook {

    private Map<Integer, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add(Integer number, String familyName) {
        phonebook.put(number, familyName);
    }
    public void get(String familyName){
        if(phonebook.containsValue(familyName)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(familyName)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("This name is not in the directory");
        }
    }
}

