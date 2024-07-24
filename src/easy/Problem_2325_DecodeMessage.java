package easy;

import java.util.HashMap;

public class Problem_2325_DecodeMessage {
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int a = 97;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), (char) a);
                a++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                res.append(' ');
            } else {
                res.append(map.get(message.charAt(i)));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog",
                "vkbs bs t suepuv"));
    }
}
