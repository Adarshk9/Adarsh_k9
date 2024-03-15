/*
[1,2,3,4,5]
whil(s<e)
start = 1   end =5 
Until start is less then end swap it and increase the value of start and decrease the value of end by 1
[1,2,3,4,5]
[5,2,3,4,1]
[5,4,3,2,1]

j =arr.length 
for(int i=0;i<j;i++)
{
    arr[j-1]=arr[i];
    j = j-1;
}

[1,2,3,4,5]
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
