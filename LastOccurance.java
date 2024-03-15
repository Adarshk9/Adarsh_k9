//package LeetCode.To_upload;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {6,6,6,6,12,13,18,20,25};
        int target = 6;
        System.out.println(lastOccurance(arr, target));
        
    }
    static int lastOccurance(int[] arr,int target)
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
                //We have got a possible answer but we have to check RHS
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
    
}
