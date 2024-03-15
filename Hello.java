import java.util.Arrays;

class Hello{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        int[] ans = new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=arr[i];
            ans[i+arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(ans));       
        
    }
}