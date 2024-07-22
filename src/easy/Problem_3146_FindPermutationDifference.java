package easy;

public class Problem_3146_FindPermutationDifference {
    public static int findPermutationDifference(String s, String t) {
        int res = 0;
        int[] cntS = new int[27];
        int[] cntT = new int[27];
        for (int i = 0; i < s.length(); i++) {
            cntS[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < t.length(); i++) {
            cntT[t.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i <= 26; i++){
            res += Math.abs(cntS[i] - cntT[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }
}
