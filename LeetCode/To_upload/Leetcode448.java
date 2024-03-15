import java.util.List;
import java.util.ArrayList;/*
Leetcode 448 (GOOGLE)
[4,3,2,7,8,2,3,1]
range = 1 to n
correct = value-1
[7,3,2,4,8,2,3,1]
[3,3,2,4,8,2,7,1]
[4,3,2,3,8,2,7,1]
[8,3,2,3,4,2,7,1]
[1,3,2,3,4,2,7,8]
[1,2,3,3,4,2,7,8]
[1,2,3,4,3,2,7,8]
missing number = [5,6]
After sorting if the element at i index is not at the correct index then the missing number will be index+1


[1,1]
Missing_Number = [2]




*/
public class Leetcode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));       
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> a1 = new ArrayList<>();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                a1.add(j+1);
            }
        }
        return a1;

        
    }    
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
    
}
