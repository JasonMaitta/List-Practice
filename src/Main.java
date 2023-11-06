import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = generateArrayWithBounds(5, 10, 1);
        System.out.println("Original List: " + originalList);

        List<Integer> reversedList = reverseList(originalList);
        System.out.println("Reversed List: " + reversedList);

        String text = "Ham";
        List<Character> charList = stringToList(text);
        System.out.println("String to List: " + charList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Amoeba");
        stringList.add("Grape");
        stringList.add("amoeba");
        System.out.println("Original String List: " + stringList);
        findAndDestroyAllAmoebas(stringList);
        System.out.println("Modified String List: " + stringList);
    }

    public static List<Integer> reverseList(List<Integer> inputList) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversedList.add(inputList.get(i));
        }
        return reversedList;
    }

    public static List<Character> stringToList(String input) {
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }
        return charList;
    }

    public static List<Integer> generateArrayWithBounds(int start, int end, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i += step) {
            result.add(i);
        }
        return result;
    }

    public static void findAndDestroyAllAmoebas(List<String> stringList) {
        stringList.removeIf(s -> s.toLowerCase().contains("amoeba"));
    }
}



