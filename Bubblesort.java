import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
   
    
    
}
