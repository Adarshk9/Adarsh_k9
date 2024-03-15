/*
arr = [9,9,9,2]
k = 34

num = 0  //num =num*10+arr[i]
num = 1200
num+k
num =1234
[0,0,0,0]
num%10 =4 [3] n=n/10
num%10 = 3 [2] num=num/10
num%10 =2 [1] num=num/10
num%10 1

num = num+arr[i]*10
num = num*10+arr[i]
[1,2,3]

num = 123
 */

import java.util.Arrays;

public class Leetcode989 {
    public static void main(String[] args) {
        int[] arr = {2,1,5};
        int k = 806;
        addtoarray(arr, k);
        
    }
    static void addtoarray(int[] arr,int k)
    {
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
            num=num*10+arr[i];
        }
        num = num+k;
        int temp = num;
        int count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int[] arr2 = new int[count];
        for(int i=arr2.length-1;i>=0;i--)
        {
            int x = num%10;
            arr2[i] = x;
            num=num/10;
        }
        System.out.println(Arrays.toString(arr2));

    }
        
}
