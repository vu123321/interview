package _1353_maximum_number_of_events;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {

        int[][] events = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(maxEvents(events));
    }


    public static int maxEvents(int[][] events) {
        // Sắp xếp các sự kiện theo ngày bắt đầu, và nếu bằng nhau thì theo ngày kết thúc
        // Arrays.sort(events, (a, b) -> (a[0] - b[0]);
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxDay = 0;
        int ans = 0, j = 0;

        for (int[] event : events) {
            maxDay = Math.max(event[1], maxDay);
        }

        for (int day = 1; day <= maxDay; day++) {  // Giả sử ngày tối đa là 100000
            // Thêm các sự kiện bắt đầu vào hàng đợi

            while (j < events.length && events[j][0] == day) {
                pq.offer(events[j][1]);
                j++;
            }

            // Loại bỏ các sự kiện không thể tham dự
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Tham dự sự kiện nếu có
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }

        return ans;
    }
}
