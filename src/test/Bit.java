package test;

public class Bit {
    public static void main(String[] args) {
        long a = (1L << 31) - 1;
        System.out.println((1 << 31 ) - 1 - Integer.MAX_VALUE);
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println((1L << 64 - 1) - 1);
        int num_max = 0x7fffffff;
        System.out.println(num_max);

    }
}
