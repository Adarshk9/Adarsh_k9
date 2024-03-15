/*
Ceiling ka matlab छत
[5,10,15,20,25]
target = 8
Ceiling of a number means is the smallest largest element greater than the target element

If the element is present return that element 
If the element is not present return ceiling of that element

[5,10,15,20,25]
target = 14
start = mid  / [start = mid+1]
[5,10,15]
mid = 10
[15]

while(start<end)
{

}
when the loop is violated there is a chance that start and end are at same index so we can return any of start or end
[]
[5,10,15,20,25]3+4/2 = 7/2 3.5
target = 18
mid = 15
[20,25]
end = mid
[20]
mid = start+end/2   0+5/2 =2.5 2
[6,12,18,24,30,36]
target  = 20
[24,30,36]
[24,30]
[24]

[36,30,24,18,12,6]
target = 20
mid = 24
[36,30,24]
mid = 30
start = mid-1 "Because there is no chance of mid to be ceiling"
[24]

*/


public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr = {6,12,18,24,30,36};
        int target = 18;
        System.out.println(ceiling(arr, target));
        
    }
    static int ceiling(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = (start+end)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            }
            if(target>arr[mid])
            {
                start = mid+1;
            }
            if(target<arr[mid])
            {
                end = mid;
            }            
        }
        return arr[start];
    }
    
}
