import java.util.*;
class SmartCalculator{
    public static int calculateOperation(int a,int b,char op){
        switch(op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;  
            default:
                System.out.println(" Choose a valid operator.");
                return 0;                
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a =sc.nextInt();
        System.out.println("Enter another number: ");
        int b=sc.nextInt();
        System.out.println("Enter operator(+,-,*,/,%): ");
        char op=sc.next().charAt(0);
        int x=calculateOperation(a, b, op);
        System.out.println(x);


    }
}