package medium;

import java.util.*;

public class Problem_1921 {
    /*
     TODO: bài này đầu vào gồm 2 mảng, mảng 1 là khoảng cách giữa mình và quái vật(km),
      mảng 2 tương ứng là tốc độ(km/phút) và mỗi 1 phút thì có thể chém 1 con quái vật, yêu cầu bài
      toán là tìm số quái vật nhiều nhất có thể chém được.
      --> Sort theo khoảng cách gần nhất, và tốc độ lớn nhất rồi chém từng con 1.
      --> Cách này cút vì cập nhật một đoạn [L,R] trên mảng sẽ mất O(N)

      TODO: Tính bước mà quái vật đi đuợc đến đích = khoảng cách / tốc độ, sort mảng số bước
       chém con quái có số bước ít nhất(mỗi lần chém +1 res). Nếu res >= số bước --> quái đã đến được đích --> return

     */
    public static int eliminateMaximum(int[] dist, int[] speed) {
        double[] steps = new double[dist.length];
        for (int i = 0; i < dist.length; i++){
            steps[i] = 1.0 * dist[i] / speed[i];
        }
        Arrays.sort(steps);
        int res = 0;
        for (double step : steps) {
            if (res >= step) return res;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(eliminateMaximum(new int[]{3,2,4}, new int[]{5,3,2}));
    }
}
