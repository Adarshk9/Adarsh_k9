//package LeetCode.To_upload;

public class Leetcode55 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
        
    }
    static boolean jump(int[] arr)
    {
        int index = 0;
        while(index<=arr.length-1)
        {
            System.out.println(index);            
            index = index+arr[index];
            if(index==arr.length-1)
            {
                return true;
            }
        }
        return false;
    }
    
}
