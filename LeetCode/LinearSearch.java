/*
What is Searching? 
Searching is locating a perticuler element in collection of element
for (i=0;i<6;i++)
[18,6,22,13,4,-1]
target = 222
-1

Seaching in String
 */

package LeetCode;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18,6,22,13,4,-1};
        System.out.println(search(arr, -1));
                        
    }
    static boolean search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
