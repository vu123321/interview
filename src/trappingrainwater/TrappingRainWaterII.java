package trappingrainwater;

import java.util.PriorityQueue;

public class TrappingRainWaterII {
    public static void main(String[] args) {

        int[][] heightMap =
                {{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}};
        System.out.println("trappingRainWaterTwo: " + trappingRainWaterTwo(heightMap));
        trappingRainWaterTwo(heightMap);
    }

    private static int trappingRainWaterTwo(int[][] heightMap) {
        int rowCount = heightMap.length;// Số hàng của ma trận
        int colCount = heightMap[0].length;    // Số cột của ma trận

        boolean[][] vis = new boolean[rowCount][colCount];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (i == 0 || i == rowCount - 1 || j == 0 || j == colCount - 1) {
                    pq.offer(new int[]{heightMap[i][j], i, j});
                    vis[i][j] = true;
                }
            }
        }

        int ans = 0;
        int[] directions = {-1, 0, 1, 0, -1};

        while (!pq.isEmpty()) {

            var p = pq.poll();

            for (int k = 0; k < 4; k++) {
                int x = p[1] + directions[k], y = p[2] + directions[k + 1];
                if (x >= 0 && x < rowCount && y >= 0 && y < colCount && !vis[x][y]) {
                    ans += Math.max(0, p[0] - heightMap[x][y]);
                    vis[x][y] = true;
                    pq.offer(new int[]{Math.max(p[0], heightMap[x][y]), x, y});
                }
            }

        }
        return ans;
    }
}
