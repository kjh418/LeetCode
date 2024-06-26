class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int totalSum = 0;

        // 각 행을 오름차순으로 정렬
        for (int[] row : grid) {
            Arrays.sort(row);
        }

        // 각 열에서 가장 큰 값을 더함
        for (int col = 0; col < grid[0].length; col++) {
            int maxInColumn = Integer.MIN_VALUE;
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col] > maxInColumn) {
                    maxInColumn = grid[row][col];
                }
            }
            totalSum += maxInColumn;
        }

        return totalSum;
    }
}