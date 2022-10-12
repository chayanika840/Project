import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        //1. Sort
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //2. ArrayLis of arrays type
        ArrayList<int[]> list = new ArrayList<>();
        //3. For each loop
        for(int[] interval: intervals){
            if(list.size() == 0){
                list.add(interval);
            }else{
                int[] prevInt = list.get(list.size() - 1);
                if(interval[0] <= prevInt[1]){
                    prevInt[1] = Math.max(prevInt[1], interval[1]);
                }else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
        
    }
}