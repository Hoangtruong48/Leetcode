package medium;

import java.util.HashMap;
import java.util.Map;

public class Problem_79_WorldSearch_chuaxong {
    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    public boolean exist(char[][] board, String word) {
        Map<Character, Pair<Integer, Integer>> map = new HashMap<>();
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(board[i][j], new Pair<>(i, j));
            }
        }
        Pair<Integer, Integer> temp = map.get(word.charAt(0));
        boolean check = true;
        for (int i = 1; i < word.length(); i++){

        }
        return check;
    }

    public static void main(String[] args) {

    }
}
