/*
 31 - 1,3,5,7,8,10,12
 30 - 4,6,9,11
 */
import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("UNITS : ");
        int unit = sc.nextInt();
        System.out.println("Month :");
        int month = sc.nextInt();
        System.out.println("Year :");
        int year = sc.nextInt();
        sc.close();
        int days=0; //7

        for(int i=1;i<=12;i++)
        {
            if(i==month)
            {            
            if(i==2)
            {
                if(year%4==0)
                {
                    days = 28;
                }
                else{
                    days = 29;
                }
            }
            if(i<=7 && i!=2)
            {
                if(i%2==0)
                {
                    days = 30;
                }
                else{
                    days = 31;
                }
            }
            if(i>7 && i!=2)
            {
                if(i%2==0)
                {
                    days = 31;
                }
                else{
                    days = 30;
                }
            }
        }
        }
        if(month<=12 && month>=1)
        {
            System.out.println(days);
        }
        else{
            System.out.println("Month does not exist!");
        }
        int bill = (unit*9);
        System.out.println("Your electricity bill for the month "+month+"days = "+ days+" is "+ bill);
    }
    
}
