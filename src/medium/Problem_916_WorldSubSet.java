package medium;


import java.util.*;

public class Problem_916_WorldSubSet {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        /*
         lưu map với từng chữ của từng từ trong word2 với số lần xuất hiện nhiều nhất
         Ví dụ word2 có [a, aa] --> lưu trong map là <a,2>
         Duyệt words1 : check xem số từ tr
         */
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (String word : words2) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : word.toCharArray()) {
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
                if (map.containsKey(c)) {
                    if (map.get(c) < map1.get(c)) {
                        map.put(c, map1.get(c));
                    }
                } else {
                    map.put(c, 1);
                }
            }

        }
        for (String word : words1) {
            boolean check = true;
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : word.toCharArray()) {
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }
//            System.out.println(map1);
            for (char c : map.keySet()) {
                if (!map1.containsKey(c)) {
                    check = false;
                } else {
                    if (map.get(c) > map1.get(c)) {
//                        System.out.println(map.get(c) + " " + map1.get(c));
                        check = false;
                    }
                }
            }
            if (check) {
                res.add(word);
            }
        }
//        System.out.println(map);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                new String[]{"e", "oo"}));
    }
}
