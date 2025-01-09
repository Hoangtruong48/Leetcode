package codeforces.round984_div3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean result = true;
            for (int i = 1; i < n; i++) {
                int value = Math.abs(arr[i] - arr[i - 1]);
                if (value != 5 && value != 7) {
                    result = false;
                    break;
                }
            }
            System.out.println(result ? "YES" : "NO");
        }
    }

}
