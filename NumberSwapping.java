import java.util.*;
class SwapNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=sc.nextInt();
                System.out.println("enter another number: ");
                        int b=sc.nextInt();
                        int temp=a;
                        a=b;
                        b=temp; 
                        System.out.print("After swapping: ");
                        System.out.println("a : "+a);
                        System.out.println("b : "+b);




    }
}