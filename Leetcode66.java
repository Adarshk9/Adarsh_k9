import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        plusone(arr);
    }
    static void plusone(int[] arr)
    {
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
            num=num*10+arr[i];
        }
        num = num+1;
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
