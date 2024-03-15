/*
[6,12,12,12,18,20,25]
1


condition 1 - if target > mid  :start = mid+1
condition 2 - if target < mid  : end = mid-1
condition 3 - target == mid this may the first occurance but I am gonna check LHS of the middle element

 */


public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {6,6,6,6,12,13,18,20,25};
        int target = 6;
        System.out.println(firstOccurance(arr, target));
        
    }
    static int firstOccurance(int[] arr,int target)
    {
        int start= 0;
        int end = arr.length-1;
        int ans = -1;
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
                //We have got a possible answer but we have to check LHS
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    
}
