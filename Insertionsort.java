/*
Bubble - 
selection - 
Insertion sort - 
In this we partially sort the array
At first we sort 0 to 1 index
[5,4,3,2,1]
[4,5,3,2,1]
[4,3,5,2,1]
[3,4,5,2,1]
For every index that you are at put that element at the correct index of LHS
[5,2,3,1,4]
[2,5,3,1,4]
[2,3,5,1,4]
When the element to the left hand side is smaller than i then don't swap
[1,2,3,5,4]


Time complexity - 
Worst case - 
[5,4,3,2,1]<arr.legth-1
[4,5,3,2,1]
[1,2,4,5]
Big O N^2
Everytime we have swap
Best case - 
[1,2,3,4,5]
Big O N


Why we use Insertion sort?
Steps/swaps are getting reduced as compared to Bubble and selection sort
It works good when the array is partially sorted

 */
//package LeetCode.To_upload;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {69,0,8,10,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++) // 
        {
            for(int j=i+1;j>0;j--)//
            {
                if(arr[j]<arr[j-1])//
                {
                    swap(arr, j, j-1);//[5,3,4,2,1]
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
