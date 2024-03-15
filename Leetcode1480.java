/*

l = [1,2,3,4]
op = [1,3,6,10]
l = [1,2,3,4]
max = 10
arr = [1,3,6,10]

 */

//import java.util.*;
//import java.lang.*;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            arr[i] = sum;            
        }
        //System.out.println(Arrays.toString(arr));
    
    }
}
