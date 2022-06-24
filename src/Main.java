import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 4, 9, 10, 17, 8, 7, 1, 7};
        sortArr(arr);
    }

    public static int[] sortArr(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int val : arr) {
            Integer integer = map.get(val);
            if (integer == null) {
                map.put(val, 1);
            } else {
                map.put(val, integer + 1);
            }
        }

        for (Integer val : map.keySet()) {
            int cnt = map.get(val);
            for (int i = 0; i < cnt; i++) {
                System.out.print(" " + val);
            }
        }
        return arr;
    }
}