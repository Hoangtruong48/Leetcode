package chua_xong;

public class Problem_717 {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1 || (bits.length == 2 && bits[0] == 0)) {
            return true;
        }
        int len = bits.length;
        if (bits[len - 2] == 0 && bits[len - 1] == 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
