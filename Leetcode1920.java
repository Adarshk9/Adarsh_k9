import java.util.Arrays;
import java.util.Scanner;
/*
l = [0,2,1,5,3,4]
op = [0,1,2,4,5,3]

l = [5,0,1,2,3,4]
op = [4,5,0,1,2,3]

l = [0,0,0,0,0]
s = [null,null]




arr = [0,2,1,5,3,4] i = 4
more = [0,0,0,4,0,3]
more[0] = arr[]
more[i] = 5


1 2 3 4 5
[1,2,3,4,5]

 */
public class Leetcode1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = "+Arrays.toString(arr));
        sc.close();
        don(arr);

    }
    static void don(int[] arr)
    {
        int[] more = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            more[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(more));
        
    }

    
}
