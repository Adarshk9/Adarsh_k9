/*
Count the digits
Har digit me count ko power rakhke plus krna hai 


If the sum of power of digit in each digit is equal to itself then it is armstrong number
 */
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int originalnumber =n;
        double c = count(n); // 3
        double arms = 0; //371  3 digits  3^3 + 7^3 + 1^3 = 371    1^3 + 7^3 + 3^3  = 
        while(n>0)
        {
            double temp=n%10; // 3
            double x = Math.pow(temp,c); // 3^3 = 3*3 = 27
            arms+=x; // arms = 344 + 27 = 371
            n = n/10; // 0 Loop Break;
        }
        if(arms==originalnumber)
        {
            System.out.println("Armstrong Number");

        }
        else{
            System.out.println("Not a armstrong number");
        }
        sc.close();
        
    }
    static double count(int n)
    {
        double c = 0; // C=3 100
        while(n>0)
        {
            c++;
            n = n/10; // n = 0
        }
        return c;
        
    }
        
}

