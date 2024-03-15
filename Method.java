/*
Function is used for the reusability of program
Syntax = 
static void func_name()
{
    code
}

Return type = void , int , double , boolean , string , int[] , int[][] , char
void can be called directly to call other we have to use System.out.print()

parameter : Something that we pass in between method paranthesis 

Average n number using method

Sum of N number / N
12+12+12/3 = 12.0


Variable Length Arguments 
When we have to pass undefinite number of parameter

By default variable length argument stores the value in array 
we can use method that having Varargs without any argument 

Method overloading = A program can have more than one number of method with same name but the condition is that 
it have different return type or different parameters(in number or in data types)
 */


public class Method {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        fun();
        fun("fun called");
        fun(1,2,3);
               
              
    }
    static void fun()
    {
        System.out.println("fun() called");
    }
    static void fun(String s)
    {
        System.out.println(s);
    }
    static void fun(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    
    
    
}

/*
public class Method {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        Varargs(7);        
              
    }
    static void Varargs(int x,int ...v)
    {
        int sum=x;
        for(int i=0;i<v.length;i++)
        {
            sum+=v[i];
        }
        System.out.println(sum);
    }
    static void even(int x)
    {
        System.out.println(x);
    }
    
    
    
}



public class Method {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Average(n));      
    }
    static double Average(int n)
    {
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int temp = sc.nextInt();
            sum+=temp;
        }
        sc.close();
        return sum/n;
    }
    
    
}


import java.util.*;
public class Method {
    public static void main(String[] args) {
        sum();
        
    }
    static void sum()
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);

        sc.close();
    }
    
}
 */
