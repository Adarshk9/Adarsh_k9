public class CaseConversion2 {
    public static void main(String[] args) {
        String name = "Aditya";
        System.out.println(convertt(name));
        
    }
    static String convertt(String name)
    {
        String convertedString = ""; //Aditya A a
        for(int i=0;i<name.length();i++)
        {           
            convertedString = convertedString + String.valueOf(convert(name.charAt(i)));                                
        }
        return convertedString;
    }
    static char convert(char name)
    {
        if(name>=65 && name<=90)
        {
            return name += 32;
        }
        else{
            return name-=32;
        }
    }
    
}
// c 
// String.valueOf(c);
// WAP to convert all letter to lower case
