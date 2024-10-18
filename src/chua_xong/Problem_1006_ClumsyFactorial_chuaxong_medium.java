package chua_xong;

public class Problem_1006_ClumsyFactorial_chuaxong_medium {
    public static int clumsy(int n) {
        int cnt = 1;
        int res = n;
        for (int i = n - 1; i >= 1; i--){
            if (cnt == 1){
                res *= i;
            }
            if (cnt == 2){
                res /= i;
            }
            if (cnt == 3){
                res += i;
            }
            if (cnt == 4){
                res -= i;
                cnt = 0;
            }
            cnt++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(clumsy(192992));
    }
}
