class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        StringBuilder firstRow = new StringBuilder();
        for(int j =0; j<n; j++){
            firstRow.append('.');
        }
        arr[0] = firstRow.toString();
        for(int i =1; i<m; i++){
            StringBuilder row = new StringBuilder();
            for(int j =0; j<n-1; j++){
            row.append('#');
            }
            row.append('.');
            arr[i] = row.toString();
        }
        return arr;
    }
}