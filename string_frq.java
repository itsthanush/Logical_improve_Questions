import java.util.*;
public class string_frq {
    public static void main(String[] args) {
        String[] words = {"apple", "angle", "ball", "bottle", "axe"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            char frist = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            String combination = "" + frist + last;

            map.put(combination, map.getOrDefault(combination, 0) + 1);
        }

        int max = 0;

        for (String val : map.keySet()) {
            if (map.get(val) > max) {
                max = map.get(val);
            }
        }
        System.out.print(max);

    }
}
