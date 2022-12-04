package HW_lesson4;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Operation {

    public static List<String> addArray(List<String> array) {
        array.add("Ya");
        array.add("lomal");
        array.add("stekloooou");
        array.add("kak");
        array.add("chocolate");
        array.add("v");
        array.add("rukeeee");
        array.add("Ya");
        array.add("lomal");
        array.add("steklooou");
        array.add("kak");
        array.add("chocolate");
        array.add("Ya");
        return array;
    }


    public static void uniqueWords(List<String> array) {
        Set<String> valueArray = new LinkedHashSet<>();
        for (String arr : array) {
            String value = arr.toLowerCase();
            valueArray.add(value);
        }
        for (String valueArr : valueArray) {
            int i = 0;
            for (String arr : array) {
                String value = arr.toLowerCase();
                if(valueArr.equals(value)) i++;
            }
            System.out.println("Words - " + "\"" + valueArr + "\"" + " appears in the list " + i + " times");
        }

    }
}