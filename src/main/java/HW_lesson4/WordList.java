package HW_lesson4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WordList {

    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<>();
        wordArray = Operation.addArray(wordArray);
        System.out.println("This is the whole array:");
        System.out.println(wordArray + "\n");
        System.out.println("These are the unique values of this array:");
        Operation.uniqueWords(wordArray);
        System.out.println();




        Phonebook phonebook = new Phonebook();

        phonebook.add(223344,"Kaladze");
        phonebook.add(223345,"Pedrinho");
        phonebook.add(223346,"Sisinho");
        phonebook.add(223347,"Kaka");
        phonebook.add(223348,"Kokorin");
        phonebook.add(223349,"Ananidze");
        phonebook.add(223350,"Mandanda");
        phonebook.add(223341,"Pivko");
        phonebook.add(223354,"Konoplyanka");
        phonebook.add(223377,"Krivoruchko");
        phonebook.add(233338,"Ogogo");
        phonebook.add(233388,"Ogogo");
        phonebook.add(223398,"Ebda");
        phonebook.add(123388,"Ebda");



        phonebook.get("Kaladze");
        phonebook.get("Ebda");
        phonebook.get("Ogogo");
        phonebook.get("Krivoruchko");
        phonebook.get("Pivko");
        phonebook.get("Mandanda");
        phonebook.get("Ananidze");
        phonebook.get("Konoplyanka");
        phonebook.get("Kokorin");
        phonebook.get("Kaka");
        phonebook.get("Sisinho");
        phonebook.get("Pedrinho");



        phonebook.get("Каккой-то левывый чувак");



    }
}

