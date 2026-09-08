import java.util.*;
public class CumulativeLength{

public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many elements you want: ");
    int n=sc.nextInt();
    String array[]=new String[n];
    for(int i=0;i<n;i++){
        array[i]=sc.next();
    }
    int total=0;
    for(int i=0;i<n;i++){
        total+=array[i].length();

    }
    System.out.println(total);


    
}
}
