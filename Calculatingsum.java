import java.util.Scanner;
/* WAP to print sum of negative integer sum of positive even 
   integer sum of positive odd integer the program end when the 
user enter 0 (Big Version of 3rd Ques) 
 */
public class Calculatingsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive_even = 0;
        int positive_odd = 0;
        int negative = 0;
        while(true)
        {
            int x = sc.nextInt();
            if(x==0)
            {
                break;
            }
            if(x>0)
            {
                if(x%2==0)
                {
                    positive_even+=x;
                }
                else{
                    positive_odd+=x;
                }
            }
            else{
                negative+=x;
            }
        }
        System.out.println("Positive Even = "+positive_even);
        System.out.println("Positive odd  = "+positive_odd);
        System.out.println("Negative Number : "+(-negative)); 
        sc.close();       
    }    
}
