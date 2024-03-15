/*
arr = [1,2,1]
op = [1,2,1,1,2,1]
 */

import java.util.Arrays;

public class Leetcode1929copy {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] arr3 = concatanate(nums);
        System.out.println(Arrays.toString(arr3));        
    }
    static int[] concatanate(int[] arr)
    {
        int[] arr2 = new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i] = arr[i];
            arr2[i+arr.length] = arr[i];
        }
        return arr2;
    }
    
}
