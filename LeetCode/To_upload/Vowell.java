import java.util.Scanner;
public class Vowell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.close();
        char[] vowell = {'a','e','i','o','u','A','E','I','O','U'};
        boolean Vowell = false;
        for(int i=0;i<vowell.length;i++)
        {
            if (c==vowell[i]) {
                Vowell = true;                                
            }
        }
        System.out.println(Vowell);                
    }    
}
//WAP to count the number of vowell in a string
//.charAt() for loop