package collections.arraylist;

import java.util.HashMap;

public class CharsFinder {
    public static void main(String[] args) {
        String s = "giosabxsdsdaaaddig";
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (charFrequency.containsKey(character)) {
                int count = charFrequency.get(character);
                charFrequency.put(character, ++count);
            } else {
                charFrequency.put(character, 1);
            }
        }

        System.out.println(charFrequency);
    }
}
