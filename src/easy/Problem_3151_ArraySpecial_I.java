package easy;

public class Problem_3151_ArraySpecial_I {
    public static boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0 || nums[i - 1] % 2 != 0 && nums[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{4, 3, 1, 6}));
    }
}
