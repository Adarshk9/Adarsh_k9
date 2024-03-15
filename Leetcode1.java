/*

 */
public class Leetcode1 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        index(arr, target);

        
    }
    static int[] index(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};                    
                }
            }
        }
        return new int[]{-1,-1};

    }
    
}
