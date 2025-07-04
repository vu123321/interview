import java.util.Arrays;
import java.util.PriorityQueue;

public class _3342_FindMinimumTimeToReachLastRoom_2 {
    public static void main(String[] args) {

        int[][] matrix = {{0, 4}, {4, 4}};
        System.out.println("result: " + minTimeToReach(matrix));
    }

    private static int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        // Initialize a distance matrix filled with maximum integer values
        int[][] distance = new int[n][m];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Starting point (0, 0) has a distance of 0
        distance[0][0] = 0;

        // Priority queue to store cells in the form [current_distance, row, column]
        // Sorted by current_distance
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        priorityQueue.offer(new int[]{0, 0, 0});

        // Directions arrays for moving up, down, left, and right

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Process until we find the minimum distance to the bottom-right corner
        while (true) {
            // Get the element with the smallest distance
            int[] current = priorityQueue.poll();
            int currTime = current[0];
            int currRow = current[1];
            int currCol = current[2];

            // Check if we've reached the bottom-right corner
            if (currRow == n - 1 && currCol == m - 1) {
                return currTime;
            }


            // If there is already a better distance, continue
            if (currTime > distance[currRow][currCol]) {
                continue;
            }

            // Explore all four possible directions (up, down, left, right)
            for (int[] d : dir) {
                int x = currRow + d[0];
                int y = currCol + d[1];

                // Check if new position is within bounds
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    // Calculate new time distance for this position
                    int cost = (currRow + currCol) % 2 + 1;

                    int start = Math.max(moveTime[x][y], currTime);

                    int nextTime = start + cost;
                    // If this path offers a shorter distance, update and enqueue
                    priorityQueue.offer(new int[]{nextTime, x, y});
                }
            }
        }
    }
}

