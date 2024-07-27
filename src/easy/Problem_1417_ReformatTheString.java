package easy;

import java.util.ArrayList;

public class Problem_1417_ReformatTheString {
    public static String reformat(String s) {
        ArrayList<Character> listChar = new ArrayList<Character>();
        ArrayList<Integer> listNumber = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                listNumber.add(c - '0');
            } else {
                listChar.add(c);
            }
        }
        if (Math.abs(listNumber.size() - listChar.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (listNumber.size() > listChar.size()) {
            for (int i = 0; i < listChar.size(); i++) {
                sb.append(listNumber.get(i));
                sb.append(listChar.get(i));
            }
            sb.append(listNumber.get(listNumber.size() - 1));
        }
        if (listNumber.size() < listChar.size()) {
            for (int i = 0; i < listNumber.size(); i++) {
                sb.append(listChar.get(i));
                sb.append(listNumber.get(i));
            }
            sb.append(listChar.get(listChar.size() - 1));
        }
        if (listNumber.size() == listChar.size()) {
            for (int i = 0; i < listNumber.size(); i++) {
                sb.append(listChar.get(i));
                sb.append(listNumber.get(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformat("ab123"));
    }
}
