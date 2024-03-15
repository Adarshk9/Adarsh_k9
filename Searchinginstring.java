//package LeetCode.To_upload;
/*
Adarsh
I want to check whether a character is present or not
arr.length - length of array
string.length() - length of String


name = Keyboard
i = 0
name.chatAt(i) - K!=k ASCII

 */
import java.util.Scanner;
public class Searchinginstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String name = sc.next();
        System.out.print("Enter a target character :");
        char target = sc.next().charAt(0);
        System.out.println(search(name, target));
        sc.close();
        
    }
    static boolean search(String name,char target)
    {
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }
    
}
