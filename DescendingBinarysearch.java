

public class DescendingBinarysearch {
    public static void main(String[] args) {
        int[] arr = {12,10,8,6,4,2};
        int target = 2;
        System.out.println(DescendingBinary(arr, target));
        
    }
    static int DescendingBinary(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;// [8,6,4,2,0]
        while(start<=end)
        {
            int mid = (start+end)/2;
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
        return -1;
    }
    
}
