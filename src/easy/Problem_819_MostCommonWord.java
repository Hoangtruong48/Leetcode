package easy;

import java.util.*;

public class Problem_819_MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("[!?,;'.\\s]+");
        Set<String> bannedList = new HashSet<>();
        for (String ban : banned){
            String temp = ban.toLowerCase();
            bannedList.add(temp);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String temp = word.toLowerCase();
            if (!bannedList.contains(temp)){
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        int cnt = 0;
        String res = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > cnt){
                res = entry.getKey();
                cnt = entry.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
}
