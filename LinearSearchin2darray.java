/*
[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
5 = [1,1]

 */
//package LeetCode.To_upload;

public class LinearSearchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        search(arr, 5);
        
    }   
    static void search(int[][] arr,int target)
    {
        boolean check = false;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    System.out.println(row+" "+col);
                    check = true;
                }
            }
        }
        if(!check)
        {
            System.out.println(-1+" "+-1);
        }
    } 
}
