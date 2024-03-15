/*
Binary Search in Mountain array
GOOGLE AMAZON

[1,3,5,7,6,4,2,0]
7 
[1,3,5]
[6,4,2,0]
target = 0
First we have to find peek element of this array
We will check if the peek is target
otherwise we will binary search from 0 to peek-1
if the target is still not found then we will search from peek+1 to end

 */
//package LeetCode.To_upload;

public class SearchinMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2,0};
        int target = 10;
        System.out.println(search(arr, target));        
    }
    static int search(int[] arr,int target)
    {
        int peek = peekelement(arr);
        if(arr[peek]==target)
        {
            return peek;
        }
        int firsttry = OrderagnosticbinarySearch(arr, target, 0, peek-1);
        if(firsttry!=-1)
        {
            return firsttry;
        }
        return OrderagnosticbinarySearch(arr, target, peek+1, arr.length-1);

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
    static int OrderagnosticbinarySearch(int[] arr,int target,int start,int end)
    {
        boolean isAsc = true;
        if(arr[start]>arr[end])
        {
            isAsc = false;
        }
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(isAsc)
            {
                if(target>arr[mid])
                {
                    start = mid+1;
                }
                else if(target<arr[mid])
                {
                    end = mid-1;
                }
                else
                {
                    return mid;
                }
            }
            else{
                if(target>arr[mid])
                {
                    end = mid-1;
                }
                else if(target<arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        return -1;
    }
    
}
