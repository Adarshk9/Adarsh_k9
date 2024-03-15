public class Pattern {
    public static void main(String[] args) {
        pattern5();               
    }
    static void pattern5()
    {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
            System.out.print(" ");
        }
        for (int k=1;k<=i;k++){
            System.out.print("*");

        }
        System.out.println();
    }
}
    static void pattern4()
    {
        int n=6;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern3(){
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            int space = n-i;
            int col = 2*i-1;
            if(i!=n/2+1)
            {
                for(int printspace = 1; printspace<=space; printspace++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=col;j++)
                {
                    System.out.print("*");
                }
            }
            else{
                for(int printspace = 1; printspace<=space; printspace++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=col;j++)
                {
                    if(j==col/2+1)
                    {
                        System.out.print("A");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static int ch = 64;
    static int c = 0;
    static void pattern1()
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=i;j++)
                {
                    c = c+1;
                    System.out.print(c+" ");
                }
            }    
            else{
                for(int j=1;j<=i;j++)
                {
                    ch = ch+1;
                    System.out.print((char)ch);
                    System.out.print(" ");
                }
            }
            System.out.println();         
        }
        
    }
    static void pattern2()
    {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            int mid = n/2;
            if(i!=mid)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("* ");
                }
            }else{
                for(int j=0;j<n;j++)
                {
                    if(j==mid)
                    {
                        System.out.print("A ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
