import java.util.*;
public class ChangeString{

public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string you want: ");
    String word=sc.next();
    System.out.println("Original: "+word);
    String result=" ";
    boolean found=false;
    for(int i=0;i<word.length();i++){
        result=word.replace("e","i");
        found=true;
    }
    System.out.println("Result: "+result);

        if(found==false&&word.equals(result)){
            System.out.println("Result: "+word);
        }

       

    }
    

    
    }


