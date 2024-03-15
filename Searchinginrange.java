/*
What do you mean by searching in range?
We are checking if the element is present in the given range or not

 */
//package LeetCode.To_upload;
import java.util.Arrays;
import java.util.Scanner;
public class Searchinginrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Arrays entered :");
        System.out.println("Start Index :");
        int startindex = sc.nextInt();
        System.out.println("Enter endindex :");
        int endindex = sc.nextInt();
        System.out.println("Enter target element :");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr, target, startindex, endindex));
               
    }
    static boolean check(int[] arr,int target,int startindex,int endindex)
    {
        for(int i=startindex;i<=endindex;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;

    }

    
}
