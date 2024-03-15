//package LeetCode.To_upload;

public class vowellcount {
    public static void main(String[] args) {
        String name = "Kailash";
        System.out.println(countvowell(name));
    }
    static int countvowell(String name)
    {
        int count = 0;
        String vowell = "AEIOUaeiou";
        for(int i=0;i<name.length();i++)
        {

            char ch = name.charAt(i); // K
            for(int j=0;j<vowell.length();j++)
            {
                if(vowell.charAt(j)==ch)
                {
                    count++;
                }
            }
        }
        return count;

    }
    
}
