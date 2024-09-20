package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_238_MovieZeros {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int cntZeros = 0;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) {
                cntZeros++;
                index++;
            } else {
                list.add(num);
            }
        }
        int index0 = 0;
        for (int i = 0; i < len - index; i++){
            nums[i] = list.get(index0++);
        }
        System.out.println(index);
        int indexLast = len - 1;
        while(index > 0){
            nums[indexLast--] = 0;
            index--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
