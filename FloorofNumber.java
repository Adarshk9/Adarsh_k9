/*
target = 17
[6,12,18,24,30,36]
start = mid+1
end = mid-1
mid = 18
target < mid
end = mid-1 //12
start = 0 [6,12]
mid = 6
[12]

*/
//package LeetCode.To_upload;

public class FloorofNumber {
    public static void main(String[] args) {
        int[] arr = {6,12,18,24,30,36};
        int target = 10;
        System.out.println(floor(arr, target));
        
    }
    static int floor(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            }
            if(target>arr[mid])
            {
                start = mid+1;
            }
            if(target<arr[mid])
            {
                end = mid-1;
            }            
        }
        return arr[end];
    }
    
}
