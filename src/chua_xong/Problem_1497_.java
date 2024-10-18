package chua_xong;



public class Problem_1497_ {
    public static boolean canArrange(int[] arr, int k) {
        long sum = 0;
        int n = arr.length;
        for (int j : arr) {
            sum += j;
        }
        return sum % k == 0 && sum % (n / 2) == 0;
    }
    public static void main(String[] args) {
        System.out.println(canArrange(new int[]{1, 2, 3, 4, 5,6}, 2));
    }
}
