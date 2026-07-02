class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        Boolean[][][] dp = new Boolean[m][n][health + 1];
        boolean[][] visited = new boolean[m][n];

        return dfs(grid, 0, 0, health, visited, dp);
    }

    static boolean dfs(List<List<Integer>> grid, int i, int j, int health,
                       boolean[][] visited, Boolean[][][] dp) {

        if (i < 0 || j < 0 || i >= grid.size() || j >= grid.get(0).size()) {
            return false;
        }

        if (visited[i][j]) {
            return false;
        }

        health -= grid.get(i).get(j);

        if (health <= 0) {
            return false;
        }

        if (i == grid.size() - 1 && j == grid.get(0).size() - 1) {
            return true;
        }

        if (dp[i][j][health] != null) {
            return dp[i][j][health];
        }

        visited[i][j] = true;

        boolean ans = dfs(grid, i + 1, j, health, visited, dp) ||
                      dfs(grid, i - 1, j, health, visited, dp) ||
                      dfs(grid, i, j + 1, health, visited, dp) ||
                      dfs(grid, i, j - 1, health, visited, dp);

        visited[i][j] = false;

        dp[i][j][health] = ans;
        return ans;
    }
}