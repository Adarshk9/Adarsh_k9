/*
 
arr = [ [1,1,0], [1,0,1],[0,0,0] ]
 = [0,1,1],[1,0,1],[0,0,0]
 = [1,0,0],[0,1,0],[1,1,1]

 for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
 */

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        for(int row=0;row<arr.length;row++)
        {
            reverse(arr[row]);
        }
        complement(arr);
        System.out.print("[");
        for(int row=0;row<arr.length;row++)
        {
            if(row==arr.length-1)
            {
                System.out.print(Arrays.toString(arr[row]));
            }
            else{
                System.out.print(Arrays.toString(arr[row])+",");
            }
        }
        System.out.print("]");        
    }
    static int[] reverse(int[] arr)
    {
        int start = 0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[][] complement(int[][] arr)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==0)
                {
                    arr[row][col]=1;
                }
                else{
                    arr[row][col]=0;
                }
            }
        }
        return arr;
    }    
}
