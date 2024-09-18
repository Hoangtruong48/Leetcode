package medium;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_179_LargestNumber {
    public static String largestNumber(int[] nums) {
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        List<String> numberString = new ArrayList<>(Arrays.stream(nums).mapToObj(Integer::toString)
                .toList());
        if (numberString.get(0).equals("0")) {
            return "0";
        }
        numberString.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });
        for (int i = 0; i < nums.length; i++) {
            sb.append(numberString.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{3,30,34,5,9}));
    }
}
