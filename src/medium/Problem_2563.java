package medium;

import java.util.Arrays;

public class Problem_2563 {
    /*
    TODO: input: 1 dãy số n phần tử, và 2 số gồm số nhỏ(min) và số lớn(max)
     Yêu cầu: đếm xem có bao nhiêu cặp min <= a[i] + a[j] <= max với điều kiện: 0 <= i < j < n
     Solve: Đ
     Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
     init:       0,1,7,4,4,5
     after sort: 0 1 4 4 5 7
     Output: 6
     low: a[i] + x >= lower <=> x >= lower - a[i] --> Tìm vị trí đầu tiên có x >= lower - a[i]
     hight: a[i] + x <= upper <=> x <= upper - a[i] --> Tìm vị trí cuối cùng có x <= upper - a[i]
     0: low = 2, hight = 4
     1: low = 2, hight = 4
     2: low = 3, -1
     3:
     4:
     5:
     Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
     */

    public static int binarySearchFindPositionLargerToX(int[] arr, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else if (arr[mid] >= x) {
                r = mid - 1;
                res = mid;
            }
        }
        return res;
    }
    public static int binaSearchFindPositionLessThanToX(int[] arr, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= x) {
                l = mid + 1;
                res = mid;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;
        int ii = 0;
        int r = nums.length - 1;
        for (int num : nums) {
            int low = binarySearchFindPositionLargerToX(nums, ii + 1, r, lower - num);
            int high = binaSearchFindPositionLessThanToX(nums, ii + 1, r, upper - num);
            if (low != -1 && low <= high) {
                res += (high - low + 1);
            }
            ii++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[]{0,1,7,4,4,5}, 3, 6));

    }
}
