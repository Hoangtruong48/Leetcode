package easy;

public class Problem_389_FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int[] charS = new int[256];
        int[] charT = new int[256];
        for (char c : s.toCharArray()) {
            charS[c]++;
        }
        for (char c : t.toCharArray()) {
            charT[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (charS[i] != charT[i]) {
                return (char) i;
            }
        }
        return 'a';
    }
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
