package easy;

public class Problem_121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int max = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (max > prices[i]){
                max = prices[i];
            }
            res = Math.max(res, prices[i] - max);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
