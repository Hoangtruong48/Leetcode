package easy;

public class Problem_326_PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if (n < 0) return false;
        if (n == 1) return true;
        long res = 1;
        while (res <= n) {
            res *= 3;
            if (res == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(2147483647));
    }
}
