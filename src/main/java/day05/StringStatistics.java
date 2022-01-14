package day05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringStatistics {

    private Map<Character, Integer> text = new HashMap<>();

    public Map<Character, Integer> countChars(String text) {
        for (char item : text.toCharArray()) {
            if (this.text.containsKey(item)) {
                this.text.put(item, this.text.get(item) + 1);
            } else {
                this.text.put(item, 1);
            }
        }
        return this.text;
    }


//    public int numberOfDifferentLetters(String s) {
//        Set<Character> result = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            result.add(s.charAt(i));
//        }
//        return result.size();
//    }
//
//    public Map<Character, Integer> numberOfCharactersByCharacter(String s) {
//        Map<Character, Integer> result = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (!result.containsKey(s.charAt(i))) {
//                result.put(s.charAt(i), 1);
//            } else {
//                result.put(s.charAt(i), result.get(s.charAt(i) + 1));
//            }
//        }
//            return result.size();
//    }

}
