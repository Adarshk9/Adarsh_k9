/*
What is Binary Search?
Condition for Binary search : 
    Array must be sorted in Ascending or Descending order
In this algorithm we divide the array into two parts by finding its middle element and check whether the target is 
greater or lower than the middle element


If the array is sorted in Ascending order 
If the element is greater than the middle element then there is no sense to find the element to its left hand side
Just because the array is sorted
Vice-versa

If the array is sorted in Descending order 
If the element is greater than the middle element then there is no sense to find the element to its right hand side
Just because the array is sorted

[0,1,2,3,4]
[2,4,6,8,10]
start = 0
end = arr.length //4
mid = 2 //6
start = mid+1 //3

[8,10]

NOTE - Whenever start and end are equal then that is the element you are searching for.

NOTE - And when end becomes less than start that means the element is not present in the array
 */


public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 22;
        System.out.println(Binarysearch(arr, target));
        
    }
    static int Binarysearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
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
        return -1;
    }    
}
