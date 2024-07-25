package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem_970_PowerfulIntegers {
    public static Long powFast(int a, int b){
        if (b == 0) return 1L;
        if (b == 1) return (long)a;
        long powFast_ = powFast(a, b / 2);
        powFast_ *= powFast_;
        if (b % 2 != 0){
            powFast_ *= a;
        }
        return powFast_;
    }
    public static ArrayList<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Long> res = new HashSet<>();
        for (int i = 0; i < 22; i++){
            if (x > 4 && i > 10){
                continue;
            }
            long xPow = powFast(x, i);
            for (int j = 0; j < 22; j++){
                if (y > 4 && j > 10){
                    continue;
                }
                long yPow = powFast(y, j);
                if (xPow < 0 || yPow < 0 || xPow > 1000000 || yPow > 1000000 || xPow + yPow > bound){
                    continue;
                }
                if (xPow + yPow <= bound) {
                    res.add(xPow + yPow);
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        res.forEach(k -> result.add(Math.toIntExact(k)));
        return result;
    }
    public static void main(String[] args) {
        System.out.println(powerfulIntegers(3, 5, 15));
    }
}
