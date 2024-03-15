/*
Cyclic Sort
When given that numbers are in range of 1 to n
We use cyclic sort

[5,3,4,2,1]

Algorithm :
[3,5,2,1,4]
correct index = value-1
[3,5,2,1,4]
[2,5,3,1,4]
[5,2,3,1,4]
[4,2,3,1,5]
[1,2,3,4,5]

DO not increase i if the element is not at correct index

Time Complexity - Big O (N)
Worst Case - 
When no - When no element is at its correct place 
 */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
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
