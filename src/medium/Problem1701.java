package medium;

public class Problem1701 {
    public static double averageWaitingTime(int[][] customers) {
        double res = customers[0][1];
        double start = customers[0][1] + customers[0][0];
        for (int i = 1; i < customers.length; i++) {
            if (start >= customers[i][0]) {
                res += (start - customers[i][0] + customers[i][1]);
                start += customers[i][1];
            } else {
                res += customers[i][1];
                start = customers[i][0] + customers[i][1];
            }
//            System.out.println(i + " " + (start - customers[i][0]));
        }
//        System.out.println(customers.length);
        return res / (customers.length);
    }

    public static void main(String[] args) {
        System.out.println(averageWaitingTime(new int[][]{{2, 3}, {6, 3}, {7, 5}, {11, 3}, {15, 2}, {18, 1}}));
    }
}
