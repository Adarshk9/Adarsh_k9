/*
 arr = [123,45,6,7891] op = 2


 */
public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {123,45,6,7891};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(countcheck(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
    static boolean countcheck(int n)
    {
        boolean check=false;
        int c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        if(c%2!=0)
        {
            check=true;
        }
        return check;
    }    
}
