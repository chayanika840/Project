class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        //put pointer on first row lst column
        int i = 0, j = m - 1; 
        
        while(i < n && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            
            //if target is less than current pointer -> move left
            if(matrix[i][j] > target){
                j--;
            }else{ // else move down
                i++;
            }
        }
        return false;
    }
}