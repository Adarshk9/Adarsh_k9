/*
What is searching? 
Locating a periculer element in a group of element.


[8,5,9,0,2,-1]
target = 0 
If the target is found it returns its index otherwise it return -1



 */
//package LeetCode.To_upload;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8,5,9,0,2,-1};
        int target = 48347;
        System.out.println(search(arr, target));
        
    }
    static int search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    
}
