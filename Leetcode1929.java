/*
in = [1,2,3,4]
op = [1,2,3,4,1,2,3,4]

 */
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] in = new int[3];
        for(int i=0;i<in.length;i++)
        {
            in[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(in));
        int[] op = new int[in.length+in.length];
        for(int i=0;i<op.length;i++)
        {
            op[i] = in[i];
            op[i+in.length] = in[i];           
            
        }
        System.out.println(Arrays.toString(op));
        sc.close();

        // [1,2,3]  [1,2,3,1,2,3] i=1
    
        
    }
    
}
