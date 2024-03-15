/*
Bubble sort - 
[5,4,3,2,1]
[4,5,3,2,1]
[4,3,5,2,1]
[4,3,2,5,1]
[4,3,2,1,5]


Selection sort - 
Select an element and swap it at its right index
we can select either the largest one or the smallest one
if we select largest we have to put it at the last index

[4,5,2,3,1]
5 is the largest element here so it gonna swap with index 4
[4,1,2,3,5]
[3,1,2,4,5]
[2,1,3,4,5]
[1,2,3,4,5]

Time complexity - 
n + n-1 + n-2 + .... + 1
n(n-1)/2
n^2-n/2  
least dominating term will be removed and more dominating term will be the time complexity
n^2
best case - 
When array is already sorted
[1,2,3,4,5]

Space complexity - 
Do this algorithm is creating extra space?
Big O(1)



Selection sort - 

 */
//package LeetCode.To_upload;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0};
        Selection(arr);
        System.out.println(Arrays.toString(arr));        
    }
    static void Selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int max = getmax(arr, 0, last);
            swap(arr, max, last);            
        }
    }
    static int getmax(int[] arr,int start,int last)
    {
        int max = start;
        for(int i=start;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
