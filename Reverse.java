/*
n = 4 %10 4     output = 6524
x = 6524
x = x+6*10
 */

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        System.out.println("Original Number :"+n);
        while(n>0)
        {
            int temp = n%10;
            r = r*10+temp;
            n = n/10;
        }
        System.out.println("Reversed Number :"+r);
        sc.close();                
    }
    
}

