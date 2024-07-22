package medium;

public class Problem_2965_FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int len = grid[0].length;
        int cntGrid[] = new int[len * len + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                cntGrid[grid[i][j]]++;
            }
        }
        for (int i = 0; i <= len * len; i++) {
            if (cntGrid[i] == 0) {
                res[1] = i;
            }
            if (cntGrid[i] == 2){
                res[0] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
