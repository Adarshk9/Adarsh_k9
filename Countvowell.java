public class Countvowell {
    public static void main(String[] args) {
        String name = "Aditya";
        System.out.println(count(name));        
    }
    static int count(String name)
    {
        int count = 0;
        for(int i=0;i<name.length();i++)
        {
            if(check(name.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    static boolean check(char c)
    {
        char[] vowell = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<vowell.length;i++)
        {
            if(c==vowell[i])
            {
                return true;
            }
        }
        return false;        
    }
    
}
