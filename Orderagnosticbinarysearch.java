//package LeetCode.To_upload;

public class Orderagnosticbinarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,10};
        int target = 100;
        System.out.println(OrderagnosticbinarySearch(arr, target));        
    }
    static int OrderagnosticbinarySearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
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
