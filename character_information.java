import java.util.*;
class CharacterInformation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        int value=ch;
        System.out.println("ASCII code:  "+ch);
                System.out.println("value  "+value);

       
        System.out.println("the next character: "+(char)(value+1));
        

    }
}