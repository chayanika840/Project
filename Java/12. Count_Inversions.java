import java.util.*;
import java.io.*;

public class Count_Inversions {

    public static void main(String[]args) {
        //write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        mergeSort(arr,0, n-1); 
        System.out.println(count);
    }
    static int count = 0;
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        
        int mid = (lo + hi) / 2;
        
        int[] left = mergeSort(arr, lo, mid);
        int[] right = mergeSort(arr, mid + 1, hi);
        
        int[] merged = merge2sortedArrays(left, right);
        return merged;
    }
    
    public static int[] merge2sortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else{
                count += (a.length - i);
                res[k] = b[j];
                j++;
                k++;
            }
        }
        
        
        while(i < a.length){
            res[k] = a[i];
                i++;
                k++;
        }
        
        while(j < b.length){
            res[k] = b[j];
                j++;
                k++;
        }
        return res;
    }
    
}