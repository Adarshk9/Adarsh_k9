/*
What is sorting?
Bubble 
Selection
Insertion
Cycle 
Radix
Recursion
Merge logn logn
Quick
                [0,1,2,3,4]
i = 0
Bubble sort - [5,4,3,2,1]
If arr[i+1]<arr[i] :
    swap
i = 1
[4,5,3,2,1] n
swap 1 and 2 index
[4,3,5,2,1]n-1
comparing 5 and 2
swap
[4,3,2,5,1] 
[4,3,2,1,5] the loop will run length-i times
if the value of i = 0 

After every pass the largest element in the array will come at the end

[4,3,2,1,5]
 comparing 4 and 3
 swap
[3,4,2,1,5]
[3,2,4,1,5]
[3,2,1,4,5]

[2,3,1,4,5]
[2,1,3,4,5]
[1,2,3,4,5]

time complexity - number of comparison made 
n+n-1+n-2....1
n(n+1)/2
n^2 + n/2
time complexity - n^2

[5,4,3,2,1]
[4,5,3,2,1]
[4,3,5,2,1]
[4,3,2,5,1]
[4,3,2,1,5]

space complexity - does your program is taking extra space?
if yes  then how much 
if not then the space complexity will be O(1)

stable or unstable :
[9,8,8,6,3]

[6,7,8,9,0]
linear search
best case is when the lowest comparison is made
4,3,1,2,5
[1,2,3,4,5]
best case and worst case will be equal

[1,2,3,4,5]
Break the loop when no swapping is made in a perticuler pass

if no swapping occurs in a perticuler pass this means array is sorted 

[5,4,3,2,1] l=4
i = 0  i<arr.length
 */
import java.util.Arrays;
public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean check = false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {//[1,2,3,4,5]
                    check = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(check==false)
            {
                break;
            }
        }
    }
    
}
