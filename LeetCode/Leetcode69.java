package LeetCode;
import java.util.Scanner;
public class Leetcode69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 2;
        while(i*i<=n)
        {
            i++;
        }
        System.out.println(i-1);
        for(int j=1;j<10;j++)
        {
            if(j==5)
            {
                continue;
            }
            else{
                System.out.println(j);
            }
        }
    }
    
}
