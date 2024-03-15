/*
65 - 90 Capital Letter
97 - 122 - Small letter

WAP to convert all the capital to small and small to capital in a string

*/
import java.util.Scanner; 
public class Caseconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        sc.close(); 
        if(name>=65 && name<=90)
        {
            name += 32;
        }
        else{
            name-=32;
        }
        System.out.println(name);
        
    }   
}
