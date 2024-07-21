package easy;

import java.util.HashMap;

public class Problem_575_DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = candyType.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(candyType[i])) {
                map.put(candyType[i], map.get(candyType[i]) + 1);
            } else {
                map.put(candyType[i], 1);
            }
        }
        int types = map.size();
        if (len / 2 >= types){
            return types;
        } else {
            return len / 2;
        }
    }
    public static void main(String[] args) {

    }
}
