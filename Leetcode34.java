//package LeetCode.To_upload;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] arr2 = searchRange(arr, target);
        System.out.println(Arrays.toString(arr2));        
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
                
    }
    static int search(int[] nums,int target,boolean firstoccurance)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else
            {
                if(firstoccurance)
                {
                    ans = mid;
                    end = mid-1;
                }
                else{
                    ans =mid;
                    start = mid+1;
                }
            }
        }
        return ans;

    }
    
}
