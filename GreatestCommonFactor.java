import java.util.*;

class GreatestCommonFactor {
    public static void gcdCalculate(int x,int y){
        int r;
        do { 
        r=x % y;
        x=y;
        y=r;    
        } while (r!=0);
        System.out.println("GCD: "+x);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        gcdCalculate(x, y);
    }
}