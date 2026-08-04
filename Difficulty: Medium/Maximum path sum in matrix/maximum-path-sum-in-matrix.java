class Solution {
    public int maximumPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];
        // Initialize dp with -1
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = Integer.MIN_VALUE;
        // Try starting from every column in the first row
        for (int j = 0; j < m; j++) {
            ans = Math.max(ans, pathSum(mat, 0, j, dp));
        }
        return ans;
    }
    public int pathSum(int[][] mat, int row, int col, int[][] dp) {

        // Out of bounds
        if (col < 0 || col >= mat[0].length)
            return Integer.MIN_VALUE;
        // Last row
        if (row == mat.length - 1)
            return mat[row][col];
        // Already computed
        if (dp[row][col] != -1)
            return dp[row][col];
        int left = pathSum(mat, row + 1, col - 1, dp);
        int down = pathSum(mat, row + 1, col, dp);
        int right = pathSum(mat, row + 1, col + 1, dp);
        dp[row][col] = mat[row][col] + Math.max(left, Math.max(down, right));
        return dp[row][col];
    }
}