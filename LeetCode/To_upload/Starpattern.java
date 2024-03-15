/*
Approach - 
1. Outer loop will run for the number of rows time
2. 

Pattern 1:
****
****
****
****
Pattern 2:
* 1
** 2
*** 3
**** 4
***** 5
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        sout("*")
    }
    sout
}


Pattern 3:
***** 1   5-0
****2     5-1
***3      5-2
**4
*5

for(int i=1;i<=5;i++)
{
    for(int j=1;)
}

Pattern4 - 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Pattern 5:
n = 5 - 9
4
n = 2*n-1
n = 5*2-7 = 3

*1
**2
***3
****4
*****5
****6 2*n-i 2*5-6 = 4
***7 2*5-7 = 3
**8
*9

pattern6:
    *1 1 - 4 start = i 
   **2 2 - 3 space = n-i
  ***3
 ****4
*****5

pattern 7 :
*****
 ****
  ***
   **
    *
Pattern 8 
2*row-1
2*1-1 = 1
2*2-1 = 3
3*2-1 = 5
1    *1
2   ***3
3  *****5
4 *******7
5*********9

Pattern 9:
n = 5
i = 1 columns = 2*(n-space)-1 =  

********* 
 ******* 
  *****
   ***
    *
How many lines? - Outer loop
Inner loop (columns and spaces) - formula
Outer loop will run for 5 times
for(int i=1;i<=5;i++)
{
    for(int space = 0;space<=n-1;space++)
    {
        int space= i-1 //1
        for(int k=1;k<=space;k++)
        {
            sout(" ")
        }


    }
}

 Pattern12:
    n = 5
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

Pattern13:
         *
        * *
       *   *
      *     *      

      *********
Outer loop - 5 times
space = n-i
int n=4
for(int i=1;i<=4;i++)
{
    int innerspace = 1;
    int space = n-i
    for(int k=1;k<=space;k++)
    {
        sout(" ")
    }
    sout("*")
    if(i!=1)
    {
        for(int k=1;k<=innerspace;k++)
        {
            sout(" ")
        }
        innerspace = innerspace+2;
        sout("*")        
    }
    else{
        sout("*")
    }
}

Pattern 13:
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      ********** 
(n-i)+1

*/
public class Starpattern {
    public static void main(String[] args) {
        pattern14();
        pattern15();
        //pattern8();
               
    }
    static void pattern15()
    {
        int innerspace = 8;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int star = i;
            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            if(i!=n)
            {
                for(int k=1;k<=innerspace;k++)
                {
                    System.out.print(" ");
                }
                innerspace-=2;
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern14()
    {
        int innerspace = 2;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int star = (n-i)+1;
            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            if(i!=1)
            {
                for(int k=1;k<=innerspace;k++)
                {
                    System.out.print(" ");
                }
                innerspace+=2;
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern12()
    {
        int n=4;
        int innerspace = 1;
        for(int i=1;i<=4;i++)
        {            
            int space = n-i;
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            if(i!=1)
            { 
                System.out.print("*");               
                for(int k=1;k<=innerspace;k++)
                {
                    System.out.print(" ");
                }
                innerspace = innerspace+2;
                System.out.println("*");        
            }
            else{
                System.out.println("*");
            }            
        }
        //System.out.print(" ");
        for(int l=1;l<=n+3;l++)
            {
                System.out.print("*");
            }        
    }
    static void pattern11()
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            int space = i-1;
            for(int k=1;k<=space;k++)
            {
                System.out.print("  ");
            }
            int totalnumberofcol = 2*(n-space)-1;
            for(int j=1;j<=totalnumberofcol;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int k=1;k<=space;k++)
            {
                System.out.print("  ");
            }
            int totalnumberofcol = 2*i-1;
            for(int j=1;j<=totalnumberofcol;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern9()
    {
       int n=5;
        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int k=1;k<=space;k++)
            {
                System.out.print("  ");
            }
            int totalnumberofcol = 2*i-1;
            for(int j=1;j<=totalnumberofcol;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        } 
    }
    static void pattern8()
    {
        /*
           *
          ***
         *****
        *******
       *********  
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            for(int k=1;k<=space;k++)
            {
                System.out.print("  ");
            }
            int totalnumberofcol = 2*i-1;
            for(int j=1;j<=totalnumberofcol;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7()
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            int Space = n-i;
            for(int k = 0;k<=Space;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-Space;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int Space = n-i;
            for(int k = 0;k<=Space;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5()
    {
        int n=5;
        for(int i=1;i<=2*n-1;i++)
        {
            int totalnumberofcol = i>n ? 2*n-i :i;
            for(int j=1;j<=totalnumberofcol;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3()
    {
        for(int i=0;i<=5;i++){
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
