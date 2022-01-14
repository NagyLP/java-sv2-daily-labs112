package day05;

import java.util.HashMap;
import java.util.Map;

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
}
