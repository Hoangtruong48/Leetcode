package easy;

import java.util.*;

public class Problem_1365_HowManyNumberAreSmallerThanTheCurrentNumber {
    public static int findFirstPosition(Integer arr[], int x){
        int l = 0, r = arr.length - 1;
        int res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x){
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < x){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rank = new int[101];
        Integer[] count = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(count, Comparator.comparingInt(a -> a));
        int[] res = new int[nums.length];
        for (int i = 0; i < count.length; i++) {
            int position = findFirstPosition(count, nums[i]);
//            System.out.println(nums[i] + " " + position);
            res[i] = position;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
}
