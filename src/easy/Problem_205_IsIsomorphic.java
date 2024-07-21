package easy;

import java.util.Arrays;
import java.util.Collections;

public class Problem_205_IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int len = s.length();
        int[] cntS = new int[256];
        int[] cntT = new int[256];
        for (int i = 0; i < len; i++) {
            if (cntS[s.charAt(i)] != cntT[t.charAt(i)]) {
                return false;
            }
            cntS[s.charAt(i)] = i + 1;
            cntT[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean k = isIsomorphic("foo", "bar");
        System.out.println(k);
    }
}
