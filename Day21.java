//Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

//For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Day21 {
    public static void main(String[] args) {
            int[][] arr = {{30, 75}, {0, 50}, {60, 150}};
            System.out.println(ans(arr));

    }
    public static int ans(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));

        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        int cnt = 0;
        for (int[] a : arr) {
            if (PQ.isEmpty()) {
                cnt++;
                PQ.offer(a[1]);
            } else {
                if (a[0] >= PQ.peek()) {
                    PQ.poll();
                } else {
                    cnt++;
                }

                PQ.offer(a[1]);
            }
        }

        return cnt;
    }
}
