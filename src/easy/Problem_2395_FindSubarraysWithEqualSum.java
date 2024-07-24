package easy;

import java.util.HashMap;

public class Problem_2395_FindSubarraysWithEqualSum {
    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[i] + nums[i + 1], map.getOrDefault(nums[i] + nums[i + 1], 0) + 1);
            if (map.get(nums[i] + nums[i + 1]) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[]{0,0,0}));
    }
}
