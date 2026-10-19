
class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int[] ans = new int[2];

        int i = 0;
        int j = 0;

        visited[0][0] = true;

        while (true) {
            if (grid[i][j] == 'R') {
                if (j + 1 >= n || visited[i][j + 1]) {
                    break;
                } else {
                    j++;
                }
            } 
            else if (grid[i][j] == 'D') {
                if (i + 1 >= m || visited[i + 1][j]) {
                    break;
                } else {
                    i++;
                }
            } 
            else if (grid[i][j] == 'L') {
                if (j - 1 < 0 || visited[i][j - 1]) {
                    break;
                } else {
                    j--;
                }
            } 
            else if (grid[i][j] == 'U') {
                if (i - 1 < 0 || visited[i - 1][j]) {
                    break;
                } else {
                    i--;
                }
            }

            visited[i][j] = true;
            ans[0] = i;
            ans[1] = j;
        }

        return ans;
    }
}
