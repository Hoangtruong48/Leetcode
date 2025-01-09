package chua_xong;

import java.util.Arrays;

public class Problem2558 {
    public static long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        int i = 0;
        int index = gifts.length - 1;
        while (i < k){
            int sqrt = (int) Math.sqrt(gifts[index]);
            gifts[index] = sqrt;
            if (sqrt < gifts[index - 1]){
                index--;
            }
            i++;
        }
        System.out.println(Arrays.toString(gifts));
        long res = 0;
        for (int x : gifts) res += x;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }
}
