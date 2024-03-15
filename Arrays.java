/*
int[] arr=new int[size];
int[] - Data type
arr - Array name
int[size] - size

int[] arr=new int[5]

[5,0,0,0,0]
new - keyword which use to create object in heap

How to assign value in array
Indexing
nums = [1,2,3,4,5]
0  1  2  3  4 
nums[0] = 5;
System.out.println(nums[0]) //that will return 5


int n=1234 
4321
n = 4321

[1,2,3,4]
[1,3,6,10]

[[],[],[]]
 */
public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5]; //[1,2,3,4,5]
        int len = nums.length;
        System.out.println(len);
        for(int i=0;i<5;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            nums[i] = i+1;
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    
}
