/*
String - collection of characters
String name = "Adarsh" 
Datatype reference_variable = object
char c = 'a'
stack -> heap
Inside heap a pool is created in which all the character of stirng lies


Create another variable with different pool
If you want to check for the values for object use .equals() method
.equals() method does not care about reference variable
 
String name = "Adarsh";
        String name2 = new String("Adarsh");  
        System.out.println(name==name2); 
        System.out.println(name.equals(name2));
        // Because == operator check for the object inside heap
        // .equal() check for the value

Only '+' operand can be used with string
        */

public class Stringg {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        
        //System.out.println(a+b);
        System.out.println(a+b);
        //ASCII - American standard code for information interchange


        
    }    
}
