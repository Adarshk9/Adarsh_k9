/*
You are given numbers from 0 to n
length -  n+1
[4,0,2,1]
if arr[i]==arr.length
i++
[4,0,2,1]
[4,0,2,1]
0,4,2,1
i++
[0,1,2,4]

[0,1,2]


 */
public class Leetcode268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));        
    }
    static int missingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }            
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}    

