import java.util.*;
public class EmailString{

public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an email: ");
    String word=sc.next();
    System.out.println("The email is: "+word);
    int index=word.indexOf("@");
    String result=word.substring(0,index);
    System.out.println("Username: "+result);


}
}