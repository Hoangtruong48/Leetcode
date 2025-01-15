package easy;

import java.util.ArrayList;

public class Problem_796 {
    public static boolean rotateString(String s, String goal) {
        char first = goal.charAt(0);
        ArrayList<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == first) {
                System.out.println(i);
                indexs.add(i);
            }
        }
        System.out.println(indexs);
        for (Integer index : indexs) {
            String temp = s.substring(index) + s.substring(0, index);
            System.out.println(temp);
            if (temp.equals(goal)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("gcmbf", "fgcmb"));
    }
}
