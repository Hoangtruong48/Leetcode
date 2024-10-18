package chua_nop;

import java.util.Arrays;

public class Problem_733_FloodFill {
    public static void dfs(int[][] image, int i, int j, int m, int n, int color, int sel){
        image[i][j] = color;
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        for(int k = 0;k < 4; k++)
        {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && y >= 0 && x < m && y < n && image[x][y] == sel)
            {
                dfs(image,x,y,m,n,color,sel);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int sel = image[sr][sc];
        if (sel == color)
            return image;
        dfs(image,sr,sc,m,n,color,sel);
        return image;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)));
    }
}
