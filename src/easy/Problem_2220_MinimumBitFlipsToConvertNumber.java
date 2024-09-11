package easy;

public class Problem_2220_MinimumBitFlipsToConvertNumber {
    public static String numberToBinary(int num){
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            int k = num % 2;
            sb.append(k);
            num = num / 2;
            System.out.println("k = " + k + "num = " + num);
        }
        return sb.reverse().toString();

    }
    public static int minBitFlips(int start, int goal) {
        String startStr = numberToBinary(start);
        String goalStr = numberToBinary(goal);
        if (startStr.length() != goalStr.length()){
            int larger = Math.abs(startStr.length() - goalStr.length());
            StringBuilder sb = new StringBuilder();
            sb.append("0".repeat(larger));
            if (startStr.length() > goalStr.length()){
                sb.append(goalStr);
                goalStr = sb.toString();
            } else {
                sb.append(startStr);
                startStr = sb.toString();
            }
        }
        int res = 0;
        for (int i = 0; i < goalStr.length(); i++){
            if (startStr.charAt(i) != goalStr.charAt(i)){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlips(3, 4));
    }
}
