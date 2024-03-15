public class Leetcode1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
        
    }
    static boolean halvesAreAlike(String s) {
        int firsthalf = countvowell(s, 0, (s.length()/2)-1);
        int secondhalf = countvowell(s, s.length()/2, s.length()-1);
        if(firsthalf==secondhalf)
        {
            return true;
        }        
        else{
            return false;
        }
    }
    static int countvowell(String s,int start,int end)
    {
        int count = 0;
        for(int i=start;i<=end;i++)
        {
            if(check(s.charAt(i)))
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
            if(vowell[i]==c)
            {
                return true;
            }
        }
        return false;
    }
    
}
