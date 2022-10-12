class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        //transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        //reverse rows
        for(int i = 0; i < n; i++){
            int li = 0;
            int ri = m - 1;
            
            while(li <= ri){
                int t = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = t;
                li++;
                ri--;
            }
        }
    }
}