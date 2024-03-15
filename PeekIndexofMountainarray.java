/*
Mountain Array - 
It is an array which increase in half and part and decrease in other half part.
Example - 
[1,2,3,4,5,6,7,6,5,4,3,2,1] [1,7,4,3,1]
from 1 to 7 it is increasing
after that it is decreasing
We need to find the peek element of we can say the largest element in this array
NOTE - THE RIGHTMOST ELEMENT CAN NEVER BE A MID 

Aproach
[1,2,3,4,5,3,2,0]
mid = start + end /2 //4
4 5 //Ascending part
start = mid+1
[5,3,2,0]
3 2
Descending part
It may be possible that middle element is peek
end = mid

[5,3]
5 3 desceniding part
end = mid
[5]
 */
//package LeetCode.To_upload;

public class PeekIndexofMountainarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7,7,6,5,4,3,2,1};
        System.out.println(peekelement(arr));       
    }
    static int peekelement(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = (start+end)/2;
            if(arr[mid]<arr[mid+1])
            {
                //We are in Ascending part
                start = mid+1;
            }
            else{
                //we are in descending part
                //It may be possible that mid is peek so
                end = mid;
            }
        }
        //At the end start and end both will point at the same element so we can return any of them
        return end;
    }
    
}
