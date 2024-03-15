import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            if(n>max)
            {
                max=n;
                //System.out.println(max);
            }                        
        }
        System.out.println(max);
        sc.close();
    }
    
}
