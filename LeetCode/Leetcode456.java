package LeetCode;
class Leetcode456 {
    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));
        
    }
    static boolean find132pattern(int[] nums) {
        // boolean check = false;
         for(int i=0;i<nums.length-2;i++)
         {
            System.out.println("i = "+i);
            System.out.println(nums[i]);
            System.out.println(nums[i+1]);
            System.out.println(nums[i+2]);
             if(nums[i+1]>nums[i] && nums[i+2]>nums[i] && nums[i+1]>nums[i+2])
             {
                 return true;                
             }
         }
         return false;
         
     }
    
}
