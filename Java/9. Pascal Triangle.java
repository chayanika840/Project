import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        //row is current row, pre is prevous row
        List<Integer> row, pre = null;
        
        for(int i = 0; i < numRows; i++){
            //everytime we visit a new row, we intialize it with empty arrayList
            row = new ArrayList<Integer>();
            //as no. of col = n0. of rows
            for(int j = 0; j <= i; ++j){
                //if it is first col or last col ans = 1
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    //add prevs rows j-1 and j element
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            } 
            //pre gets current row
            pre = row;
            res.add(row);
        }
        return res;
        
    }
}