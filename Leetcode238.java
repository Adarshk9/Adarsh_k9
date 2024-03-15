/*

[1,2,3,4]

[]
static int[] productexceptItsef(int[] arr)
    {
        int arr2 = 
    }

[1,2,3,4]


 */

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int prod=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    prod = prod*arr[j];
                }
            }
            arr2[i] = prod;
        }
        System.out.println(Arrays.toString(arr2));        
    }    
}
/*
import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int prod=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    prod = prod*arr[j];
                }
            }
            arr2[i] = prod;
        }
        System.out.println(Arrays.toString(arr2));     

        
    }
    public int[] productExceptSelf(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int prod=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    prod = prod*arr[j];
                }
            }
            arr2[i] = prod;
        }
        return arr2;
        
    }
    
    
} 
 */
