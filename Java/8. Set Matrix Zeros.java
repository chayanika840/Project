class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean row = false, col = false;
        
        //if the first row and the first col contains 0, then mark true
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                col = true;
            }
        }
        for(int j = 0; j < m; j++){
            if(matrix[0][j] == 0){
                row = true;
            }
        }
        
        //traverssing except first row and first col
        //using the first row and first col as dummy array
        //also fill dummy array
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        //marking zeroes with the help of internal dummy array
        //not traverssing through using the (0,0) element
        for(int i = 1; i < n; i++){  
             if(matrix[i][0] == 0){
                 for(int j = 0; j < m; j++){
                     matrix[i][j] = 0;
                 }
             }
        }
        for(int j = 1; j < m; j++){
             if(matrix[0][j] == 0){
                 for(int i = 0; i < n; i++){
                     matrix[i][j] = 0;
                 }
             }
        }
        
        //marking the whole row or whole column as zero if any 0 was there in them
        if(row){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
        
        
}
}