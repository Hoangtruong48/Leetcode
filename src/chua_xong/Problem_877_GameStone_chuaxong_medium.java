package chua_xong;

public class Problem_877_GameStone_chuaxong_medium {
    public static boolean stoneGame(int[] piles) {
        int first = 0, last = piles.length - 1;
        int ailice = 0;
        int box = 0;
        boolean a = false;
        int iter = 0;
        while (first < last) {
            System.out.println(++iter + " : " +  first + " - " +  last);
            int maxx = Math.max(piles[first], piles[last]);
            if (!a){
                ailice += maxx;
                a = true;
            } else {
                box += maxx;
                a = false;
            }
            if (piles[first] > piles[last]){
                first++;
            } else if (piles[last] > piles[first]){
                last--;
            } else {
                if (first + 1 >= piles.length){
                    last--;
                }
                if (last - 1 < 0){
                    first++;
                }
                if (piles[first + 1] > piles[last - 1]){
                    last--;
                } else {
                    first++;
                }
            }
        }
        System.out.println(ailice + " " + box);
        return ailice > box;
    }
    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{7,8,8,10}));
    }
}
