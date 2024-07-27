package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem_1207_UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            } else {
                set.add(entry.getValue());
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2}));
    }
}
