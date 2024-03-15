/*
["Ram","Mohan","Jonny","David"]
package LeetCode;

public class SearchinginString {
    public static void main(String[] args) {
        String[] names = {"Ram","Mohan","Jonny","David"};
        String target = "Mohandfjdsh";
        System.out.println(search(names, target));
                
    }
    static boolean search(String[] arr,String target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }

    
}


public class SearchinginString {
    public static void main(String[] args) {
        String name = "Adarsh";
        char target = 'D';
        System.out.println(search(name, target));
                
    }
    static char search(String name,char target)
    {
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==target)
            {
                return name.charAt(i);
            }
        }
        return '-';
        

    }

    
}






Adarsh 
s

a

 */

package LeetCode;

public class SearchinginString {
    public static void main(String[] args) {
        char ch = 'a'; 
        System.out.println(search(ch));       
                
    }
    static boolean search(char ch)
    {
        String vowell = "aeiou";
        for(int i=0;i<vowell.length();i++)
        {
            if(ch==vowell.charAt(i))
            {
                return true;
            }
        }
        return false;

    }

    
}
